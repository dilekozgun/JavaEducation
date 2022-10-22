package javaEducation3;

public class Company extends Customer {
	public String taxNumber;
	public String nationalIdentity;

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

}
