package main;

public class College {
	int iD;
	String collegeName;
	String address;
	int rank;

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getCollegName() {
		return collegeName;
	}

	public void setCollegName(String collegName) {
		this.collegeName = collegName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public College(int iD, String collegName, String address, int rank) {
		super();
		this.iD = iD;
		this.collegeName = collegName;
		this.address = address;
		this.rank = rank;
	}

	public College() {
		super();
	}

}
