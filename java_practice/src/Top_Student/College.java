package Top_Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;





public class College {

	Student1 student1;
	
	public College(Student1 student1) {
		super();
		this.student1 = student1;
	}

	
	public Student1 getStudent1() {
		return student1;
	}


	public static void main(String[] args) {
		 ArrayList<Student1> al=new ArrayList<Student1>();
			HashMap<String, java.lang.Integer> map1= new HashMap<String, java.lang.Integer>();
			HashMap<String,java.lang.Integer> map2=new HashMap<String, java.lang.Integer>();
			HashMap<String,java.lang.Integer> map3=new HashMap<String, java.lang.Integer>();
		HashMap<String,java.lang.Integer> map4=new HashMap<String, java.lang.Integer>();
		HashMap<String,java.lang.Integer> map5=new HashMap<String, java.lang.Integer>();
		map1.put(Constant_class.Math_key,90);
		map1.put(Constant_class.English_key,90);
		
		map4.put(Constant_class.Math_key,70);
		map4.put(Constant_class.English_key,70);
		
		map2.put(Constant_class.English_key,80);
		map2.put(Constant_class.Math_key,80);
		
		map3.put(Constant_class.English_key,60);
		map3.put(Constant_class.Math_key,60);
		map5.put(Constant_class.English_key,50);
		map5.put(Constant_class.Math_key,50);
		
			
		Student1 s1=new  Student1("shweta",map1);
		Student1 s2=new  Student1("Archana",map2);
		Student1 s3=new Student1("Astha", map3);
		Student1 s4=new Student1("Bickee", map4);
		
		Student1 s5=new Student1("Nirbha", map5);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
	java.util.Collections.sort(al,new SortbyMap());
	for(int i=0;i<=3;i++)
	{
		System.out.println(al.get(i));
	}
		
	
		
	
		
		
	}

}

 class SortbyMap implements Comparator<Student1>
{



        public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		System.out.println(o1.getMap().get(Constant_class.Math_key));
		int k= -o1.getMap().get(Constant_class.Math_key).compareTo(o2.getMap().get(Constant_class.Math_key));
		System.out.println(k);
		return k;
	}
 
	
	
	
	}

