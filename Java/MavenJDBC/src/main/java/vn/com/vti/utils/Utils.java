package vn.com.vti.utils;

import org.apache.commons.lang3.StringUtils;
import vn.com.vti.entity.Department;

public class Utils {

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

}
