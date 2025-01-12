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

	// not-recommended to use optional parameters!
	void print(Optional<Account> optional) {
//		System.out.println(optional.name);
		// not-recommended use functional style with ifPresent
		if (optional.isPresent())
			System.out.println(optional.get().name);
		optional.ifPresent(account -> System.out.println(account.name));
	}

	static class Account {
		String name;
	}

}
