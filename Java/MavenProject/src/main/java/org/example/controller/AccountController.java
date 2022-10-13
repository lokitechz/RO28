package org.example.controller;

import org.example.entity.Account;
import org.example.service.AccountService;

import java.sql.SQLException;

/**
 * Class chưa việc điều hướng những yêu cầu (request) từ người dùng
 */
public class AccountController {

	private final AccountService accountService;

	public AccountController(AccountService accountService) {this.accountService = accountService;}

	public Account createAccount(Account request) {
		Account account = new Account();
		try {
			account = accountService.createAccount(request);
		} catch (RuntimeException | SQLException e) {
			System.out.println("Tạo mới account không thành công " + e.getMessage());
		}
		return account;
	}

}
