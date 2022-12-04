package com.ODMT.ODMTBank.util;

public class CommonUtil {

	public static boolean isNotNull(Object object){
		boolean result = false;
		if (object != null)
			result = true;
		return result;
	}

	public static boolean isNull(Object object){
		boolean result = false;
		if (object == null)
			result = true;
		return result;
	}
}
