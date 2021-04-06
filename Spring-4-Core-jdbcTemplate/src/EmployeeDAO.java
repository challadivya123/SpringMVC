import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO {
private DataSource dataSource;
public void setDataSource(DataSource dataSource) {
	this.dataSource=dataSource;
}
public void storeData(Employee employee) throws org.springframework.dao.DataAccessException{
	//user defined method
	String query="insert into Employee values("+employee.getId()+",\"+ employee.getName()+'\',"+employee.getAge()+")";
			JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	int rowCount=jdbcTemplate.update(query);
	if(rowCount!=0) {
		System.out.println("Employee saved with id="+employee.getId());
	}else System.out.println("Employee data failed with id="+employee.getId());
	
	}//end of storeData() method



/****************************/
public Employee getById(int id) {
	String query="select id,name,age from Employee where id=?";
	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
//using RowMapper anonymous class,we can create a separate RowMapper for reuse
	Employee emp=(Employee)jdbcTemplate.queryForObject(query, new Object[] {id},new RowMapper() {
		//Object[] array-{id}:as value assigned to array
		//String str[]=new String[]{"welcome"}
		
		public Employee mapRow(ResultSet rs,int rowNum)throws SQLException{
			Employee emp=new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setAge(rs.getInt("age"));
			return emp;
		}});
	return emp;
		}
	


/*******************************/
public void update(Employee employee) {
	String query ="update Employee set name=?,age=?where id=?";
	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	Object[] args=new Object[] {employee.getName(),employee.getAge(),employee.getId()};
	int rowCount=jdbcTemplate.update(query,args);
	if(rowCount!=0) {
		System.out.println("Employee data updated");
	}else
		System.out.println("No Employee found with id="+employee.getId());
	}

/**********************/
public void deleteById(int id) {
	String query="delete from Employee where id="+id;
	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	System.out.println("Delete by id!!");
	int rowCount=jdbcTemplate.update(query);
	if(rowCount!=0) {
		System.out.println("Employee deleted with id="+id);
	}else System.out.println("No Employee found with id="+id);
	
	}


/**********************/
public List<Employee> getAllEmployeeDetails(){
	String query="select id,name,age from Employee";
	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	List<Employee> empList=new ArrayList<Employee>();
	
	List<Map<String,Object>>empRows=jdbcTemplate.queryForList(query);
	for(Map<String,Object>empRow:empRows) {
		Employee emp=new Employee();
		emp.setId(Integer.parseInt(String.valueOf(empRow.get("id"))));
		emp.setName(String.valueOf(empRow.get("name")));
		emp.setAge(Integer.parseInt(String.valueOf(empRow.get("age"))));
		empList.add(emp);
	}
	return empList;
}
}




