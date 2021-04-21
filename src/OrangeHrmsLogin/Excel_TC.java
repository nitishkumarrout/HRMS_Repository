package OrangeHrmsLogin;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_TC {
	public static void main(String[] args) throws Exception{
		FileInputStream file=new FileInputStream("E:\\TESTING COURSE\\ReadExcel.xls");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet st=wb.getSheet(0);
		int row_count=st.getRows();
		System.out.println("row no "+ row_count);
		for(int row=1;row<row_count;row++) {
		String empid=st.getCell(0,row).getContents();
		String empname=st.getCell(1, row).getContents();
		String email=st.getCell(2,row).getContents();
		String number=st.getCell(3,row).getContents();
		
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(email);
		System.out.println(number);
		
	}
	}

}
