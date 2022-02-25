package org.sample;

//import java.util.Scanner;

public class WorkOut {
	
	private void empInfo() {
	 System.out.println("My employee info");

	}
	private void empInfo(String name)
	{
	System.out.println("My employee name is " +name);
	}
	private void empInfo(int id)
	{
	System.out.println("My employee id is " +id);
	}
	private void empInfo(String Address, int phnp, char gender)
	
	{
	System.out.println("My employee coming from " +Address + " his phone num is " +phnp + " he is a " +gender);
	}
	
	
	private void empInfo(int phnp,String Address,  char gender)
		
		{
		System.out.println("Emp coming from " +Address + " his phone num is " +phnp + " he is a " +gender);
		}
		public static void main(String[] args) {
			WorkOut e = new WorkOut();
			Work w = new Work();
			w.clientInfo("TCS");
			w.clientInfo(12);
			
		
			e.empInfo();
			e.empInfo(23);
			e.empInfo("Ragu");
			e.empInfo(1234567890, "Chennai", 'M');
			e.empInfo("chennai", 1276543210, 'F');
		
			
		}
	}

