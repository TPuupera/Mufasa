import java.text.SimpleDateFormat;
import java.text.ParseException;

public class MufasaBasicData {

	private String firstname; 
	private String lastname;
	private String Username;
	private String password;
	private String country;
	private String birthdate;
	private String phonenumber;
	private String email;

	public String getFirstName() {
		return firstname;
	}


	public void setFirstName(String firstName) throws MufasaException {
		String characters = "^[A-z]+$";
		boolean check = firstName.matches(characters);
		if(check == true){
			firstname = firstName;
		}else{
			throw new MufasaException("Error");
		}
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) throws MufasaException {
		String characters = "^[A-z]+$";
		boolean check = lastName.matches(characters);
		if(check == true){
			lastname = lastName;
		}else{
			throw new MufasaException("Error in last name");
		}
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) throws MufasaException {
		String characters = "^[a-zA-Z0-9_?)]{4,15}$";
		boolean check = username.matches(characters);
		if(check == true){
			Username = username;
		}else{
			throw new MufasaException("Error in user name");
		}
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String passwordCheck, String confirmPassword) throws MufasaException {
		String characters = "^[\\p{Print}]{8,}$";
		boolean check = passwordCheck.matches(characters);
		if(check == true && passwordCheck == confirmPassword){
			password = passwordCheck;
		}else{
			throw new MufasaException("Error in password");
		}
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String countryCheck) throws MufasaException {
		String characters = "^[A-z]+$";
		boolean check = countryCheck.matches(characters);
		if(check == true){
			country = countryCheck;
		}else{
			throw new MufasaException("Error in country");
		}
	}

	public String getBirthdate() {
		return birthdate;
	}
	

	public boolean isValidBirthDate(String input) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
	     try {
	          format.parse(input);
	          return true;
	     }
	     catch(ParseException e){
	          return false;
	     }
	}
	
	
	public void setBirthdate(String birthdateCheck) throws MufasaException, ParseException {
		boolean check = isValidBirthDate(birthdateCheck);
		if(check == true){
			this.birthdate = birthdateCheck;
		}else{
			throw new MufasaException("Error in birthday");
		}
	}

	public String getPhoneNumber() {
		return phonenumber;
	}

	public void setPhoneNumber(String phoneNumber) throws MufasaException {
		String characters = "^[0-9]+$";
		boolean check = phoneNumber.matches(characters);
		if(check == true){
			phonenumber = phoneNumber;
		}else{
			throw new MufasaException("Error in phone number");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String emailCheck, String confirmEmail) throws MufasaException {
		String characters = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		boolean check = emailCheck.matches(characters);
		if(check == true && emailCheck == confirmEmail){
			email = emailCheck;
		}else{
			throw new MufasaException("Error in e-mail");
		}
	}

}
