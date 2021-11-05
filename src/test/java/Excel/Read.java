package Excel;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

public class Read {
	public static String readExcel(int row, int column) throws IOException {
		String testData=null;
		try {
			//Getting the Relative path for excel from Source Excel folder
			String filePath = System.getProperty("user.dir")+ "\\Excel\\RedbusTestData.xlsx";	//path of excel file
			FileInputStream file = new FileInputStream(filePath);	//for reading data from the file
			XSSFWorkbook wb = new XSSFWorkbook(file);	//creates object of excel xlsx file
			XSSFSheet ws = wb.getSheetAt(0);		//gets details from the first sheet
			testData = String.valueOf(ws.getRow(row).getCell(column)); //gets value from row and column
			//System.out.println(testData);
			wb.close();
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Excel Read");
			
		}
		return testData;
	}
	/*
	public static void main(String[] args) throws Exception {
	readExcel(0,1);
	}
*/
}