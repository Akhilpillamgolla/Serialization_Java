package serilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Employee implements Serializable {

	String name;
	int id;
	
	Employee(String name,int id){   //constructor for storing values in instance variable
		this.name = name;    // 
		this.id  = id;
	}
	 
	class SerializeDemo{
		public static void main(String[] args) {
			Employee e1 = new Employee("Akhil",541);
			try {
				FileOutputStream   fout = new FileOutputStream("C:\\aki.ser");  //FOS use to save byte stream .ser extinction for  serialised files  
				ObjectOutputStream out = new ObjectOutputStream(fout);     //we pass FOUT(Reference Variable)  in this  
                out.writeObject(e1);    //we can't pass o/p directly so we use reference variable 
	            out.close();
	            fout.close();
	            System.out.println("Sucess");
			}
			catch(Exception e) {
			   e.printStackTrace();	
			}
			
			}                                                                       
	}
	
	
}
