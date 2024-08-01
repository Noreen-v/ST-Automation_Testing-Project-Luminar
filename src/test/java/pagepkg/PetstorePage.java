package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetstorePage {
	
	WebDriver driver;

	//------------------------selecting fish----------------------------------
	
	@FindBy(xpath = "//*[@id=\"MainImageContent\"]/map/area[2]")
	WebElement fish;
	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")
	WebElement koi;
	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
	WebElement spotkoi;
	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
	WebElement faddcart;
	
	@FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input")
	WebElement fquantity;
	
	@FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")
	WebElement fremove;
	
	@FindBy(xpath = "//*[@id=\"BackLink\"]/a")
	WebElement mainmenu;
	
	//-----------------------Dog-------------------------------
	@FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[2]/img")
	WebElement dog;
	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")
	WebElement goldenret;
	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement selectgolden;
	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
	WebElement dogaddcart;
	
	@FindBy(xpath = "//*[@id=\"Cart\"]/a")
	WebElement checkout;
	
	//------------------login----------------------------------
	@FindBy(xpath = "//*[@name=\"username\"]")
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
	WebElement login;
	
	@FindBy(xpath = "//*[@id=\"MenuContent\"]/a[1]/img")
	WebElement cart;
	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")  //click continue....
	WebElement clkcontinue;
	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/a")
	WebElement confirm;
	
	@FindBy(xpath = "//*[@id=\"MenuContent\"]/a[3]")
	WebElement myacc;
	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/a")
	WebElement myorder;
	
	@FindBy(xpath = "//*[@id=\"SearchContent\"]/form/input[1]")  //search.....
	WebElement typesearch;
	
	@FindBy(xpath = "//*[@id=\"SearchContent\"]/form/input[2]")
	WebElement srchbtn;
	
	@FindBy(xpath = "//*[@id=\"LogoContent\"]/a/img")
	WebElement logo;
	
	@FindBy(xpath = "//*[@id=\"MenuContent\"]/a[2]") //signout.....
	WebElement signout;
	
	public PetstorePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	public void fishStore()
	{
		fish.click();
		koi.click();
		spotkoi.click();
	}

	public void fishaddtocart()
	{
		faddcart.click();
		fquantity.clear();
		fquantity.sendKeys("10");
	}
	
	public void fishRemove()
	{
		fremove.click();
	}
	
	public void returntoMainmenu()
	{
		mainmenu.click();
	}
	
	public void dogStore()
	{
		dog.click();
		goldenret.click();
		selectgolden.click();   //selecting golden retriever 
	}
	
	public void dogAddtocart()
	{
		dogaddcart.click();
	}
	
	public void proceedCheckout()
	{
		checkout.click();
	}
	
	public void enterUsername()
	{
		username.sendKeys("j2ee");
	}
	
	public void clklogin()
	{
		login.click();
	}
	
	public void gotocart()
	{
		cart.click();
		checkout.click();
		clkcontinue.click();
		confirm.click();
	}
	
	public void myAccount()
	{
		myacc.click();
		
	}
	
	public void myOrders()
	{
		myorder.click(); 
	}
	
	public void search()
	{
		logo.click();
		typesearch.sendKeys("parrot");
		srchbtn.click();
		
	}
	
	public void signOut()
	{
		signout.click();
	}
}
