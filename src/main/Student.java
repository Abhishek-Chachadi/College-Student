package main;

import java.time.LocalDate;

public class Student {

	int iD;
	String firstName;
	String lastName;
	LocalDate DOB;
	String address;
	String phoneNumber;
	College college;
	double GPA;
	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}



	public Student() {
		super();
	}


	public Student(int iD, String firstName, String lastName, LocalDate dOB, String address, String phoneNumber,
			College college, double gPA) {
		super();
		this.iD = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.college = college;
		GPA = gPA;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
// Getters and Setters , Constructors based on the fields has been created
}
