package entity;


import java.sql.Date;

public class Account {

	private Integer accountId;

	private String email;

	private String userName;

	private String fullName;

	private Integer departmentId;

	private Integer positionId;

	private Date createDate;

	public Account() {
	}

	public Account(Integer accountId, String email, String userName, String fullName, Integer departmentId, Integer positionId, Date createDate) {
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.departmentId = departmentId;
		this.positionId = positionId;
		this.createDate = createDate;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account{" +
				"accountId=" + accountId +
				", email='" + email + '\'' +
				", userName='" + userName + '\'' +
				", fullName='" + fullName + '\'' +
				", departmentId=" + departmentId +
				", positionId=" + positionId +
				", createDate=" + createDate +
				'}';
	}

}
