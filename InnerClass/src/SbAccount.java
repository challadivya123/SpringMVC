
public class SbAccount {
String acntHolderName;
float balance;
public SbAccount(String acntHolderName,float balance) {
	this.balance=balance;
	this.acntHolderName=acntHolderName;
}
public void showSbAccountDetails() {
	System.out.println("account holder name="+this.acntHolderName);
	System.out.println("sb account balance="+this.balance);
	
}
public void createRdAccount(float rdBalance) {
	class RdAccount{
		float balance;
		RdAccount(float rdBalance){
			this.balance=rdBalance;
		}
		public void showRdAccountBalance() {
			System.out.println("rd account balance="+this.balance);
		}
		}
	RdAccount rdAccount=new RdAccount(rdBalance);
	rdAccount.showRdAccountBalance();

}

}

