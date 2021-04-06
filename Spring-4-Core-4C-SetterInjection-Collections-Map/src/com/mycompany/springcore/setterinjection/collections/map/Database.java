package com.mycompany.springcore.setterinjection.collections.map;

import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Database {
private Map dbMap;
public void setDbMap(Map dbMap) {
	this.dbMap=dbMap;
}
public void show()
{
	Set set=dbMap.entrySet();
	Iterator it=set.iterator();
	while(it.hasNext()) {
		Map.Entry me=(Map.Entry)it.next();
		System.out.println(me.getKey()+"-"+me.getValue());
	}
}
}
