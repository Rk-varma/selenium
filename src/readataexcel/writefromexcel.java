package readataexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writefromexcel {

	public static void main(String[] args) throws IOException {
			
		FileInputStream file=new FileInputStream("E:\\rkvarma\\selenium videos\\Book1.xlsx");
       XSSFWorkbook wb=new XSSFWorkbook(file);
       XSSFSheet ws=wb.getSheet("sheet1");
       Row r=ws.getRow(0);
       Cell c=r.getCell(1);
       c.setCellValue("sai");
       r=ws.getRow(1);
       r.createCell(3);
       c.setCellValue("rakesh");
       r=ws.createRow(3);
       c=r.createCell(0);
       c.setCellValue("hostel");
       FileOutputStream f=new FileOutputStream("E:\\rkvarma\\selenium videos\\Book1.xlsx");
       wb.write(f);
       
	}

}
