package readataexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("E:\\rkvarma\\selenium videos\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		int rowcount=ws.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			Row r=ws.getRow(i);
		int colcount=r.getLastCellNum();
		for(int j=0;j<colcount;j++)
		{
			Cell c=r.getCell(j);
			System.out.print(c.getStringCellValue()+"   ");
			
		}
			System.out.println();
		}
		

	}

}
