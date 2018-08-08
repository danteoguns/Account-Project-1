package Feature;

import java.util.Collection;
import java.util.HashMap;
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
		boolean idExsists = account.containsKey(removeThisAccount);
		if (idExsists) {
			account.remove(removeThisAccount);
		}
	}

	public Map<Integer, Account> getAccountMap() {
		return account;
	}

	public Account getAccountID(Integer key) {
		return this.account.get(key);
	}

//	public int getFirstName(String firstNameAccount) {
//		return (int) account.values().stream()
//				.filter(eachAccount -> eachAccount.getFirstName().equals(firstNameAccount)).count();
//	}
//
//	public int getLastName(String LastNameAccount) {
//		return (int) account.values().stream().filter(eachAccount -> eachAccount.getLastName().equals(LastNameAccount))
//				.count();
//	}

	public int getAccountNumber(String userAccountNumber) {
		return (int) account.values().stream()
				.filter(eachAccount -> eachAccount.getAccountNumber().equals(userAccountNumber)).count();

	}
}
