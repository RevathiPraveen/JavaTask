package encapsulation;

public class Student {
	
	private int admissionID=12, mobileNumber=99;
	private String email="rev.com", name="rev";
	public int getAdmissionID() {
		return admissionID;
	}
	public void setAdmissionID(int admissionID) {
		this.admissionID = admissionID;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
	

