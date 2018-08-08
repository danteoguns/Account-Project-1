package NewApp;

import Feature.Account;
import Feature.Service;

public class App {

	public static void main(String[] args) {
		
		Service Feature = new Service();
		
		Account BobBobson = new Account("Bob", "Bobson", "1");
		
		Account BillBillson = new Account("Bill", "Billson", "2");

		Feature.countServiceFromMap(BobBobson);
		
		Feature.countServiceFromMap(BillBillson);
		
		System.out.println(Feature.getAccountMap());
	}

}
