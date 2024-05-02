package ganarality;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readdatafromexcelfile(String sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream fisp=new FileInputStream("C:\\\\Users\\\\prava\\\\OneDrive\\\\文档\\\\workbook.xlsx");

		return WorkbookFactory.create(fisp).getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}


}
