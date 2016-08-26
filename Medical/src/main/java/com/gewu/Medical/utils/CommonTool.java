package com.gewu.Medical.utils;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.math.RandomUtils;


public class CommonTool {

	public static final String PATH = "http://123.125.99.118";

	
	public static String createRandomPWD(int n) {
		String ret = new String( System.currentTimeMillis() + "");
		ret = ret.substring( ret.length() + 1 - n );
		return ret ;
	}
	

	public static boolean isEmail(String email) {
		if (null == email || "".equals(email))
			return false;
		Pattern p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");// 复杂匹配
		Matcher m = p.matcher(email);
		return m.matches();
	}


	public static void tempPictureCopy(String desPath, String fileName)  {
		String tempImagePath = PropertyPlaceHolder.getProperty("tempFileSavePath", "");
		fileMkdir(desPath);
		try {
			FileUtils.copyFile(new File(tempImagePath + "/" + fileName), new File(desPath + "/" + fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileMkdir(String path) {
		File file = new File(path);
		if (!file.exists()) {
			file.mkdir();
		}
	}


	public static String createPicture(String savePath, String visitPath, String getImageVisit)  {
		try {
			String tempImageSavePath = PropertyPlaceHolder.getProperty("tempFileSavePath", "");
			CommonTool.fileMkdir(savePath);

			int d = getImageVisit.lastIndexOf("/");

			System.out.println(tempImageSavePath + getImageVisit.substring(d + 1));
			System.out.println(savePath + getImageVisit.substring(d + 1));
			FileUtils.copyFile(new File(tempImageSavePath + getImageVisit.substring(d + 1)),
					new File(savePath + getImageVisit.substring(d + 1)));
			return visitPath + getImageVisit.substring(d + 1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;

		}
	}

	public static Boolean deletePicture(String savePath, String getImageVisit) {
		try {
			File deleteOwnFile = new File(savePath + getImageVisit.substring(getImageVisit.lastIndexOf("/") + 1));
			deleteOwnFile.delete();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}


	
}
