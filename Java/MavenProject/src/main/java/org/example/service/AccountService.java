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

	Account createAccount(Account request) throws SQLException;

	Account updateAccount(Account request) throws SQLException;

}
