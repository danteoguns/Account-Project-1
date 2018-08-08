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
	}

}
