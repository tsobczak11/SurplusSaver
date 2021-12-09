package location.domain;

/**
 * Location object
 * 
 * @author Aayush Makharia
 * Modified by Ryan Thommes
 * 
 */
public class Location {
	/*
	 * Correspond to the user table
	 */
	
	private String location_id;
	private String street; 
	private String city;
	private String state;
	private String country;



	public String getLocation_id() {
		return location_id;
	}


	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return street;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}

	
	public String getCountry() {
		return state;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
