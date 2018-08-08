package Feature;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Service {

	private Map<Integer, Account> account;

	private int i = 0;

	public Service() {
		account = new HashMap<Integer, Account>();
	}

	public void service() {
		account = new HashMap<Integer, Account>();
	}

	public void countServiceFromMap(Account usersAccount) {
		account.put(i, usersAccount);
		i++;
	}

	public void removeFromMap(Integer removeThisAccount) {
		boolean idExists = account.containsKey(removeThisAccount);
		if (idExists) {
			account.remove(removeThisAccount);
		}
	}

	public Map<Integer, Account> getAccountMap() {
		return account;
	}

	public Account getAccountID(Integer key) {
		return this.account.get(key);
	}

	public Iterator<Account> getFNIterator(String firstNameAccount) {

		return account.values().iterator();

	}

	public int getFirstName(String firstNameAccount) {
		return (int) account.values().stream().filter(eachAccount -> eachAccount.getFirstName().equals(firstNameAccount))
				.count();
	}

	public int getLastName(String lastNameAccount) {
		return (int) account.values().stream().filter(eachAccount -> eachAccount.getLastName().equals(lastNameAccount))
				.count();
	}

	public int getAccountNumber(String userAccountNumber) {
		return (int) account.values().stream()
				.filter(eachAccount -> eachAccount.getAccountNumber().equals(userAccountNumber)).count();
	}
}

// public String getFirstName(String firstNameAccount) {
//
// for (int x = 0; x < account.size();x++) {
// if (account.get(x).getFirstName().equals(firstNameAccount)) {
// System.out.println(firstNameAccount);
// }
//
// }
// return "";
