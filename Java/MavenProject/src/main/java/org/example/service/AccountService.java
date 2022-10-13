package org.example.service;

import org.example.entity.Account;

import java.sql.SQLException;

public interface AccountService {

	Account createAccount(Account request) throws SQLException;

}
