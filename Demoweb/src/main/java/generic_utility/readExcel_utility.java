package generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Anshu
 */
public class readExcel_utility {

	/**
	 * this method is used to get the particular value from excel sheet
	 * @param sheet
	 * @param row
	 * @param column
	 * @return
	 * @throws Exception
	 */
	public static String fetchData(String sheet, int row ,int column) throws Exception
	{
	FileInputStream fis=new FileInputStream(Iconstant.excel_path);
	Workbook w=WorkbookFactory.create(fis);
	Sheet s = w.getSheet(sheet);
	 return s.getRow(row).getCell(column).toString();
	
	}
	/**
	 * this method is used to get the number of row in excel sheet
	 * @param sheet
	 * @return
	 * @throws Exception
	 */
	public static int rowSize(String sheet) throws Exception
	{
		FileInputStream fis=new FileInputStream(Iconstant.excel_path);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		return s.getPhysicalNumberOfRows();
	}
	/**
	 * this method is used to get the number of column in excel sheet
	 * @param sheet
	 * @return
	 * @throws Exception
	 */
	public static int columnSize(String sheet) throws Exception
	{
		FileInputStream fis=new FileInputStream(Iconstant.excel_path);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		return s.getRow(0).getPhysicalNumberOfCells();
	}
	/**
	 * this method is used to fetch all data present in excel sheet
	 * @param sheet
	 * @return
	 * @throws Exception
	 */
	public static Object[][] fetchAllData(String sheet) throws Exception
	{
		FileInputStream fis=new FileInputStream(Iconstant.excel_path);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		int rowSize=s.getPhysicalNumberOfRows();
		int columnSize=s.getRow(0).getPhysicalNumberOfCells();
		Object[][] o=new Object[rowSize][columnSize];
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<columnSize;j++)
			{
				o[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return o;
	}
}