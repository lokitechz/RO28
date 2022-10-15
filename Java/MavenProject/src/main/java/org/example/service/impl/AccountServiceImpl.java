package org.example.service.impl;

import org.example.entity.Account;
import org.example.repository.AccountRepository;
import org.example.service.AccountService;
import org.example.utils.Utils;

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

	/**
	 * Hàm lấy ra thông tin của toàn bộ account
	 *
	 * @return List<Account> - Danh sách toàn bộ account trong database
	 * @throws SQLException - Lỗi xảy ra trong quá trình lưu dữ lệu vào database
	 */
	@Override
	public List<Account> getAccounts() throws SQLException {
		return accountRepository.getAccounts();
	}

	/**
	 * Hàm xủ lý tạo account
	 *
	 * @param request - Thông tin account cần tạo mới
	 * @return Account - Đối tượng account sau khi tạo mới thành công
	 * @throws SQLException - Lỗi xảy ra trong quá trình lưu dữ liệu vào database
	 */
	@Override
	public void createAccount(Account request) throws SQLException {
		String result = Utils.validateAccountData(request);
		if (result != null) {
			throw new RuntimeException(result);
		}
		accountRepository.createAccount(request);
	}

	@Override
	public void updateAccount(int accountId) throws SQLException {
		// Tìm kiếm thông tin account trong database
		Account account = accountRepository.getAccountByID(accountId);
		if (account.getAccountId() == null) {
			throw new RuntimeException("Không tìm thấy thông tin account bạn muốn chỉnh sửa");
		} else {
			Account request = Utils.inputAccountInfo();
			request.setAccountId(accountId);
			accountRepository.updateAccount(request);
			System.out.println("Chỉnh sửa dữ liệu của bản ghi có accountId = " + account.getAccountId() + " thành công");
		}
	}

}
