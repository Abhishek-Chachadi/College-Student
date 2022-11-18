package main;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		// System.out.println("My Practice Session, Creating all the classes");

		// Sample Program to check if my Classes work
		College RV = new College(1, "RV College of Engineering", "Mysore Road, Bangalore", 76);

		Student Abhi = new Student(1, "Abhishek", "Chachadi", LocalDate.of(1999, Month.NOVEMBER, 29), "Mahantesh Nagar",
				"HAHAHAHAHA sucker, not putting it", RV, 9.32);

		System.out.printf(
				"Hi I am %s, and I am still a noob at everything. This is just a sample initial code and i will add everything once I am out of here",
				Abhi.getLastName());
		
		System.out.println();
		System.out.println("Putting the whole details just to test");
		
		System.out.printf(" %d: %s %s %d", RV.getiD(), RV.getCollegName(), RV.getAddress(), RV.getRank());
		System.out.println();
		System.out.println("And my Details");
		System.out.printf(
				"%d %s %s %s and living in %s, you can easily contact through: %s and the College I Studied is %s. Passing with average GPA of%3.2f ",
				Abhi.getiD(), Abhi.getFirstName(), Abhi.getLastName(),
				Abhi.getDOB().toString(),
				Abhi.getAddress(), Abhi.getPhoneNumber(), Abhi.getCollege().getCollegName(),
				Abhi.getGPA());
	}
}
