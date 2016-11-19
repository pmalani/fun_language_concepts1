package j;

import java.util.Optional;

public class Concept90_3 {
	
	void print(Account account) {
		System.out.println(account.name);
	}
	
	void safePrint(Account account) {
		if (account != null)
			System.out.println(account.name);
	}
	
	void print(Optional<Account> optional) {
//		System.out.println(optional.name);
		if (optional.isPresent())
			System.out.println(optional.get().name);
	}

	static class Account {
		String name;
	}
}
