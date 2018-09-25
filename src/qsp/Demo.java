package qsp;

import java.io.File;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Demo {

	public static void main(String[] args) throws Exception {
		
  Workbook b = WorkbookFactory.create(new File("./data/Book1.xlsx"));
  
String c = b.getSheet("sheet1").getRow(1).getCell(0).toString();

    System.out.println(c);
	}
}

