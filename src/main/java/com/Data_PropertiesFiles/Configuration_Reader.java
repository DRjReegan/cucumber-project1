package com.Data_PropertiesFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
public static Properties p;

	public Configuration_Reader() throws IOException {
		File f = new File("C:\\Users\\REEGAN\\eclipse-workspace\\Maven_Project1\\src\\main\\java\\com\\Properties_File\\properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}














}
