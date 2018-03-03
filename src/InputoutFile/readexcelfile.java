package InputoutFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcelfile {
	
	public void readexcelsheet() throws IOException {
		
		XSSFSheet ExcelWsheet;
		XSSFWorkbook ExcelWBook;
		XSSFCell Cell;
		XSSFRow Row;
		
		FileInputStream Excelfile=new FileInputStream("F://Slenium By Real time(Ramesh)//Read.xlsx");
		ExcelWBook=new XSSFWorkbook(Excelfile);
		ExcelWsheet=ExcelWBook.getSheet("Sheet1");
		int rownum = ExcelWsheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<rownum;i++) {
			
			int ColumnNum=ExcelWsheet.getRow(i).getPhysicalNumberOfCells();
			for(int j=0;j<ColumnNum;j++) {
				Cell=ExcelWsheet.getRow(i).getCell(j);
				Cell.setCellType(CellType.STRING);
				String CellData=Cell.getStringCellValue();
				System.out.print(      CellData+"\t");
			}
			System.out.println(   );
			
		}
		ExcelWBook.close();
		Excelfile.close();
			
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		readexcelfile obj = new readexcelfile();
		obj.readexcelsheet();

	}

}
