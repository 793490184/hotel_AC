package com.InitLee.util;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

public class HttpUtil {

	public static String charReader(HttpServletRequest request) throws IOException {
		BufferedReader br = request.getReader();
		String str, wholeStr = "";
		while ((str = br.readLine()) != null) {
			wholeStr += str;
		}
		return wholeStr;
	}

}
