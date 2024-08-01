package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.PetstorePage;

public class PetstoreTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}
	
	@Test
	public void test()
	{
		PetstorePage obj= new PetstorePage(driver);
		obj.fishStore();
		obj.fishaddtocart();
		obj.fishRemove();
		obj.returntoMainmenu();
		obj.dogStore();
		obj.dogAddtocart();
		obj.proceedCheckout();
		obj.enterUsername();
		obj.clklogin();
		obj.gotocart();
		obj.myAccount();
		obj.myOrders();
		obj.search();
		obj.signOut();
	}

}
