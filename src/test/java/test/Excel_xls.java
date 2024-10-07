package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel_xls {
	public static void main(String[] args) throws IOException {
		
		String path="D:\\Users\\vikash\\Desktop\\Book2.xls";
		File f=new File(path);
		FileInputStream fis = new FileInputStream(f);
		HSSFWorkbook b= new HSSFWorkbook(fis);
		HSSFSheet sh=b.getSheetAt(0);
		HSSFRow hr=sh.getRow(1);
		HSSFCell c=hr.getCell(1);
		System.out.println(c);


		
	}

}
