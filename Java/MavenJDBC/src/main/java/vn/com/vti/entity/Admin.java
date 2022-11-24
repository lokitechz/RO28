package vn.com.vti.entity;

public class Admin extends User {

	private Integer expInYear;

	public Admin(Integer id, String fullName, String email, String password, Integer expInYear) {
		super(id, fullName, email, password);
		this.expInYear = expInYear;
	}

	public Integer getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(Integer expInYear) {
		this.expInYear = expInYear;
	}

}
