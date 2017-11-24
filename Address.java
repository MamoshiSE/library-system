package Libary;

public class Address {
	
	private int streetNum;
	private int zipCode;
	private String city;
	private String country;
	


	public Address(String streetName, int streetNum, int zipCode, String city, String country) {
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



	public int getStreetNum() {
		return streetNum;
	}



	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}



	public int getZipCode() {
		return zipCode;
	}



	public void setZipCode(int zipCode) {
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

