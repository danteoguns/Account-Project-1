package NewApp;

import Feature.Account;
import Feature.Service;
import json.JsonConvertion;

public class App {

	public static void main(String[] args) {

		Service Feature = new Service();

		JsonConvertion json = new JsonConvertion();

		Account BobBobson = new Account("Bob", "Bobson", "1");

		Account BillBillson = new Account("Bill", "Billson", "2");

		Feature.countServiceFromMap(BobBobson);

		Feature.countServiceFromMap(BillBillson);

		String jsonInString = json.getObject(Feature.getAccountMap());
		System.out.println(jsonInString);

		String FN = json.getObject(Feature.getFirstName("Bill"));
		
		String LN = json.getObject(Feature.getLastName("Bobson"));
		
		String Acc = json.getObject(Feature.getAccountNumber("1"));
		
		String Iter = json.getObject(Feature.getFNIterator("Bob"));
		
	
		
		
		System.out.println(FN);
		System.out.println(LN);
		System.out.println(Acc);
		System.out.println(Iter);
		
	}

}
