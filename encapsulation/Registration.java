package encapsulation;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

		Student ostudent = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the details");		
		ostudent.setAdmissionID(scan.nextInt());
		ostudent.setName(scan.next());
		ostudent.setMobileNumber(scan.nextInt());
		ostudent.setEmail(scan.next());
		System.out.println("name is :"  +ostudent.getName());
		System.out.println("Email is :"  + ostudent.getEmail());
		System.out.println("Mobile number is :"  + ostudent.getMobileNumber());
		System.out.println("Admission id is :" + ostudent.getAdmissionID());

	}

}
