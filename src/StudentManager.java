
import java.util.ArrayList;
import java.util.Iterator;

public class StudentManager {
	private ArrayList<Student> stus=new ArrayList<Student>();
	
	boolean insert(Student stu) {
		//System.out.println("ha");
		if(stus.add(stu))
			return true;
		else 
			return false;
	}

	boolean delete(String name) {
	   boolean re=false;
	   
	   Iterator<Student> it=stus.iterator();
	   Student cur=null;
	   while(it.hasNext()) {
		   cur=it.next();
		   if(cur.getName().equals(name)) {
			   it.remove();
			   re=true;
               break;
		   }
	   }  
	   return re;
	}
	
	Student find(String name) {
		Iterator<Student> it=stus.iterator();
		Student cur=null;
		while(it.hasNext()) {
			cur=it.next();
			if(cur.getName().equals(name)) {
		       break;	
			}
		}
		return cur;
	}
	
	boolean edit(Student newstu,String oriname) {
         boolean re=false;
         
         Iterator<Student> it=stus.iterator();
         Student cur=null;
         while(it.hasNext()) {
        	 cur=it.next();
        	 if(cur.getName().equals(oriname)) {
        		 it.remove();
        		 stus.add(newstu);
        		 re=true;
        		 break;
        	 }
         }
         
         return re;
	}
	
	ArrayList<Student> output(){
		return stus;
	}
	
	
}
