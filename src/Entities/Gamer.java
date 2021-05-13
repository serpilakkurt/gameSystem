package Entities;

import java.util.Date;

public class Gamer {

	public int id;
	public String firstName;
	public String laastName;
	public Date DateOfBirth;
	public String nationalityId;
	
	
	public Gamer() {

	}
	
	
	public Gamer(int id, String firstName, String laastName, Date dateOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.laastName = laastName;
		DateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLaastName() {
		return laastName;
	}
	public void setLaastName(String laastName) {
		this.laastName = laastName;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
}
