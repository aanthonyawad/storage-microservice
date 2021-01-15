package com.awad.anthony.storage.utils;

import java.security.SecureRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Helper {

	public static final String DIRECTORY_BASE = "/images/";
	public static final String EXTENSION = ".PNG";
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
	}
	
	public static byte[] generateSalt(String str) {
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[16];
		random.nextBytes(salt);
		return salt;
	}

	public static String getDirectoryName(String fileType) {
		return null;
	}

	public static String getFileExtension(String fileType) {
		// TODO Auto-generated method stub
		return null;
	}
}