package org.example.service.impl;

import org.example.entity.Account;
import org.example.repository.AccountRepository;
import org.example.service.AccountService;

import java.sql.SQLException;
import java.util.List;

/**
 * Class implement interface của tầng service để thực hiện xử lý logic
 * Các logic của chương trình sẽ viết trong class này
 */
public class AccountServiceImpl implements AccountService {

	private final AccountRepository accountRepository;

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public List<Account> getAccounts() throws SQLException {
		return accountRepository.getAccounts();
	}

	@Override
	public Account createAccount(Account request) throws SQLException {
		if (!request.getEmail().contains("@")) {
			throw new RuntimeException("Email không đúng định dạng");
		}
		return accountRepository.createAccount(request);
	}

}
