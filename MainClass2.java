package core.java.genericsAssignment;

import java.util.HashMap;

public class MainClass2 <K,V>
{
	public static void main(String[] args)
	{
		HashMap<Integer, Double> h=new HashMap();
		h.put(1,1.1);
		h.put(2,2.2);
		h.put(3,3.3);
		h.put(4,5.4);
		h.put(5,6.5);
		h.put(6,4.6);
		h.put(7,9.7);
		h.put(8,5.8);
		h.put(9,6.9);
		h.put(10,1.10);
		
		System.out.println("Data stored is HashMap is\n:"+h);
		

	}

}
