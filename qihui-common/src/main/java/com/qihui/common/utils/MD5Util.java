package com.qihui.common.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.security.MessageDigest;

public class MD5Util {

	private static Log log = LogFactory.getLog(MD5Util.class);

	private static final char hexDigits[] = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	private MD5Util() {
		// ignore
	}

	public static String getMD5(String source) {

		if (null == source)
			return source;

		String s = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(source.getBytes("UTF-8"));
			byte tmp[] = md.digest();
			char str[] = new char[16 * 2];
			int k = 0;
			for (int i = 0; i < 16; i++) {
				byte byte0 = tmp[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			s = new String(str);

		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

		return s;
	}

	public static String getMD5Encrypt16(String source) {

		return getMD5(source).substring(8, 24);
	}
	
	public static void main(String[] args) {
		System.out.println(getMD5("123456"));
	}
}