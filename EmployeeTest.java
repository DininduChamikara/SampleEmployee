import java.util.Scanner;

class EmployeeTest{

	public static void main(String []args){

		Employee e1 = new Employee("Dinindu","Chamikara",100000);
		e1.printDetails();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first name to change :");
		String fname = sc.nextLine();

		System.out.print("Enter last name to change :");
		String lname = sc.nextLine();

		System.out.print("Enter New Salary :");
		double sal = sc.nextDouble();

		e1.set_fName(fname);

		e1.set_lName(lname);

		e1.set_mSalary(sal);

		e1.incriment(sal);

		e1.printDetails();

	}
	
}