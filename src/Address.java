public class Address {
	

	private String StreetAddress;  
	private String City; 
	private String PostCode; 
	private String Country;
	
	public Address() {

	}

	public String getStreetAddress() {
		return StreetAddress;
	}

	public void setStreetAddress(String streetAddress) throws MufasaException {
		String characters = "^[a-zA-Z0-9 ]*$";
		boolean check = streetAddress.matches(characters);
		if(check == true){
			StreetAddress = streetAddress;
		}else{
			throw new MufasaException("Error in street address");
		}
		
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) throws MufasaException {
		String characters = "^[A-z]+$";
		boolean check = city.matches(characters);
		if(check == true){
			City = city;
		}else{
			throw new MufasaException("Error in city");
		}
	}

	public String getPostCode() {
		return PostCode;
	}

	public void setPostalCode(String postCode) throws MufasaException {
		String characters = "^[0-9-]+$";
		boolean check = postCode.matches(characters);
		if(check == true){
			PostCode = postCode;
		}else{
			throw new MufasaException("Error in post code");
		}
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) throws MufasaException {
		String characters = "^[A-z]+$";
		boolean check = country.matches(characters);
		if(check == true){
			Country = country;
		}else{
			throw new MufasaException("Error in country");
		}
	}

}