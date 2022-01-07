package com.Data_PropertiesFiles;

public class File_Reader_Manager {
	private File_Reader_Manager() {
			}
    public File_Reader_Manager getInstanceFRM() {
		
	File_Reader_Manager frm = new File_Reader_Manager();
	
	return frm;
	}
	public static Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}
	
	
	
}
