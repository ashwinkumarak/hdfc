package org.test;

public class Test {
	public void empDetails() {
System.out.println("This is emp Details");

	}
public void empdetails(int rollnumber, int empId) {
	System.out.println("the roll number is "+ rollnumber);
	System.out.println("The Emp ID is"+ empId);
}


public void EmpDetails(int age) {
System.out.println("The age is "+age);
}


public void empdetails(String name) {
System.out.println("THE Name is "+name);
}


public void empDetails(long Phno , float salary) {
System.out.println("The phno is"+Phno );
System.out.println("The salary is"+salary);
}


public void empDetails(float salary, long phno) {
	System.out.println("The phno is"+phno);
	System.out.println("The salary is"+salary);
}


public static void main(String[] args) {
	Test t = new Test();
	t.empDetails();
t.empdetails(123456789,2015);
t.EmpDetails(25);
t.empdetails("wasim");
t.empDetails(9094000849l, 65000f);
t.empDetails(65000f, 9876543210l);
}
}



