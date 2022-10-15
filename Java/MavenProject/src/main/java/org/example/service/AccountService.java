package org.example.service;

import org.example.entity.Account;

import java.sql.SQLException;
import java.util.List;

/**
 * Tầng service là 1 interface chứa các hàm không xử lý
 * (interface này để thể hiện tính trừu tượng trong OOP)
 */
public interface AccountService {

	List<Account> getAccounts() throws SQLException;

	void createAccount(Account request) throws SQLException;

	void updateAccount(int accountId) throws SQLException;

}
