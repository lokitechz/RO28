package vn.com.vti.util;

import org.apache.commons.lang3.StringUtils;
import vn.com.vti.entity.Department;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

	public static final Pattern REGEX_EMAIL = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean validateDepartment(String action, Department department) {
		if (action.equalsIgnoreCase("add")) {
			return !StringUtils.isBlank(department.getDepartmentName());
		} else if (action.equalsIgnoreCase("update")) {
			if (department.getDepartmentId() == null) {
				return false;
			} else {
				return !StringUtils.isBlank(department.getDepartmentName());
			}
		} else if (action.equalsIgnoreCase("delete")) {
			return department.getDepartmentId() != null;
		}
		return true;
	}

	public static boolean isDemo(String departmentName) {
		return !departmentName.equalsIgnoreCase("demo");
	}

	public static boolean validateEmail(String email){
		Matcher matcher = REGEX_EMAIL.matcher(email);
		return matcher.find();
	}

}
