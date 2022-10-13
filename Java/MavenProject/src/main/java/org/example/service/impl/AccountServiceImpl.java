package org.example.service.impl;

import org.example.entity.Account;
import org.example.repository.AccountRepository;
import org.example.service.AccountService;

import java.sql.SQLException;

/**
 * Class chứa xử lý logic
 */
public class AccountServiceImpl implements AccountService {

	private final AccountRepository accountRepository;

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public Account createAccount(Account request) throws SQLException {
		if (!request.getEmail().contains("@")) {
			throw new RuntimeException("Email không đúng định dạng");
		}
		return accountRepository.createAccount(request);
	}

}
