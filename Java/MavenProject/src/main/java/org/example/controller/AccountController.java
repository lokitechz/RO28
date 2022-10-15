package org.example.controller;

import org.example.entity.Account;
import org.example.service.AccountService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Tầng controller chưa việc điều hướng những yêu cầu (request) từ người dùng đến tầng service
 */
public class AccountController {

	private final AccountService accountService;

	public AccountController(AccountService accountService) {this.accountService = accountService;}

	public List<Account> getAccounts() {
		List<Account> accounts = new ArrayList<>();
		try {
			accounts = accountService.getAccounts();
		} catch (RuntimeException | SQLException e) {
			System.out.println("Lấy danh sách account không thành công " + e.getMessage());
		}
		return accounts;
	}

	public void createAccount(Account request) {
		try {
			accountService.createAccount(request);
		} catch (RuntimeException | SQLException e) {
			System.out.println("Tạo mới account không thành công! " + e.getMessage());
		}
	}

	public void updateAccount(int accountId) {
		try {
			accountService.updateAccount(accountId);
		} catch (RuntimeException | SQLException e) {
			System.out.println("Chỉnh sửa account không thành công! " + e.getMessage());
		}
	}

	public void deleteAccount(int accountId) {
		try {
			accountService.deleteAccount(accountId);
		} catch (RuntimeException | SQLException e) {
			System.out.println("Chỉnh sửa account không thành công! " + e.getMessage());
		}
	}

}
