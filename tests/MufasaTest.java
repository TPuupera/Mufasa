import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import org.easymock.EasyMock;

public class MufasaTest {
	MufasaCreateAccount teppo;
	MufasaAddress userAddress;
	MufasaTransaction transaction;
	Transaction info;
	MufasaBasicData BasicData;
	
	@Before
	public void setup() throws MufasaException{
		
		info = new Transaction();
		teppo = EasyMock.createMock(MufasaCreateAccount.class);
		info.setAccount(teppo);
		
		userAddress = EasyMock.createMock(MufasaAddress.class);
		info.setAddress(userAddress);
		
		transaction = EasyMock.createMock(MufasaTransaction.class);
		info.setTransaction(transaction);
	}

	@Test
	public void test() throws MufasaException, ParseException {

		MufasaBasicData newUser = new MufasaBasicData();
		
		newUser.setFirstName("Teppo");
		newUser.setLastName("Testaaja");
	    newUser.setUsername("teppo_testaaja");
		newUser.setPassword("---///Ab c*", "---///Ab c*");
		newUser.setPhoneNumber("082162628276");
		newUser.setBirthdate("01/06/1995");
		newUser.setCountry("Finalnd");
		newUser.setEmail("mufasa@thissucks.com", "mufasa@thissucks.com");
		
		EasyMock.expect(teppo.getAccount()).andReturn(newUser);
		EasyMock.replay(teppo);

		Address newAddress = new Address();
		
		newAddress.setStreetAddress("Shithole 2");
		newAddress.setCity("Oulu");
		newAddress.setPostalCode("90570");
		newAddress.setCountry("Finland");
		
		EasyMock.expect(userAddress.getAddress()).andReturn(newAddress);
		EasyMock.replay(userAddress);

		EasyMock.expect(transaction.getTransactionResult()).andReturn(3);
		
		String result = info.getTransactionResult();
		
		
		assertEquals("Transaction Passed", result);
	}

}
