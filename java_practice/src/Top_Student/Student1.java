package Top_Student;

import java.util.HashMap;



public class Student1 {
	
	public String name;
	public  HashMap<String,Integer> map;
	
	public Student1(String name, HashMap<String,Integer> map1) {
		//super();
		this.name = name;
		this.map = map1;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String, Integer> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
		
		
		
		
	}

	@Override
	public String toString() {
		return this.name+"---- "+map.get(Constant_class.Math_key);
	}
	
	

}

