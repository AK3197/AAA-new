import org.openqa.selenium.WebElement;

import com.base.Baseclass;

public class AutoExceldata extends Baseclass{

	public static void main(String[] args) {
		AutoExceldata empdata = new AutoExceldata();
		empdata.booking();
		
	}
	public void booking() {
	
		browserLaunch();
	
		enterUrl("");
		maxiWindow();
		implicitWait();
		
	 WebElement findLocatorbyId = findLocatorbyId("");
		
		//String name=readCellData("",1,0);
	}
	
}
