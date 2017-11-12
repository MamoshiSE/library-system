package Libary;

public class Address {
	
	private String streetNum;
	private String zipCode;
	private String city;
	private String country;
	


	public Address(String streetName, String streetNum, String zipCode, String city, String country) {
		StreetName = streetName;
		this.streetNum = streetNum;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
	}
	
	private String StreetName;
	public String getStreetName() {
		return StreetName;
	}



	public void setStreetName(String streetName) {
		StreetName = streetName;
	}



	public String getStreetNum() {
		return streetNum;
	}



	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}



	public String getZipCode() {
		return zipCode;
	}



	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	
}

