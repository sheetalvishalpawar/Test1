package Framework1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class UtilityClass 
{

	//To fetch data from property file
	@Test
	public static String getDataFromPF(String key) throws IOException
	{
		FileInputStream File=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\FrameworkNew\\PropertyFile.properties");
		Properties prop=new Properties();
		prop.load(File);
		String value1=prop.getProperty(key);
		return value1;
	}
	
	//To fetch data from Excelsheet
		@Test
		public static String getDataFromExcelsheet(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
		{
			FileInputStream File=new FileInputStream("D:\\Parameterization\\param1.xlsx");
			String Value2=WorkbookFactory.create(File).getSheet("Sheet11").getRow(RowIndex).getCell(CellIndex).getStringCellValue();
			return Value2;
		}
	
}
