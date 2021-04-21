package OrangeHrmsLogin;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteExcelData {
public static void main(String args[]) throws Exception{
FileInputStream fis = new FileInputStream("E:\\TESTING COURSE\\ExcelExp.xls");
 XSSFWorkbook workbook = new XSSFWorkbook(fis);
 XSSFSheet sheet = workbook.getSheet("Sheet1");
 System.out.println(sheet.getSheetName());
 System.out.println(sheet.getLastRowNum());// to get rows count
 System.out.println("Before updating Cell Data "+sheet.getRow(2).getCell(1));
 // Write the data to excel file
 XSSFCell cell = sheet.getRow(2).getCell(1);
 cell.setCellValue("Nitish");
 fis.close();
FileOutputStream fileOut=new FileOutputStream("E:\\TESTING COURSE\\ReadExcel.xlsx");
 workbook.write(fileOut);
 System.out.println("Updated data after write is done " + cell.getStringCellValue());
 fileOut.close();
}
}