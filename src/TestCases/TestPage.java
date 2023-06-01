import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


import com.Base.TestBase;
import com.Pages.DashboardPage;
import com.Pages.GeneralinfoPage;
import com.Pages.LoginPage;
import com.Pages.StructurePage;

public class AdminConfigTCs extends TestBase {
	String NeworgName = "Organization1";
	String NewEmail = "newemailorg1@outlook.com";
	String NewCountry = "Tonga";
	String NewCountryValue = "TO";
	String unitName = "SixthUnit";

	PackagesPage pageObj;


	@BeforeTest
	public void beforeMethod() throws InterruptedException {

		pageObj = new PackagesPage(driver);
			}

	@Test(priority = 1)
	public void verifySAPackages() throws InterruptedException {

//		String actualsuccessText = generalInfObj.verifyDataSavedSuccessfullyMsg();
//		String expectedsuccessText = "\r\n"
//				+ "            Successfully Saved        ";
//		String actualName = generalInfObj.verifyNameSavedSuccessfully();
//		String actualEmail = generalInfObj.verifymailSavedSuccessfully();
//		String actualCountry = generalInfObj.verifyCountrySavedSuccessfully();
//		Thread.sleep(1000);
//		Assert.assertEquals(actualName, NeworgName);
//		Assert.assertEquals(actualEmail, NewEmail);
//		Assert.assertEquals(actualCountry, NewCountryValue);
		
	
	}


	@AfterTest
	public void afterMethod() {
		CloseBrowser();
	}

}
