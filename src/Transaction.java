
public class Transaction {
	private MufasaCreateAccount account;
	private MufasaAddress address;
	private MufasaTransaction transaction;

	public MufasaCreateAccount getAccount() {
		return account;
	}

	public void setAccount(MufasaCreateAccount account) {
		this.account = account;
	}

	public String getTransactionResult() {
		if(getAddress() != null && getAccount() != null
				){
			return "Transaction Passed";
		}else{
			return "Transaction Failed";
		}	
	}

	public MufasaAddress getAddress() {
		return address;
	}

	public void setAddress(MufasaAddress address) {
		this.address = address;
	}

	public MufasaTransaction getTransaction() {
		return transaction;
	}

	public void setTransaction(MufasaTransaction transaction) {
		this.transaction = transaction;
	}

}
