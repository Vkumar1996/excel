package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsx {
	public static void main(String[] args) throws IOException {
		
	

	String path="D:\\Users\\vikash\\Desktop\\Bikash.xlsx";
	File f=new File(path);
	FileInputStream fis = new FileInputStream(f);
	XSSFWorkbook w = new XSSFWorkbook(fis);
	XSSFSheet s = w.getSheetAt(0);
	XSSFRow r = s.getRow(1);
	XSSFCell c = r.getCell(1);
	System.out.println(c);
	}

}
