package Practise;

public class FirstClass {

	public static void main(String[] args) {
		
		String name = "Kirtan";
		String lName = "Chaurasia";
		int salary = 6500;
		int tax = 350;
		int insu = 280;
		int incent = 1200;
		int totSalary = salary - tax - insu + incent;
		
		System.out.println("Employee Name : " +name +" " +lName);
		System.out.println("Salary        : " +salary);
		System.out.println("Tax           : " +tax);
		System.out.println("Insurance     : " +insu);
		System.out.println("Incentive     : " +incent);
		System.out.println("=================================");
		System.out.println("Total Salary  : " +totSalary);
		System.out.println("---------------------------------");

	}

}
