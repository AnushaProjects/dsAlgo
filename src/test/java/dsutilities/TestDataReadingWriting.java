package dsutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import dsalgo_webdriver_manager.DriverManager;

public class TestDataReadingWriting {
	
	
	public void usingExcelSheetForTestData() {
		Actions action =new Actions(DriverManager.getDriver());
		DsalgoVariables.path="/Users/anushakarthick/NumpyNinja/dsalgo/src/test/resources/TestData/dsAlgoTestData.xlsx";
		File excelFile=new File(DsalgoVariables.path);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet=workbook.getSheet("PythonArray");
		System.out.println(sheet.getLastRowNum());
		
		int endRow = sheet.getLastRowNum();
		System.out.println(endRow);
		//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.Texteditor1));
		
		for (int i = 1; i <=endRow; i++) {
			Cell c1 = sheet.getRow(i).getCell(0);
			DsalgoVariables.python_code=c1.getStringCellValue();
			System.out.println(DsalgoVariables.python_code);
			
			action.sendKeys(DsalgoVariables.python_code).perform();
			action.sendKeys(Keys.ENTER).perform();
			action.keyDown(Keys.COMMAND).keyDown(Keys.SHIFT).sendKeys(Keys.ARROW_LEFT).keyUp(Keys.COMMAND).keyUp(Keys.SHIFT).sendKeys(Keys.DELETE).perform();
				
		}
	}

}
