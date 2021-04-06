package com.mycom.springmvc.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycom.springmvc.jdbc.dao.EmpDao;
import com.mycom.springmvc.jdbc.pojo.Emp;

@Controller
public class EmpController {
@Autowired
EmpDao dao;//will inject dao from xml file
/*it displays a form to input date,here"command" is a reserved request attribute
 * which is used to display object data into form
 */
@RequestMapping("/empform")
public String showform(Model m) {
	m.addAttribute("command",new Emp());
	return "empform";
}
/*it saves object into database .The @ModelAttribute puts request data
 * into model object you need to mention Request method post method
 * because default requests is GET*/
 
 @RequestMapping(value="/save",method=RequestMethod.POST)
 public String save(@ModelAttribute("emp")Emp emp,Model m) {
	 dao.save(emp);
	 System.out.println("in /editsave"+emp.getName());
	 List<Emp> list=dao.getEmployees();
	 m.addAttribute("list",list);
	 System.out.println("No of employees:"+list.size());
	 return "viewemp";
	 //return "redirect/viewemp",//will redirect to viewemp request mapping
 }
/*it provides list of employees in model object*/
 @RequestMapping("/viewemp")
 public String viewemp(Model m) {
	 List<Emp> list=dao.getEmployees();
	 m.addAttribute("list",list);
	 System.out.println("No of employees:"+list.size());
	 return "viewemp";
 }
 /*it displays object data into form from the given id.
  * The @PathVariable puts URL data into variable*/
 @RequestMapping(value="/editemp/{id}")
 public String edit(@PathVariable int id,Model m) {
	 Emp emp=dao.getEmpById(id);
	 m.addAttribute("command",emp);
	 return "empeditform";
 }
 /* it updates model object*/
 @RequestMapping(value="/editsave",method=RequestMethod.POST)
 public String edit(@PathVariable int id,@ModelAttribute("emp")Emp emp,Model m) {
 dao.update(emp);
 //new lines of code
 System.out.println("in/editsave"+emp.getName());
 List<Emp> list=dao.getEmployees();
 m.addAttribute("list",list);
 System.out.println("No of employees:"+list.size());
 return "viewemp";
}
/* it deletes record for the given id in url and redirects to /viewemp*/
@RequestMapping(value="/deleteemp/{id}",method=RequestMethod.GET)
public String delete(@PathVariable int id,@ModelAttribute("emp")Emp emp,Model m) {
	//new lines of code
	System.out.println("in/deleteemp"+emp.getName());
	List<Emp> list=dao.getEmployees();
	m.addAttribute("list",list);
	System.out.println("No of employees:"+list.size());
	return "viewemp";
	//return "viewemp";
	//return "redirect:/viewemp";
}
}