package asm2;

import entity.Account;

public class DemoObject {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		for (Account account : accounts) {
			System.out.println(account.fullName);
		}
	}

}
