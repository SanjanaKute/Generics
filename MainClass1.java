package core.java.genericsAssignment;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

class Employee
	  {
		private int id;
		private String name;
		private int salary;
		private String department;
		
		public Employee(int id ,String name, int salary, String department) {
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.department=department;
			
		}
		public void displayDetails()
		{
			int id;
			int name;
			int salary;
			int department;
		}
		@Override
	    public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ",salary=" + salary + ", department=" + department + "]";
	    }
	}
public class MainClass1 
	{
		public static void main(String[] args) 
		{
			
		
		Employee e1  = new Employee(1,"Jhon", 2000, "HR");
		Employee e2  = new Employee(2,"Garry", 3000, "IT");
		Employee e3  = new Employee(3,"Ken", 4000, "Manager");
		Employee e4  = new Employee(4,"Dylan", 5000, "BU");
		Employee e5  = new Employee(5,"Bob", 7700, "Traning");

		HashSet<Employee> sEmp = new HashSet<Employee>();
		{
		sEmp.add(e1);
		sEmp.add(e2);
		sEmp.add(e3);
		sEmp.add(e4);
		sEmp.add(e5);

		
		/*java.util.Iterator<Employee> i=sEmp.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		{
		for(Employee e : sEmp)
		{
		    System.out.println(e);
		}
		

		
	    }
	    }

		}
	}

