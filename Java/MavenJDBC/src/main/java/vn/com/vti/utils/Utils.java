package vn.com.vti.utils;

import org.apache.commons.lang3.StringUtils;
import vn.com.vti.entity.Department;

public class Utils {

	public static String validateDepartment(String action, Department department) {
		if (action.equalsIgnoreCase("add")) {
			if (StringUtils.isBlank(department.getDepartmentName())) {
				return "Tên phòng ban không dược để trống";
			}
		} else if (action.equalsIgnoreCase("update")) {
			if (department.getDepartmentId() == null) {
				return "Mã phòng ban không được bỏ trống";
			} else {
				if (StringUtils.isBlank(department.getDepartmentName())) {
					return "Tên phòng ban không dược để trống";
				}
			}
		} else if (action.equalsIgnoreCase("delete")) {
			if (department.getDepartmentId() == null) {
				return "Mã phòng ban không được bỏ trống";
			}
		}
		return StringUtils.EMPTY;
	}

}
