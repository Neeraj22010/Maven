package globalu;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basefile.Basefile;

public class Login extends Basefile {

	public Login()
	{
     PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-yeihih']")
//	private WebElement login;
	
//	@FindBy(xpath="(//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1o7wnwk\"]) [1]")
//	private WebElement featuredcourses;
	
	@FindBy(xpath="//*[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1qk53yy\"]")
	private WebElement crossbutton;
	
	@FindBy(xpath="//*[text()='Featured Courses']")
	private WebElement FeaturedCourses;
	
	@FindBy(xpath="(//*[@data-testid='FiberManualRecordIcon'])")
	private WebElement Clickpointer;
	
	@FindBy(xpath="(//*[@data-testid='FiberManualRecordIcon'])")
	private List<WebElement> Clickpointerlist;
	
//	@FindBy(xpath="//*[text()='Introduction to Finance and Accounting Specialization']/..//*[text()='View Course' and @type='button']")
//	private WebElement ViewCourse;
	
	@FindBy(xpath="//*[@href='aboutus']")
	private WebElement Aboutus;
	
	@FindBy(xpath="(//*[text()='Finance Management'])[1]")
	private WebElement Businessmgmt;
	
	@FindBy(xpath="(//*[@class=\"MuiSvgIcon-root MuiSvgIcon-colorWhiteout MuiSvgIcon-fontSizeLarge css-tczqz3\"])[3]")
	private WebElement clickarrow;
	
	@FindBy(xpath="(//*[@class=\"MuiSvgIcon-root MuiSvgIcon-colorWhiteout MuiSvgIcon-fontSizeLarge css-tczqz3\"])[3]")
	private List<WebElement> clickarrowlist;
//	public void featuredcour() throws InterruptedException
//	
//	{
//		Thread.sleep(4000);
//	//	login.click();
//		featuredcourses.click();	}
//
	
	public void modalclose() throws InterruptedException
	
	{
        
        waitForElementToBeClickable(crossbutton, driver, 200).click();
       	
        }
	
	public void scroll_To_FeatureCourse() {
		
		scrollToElement(FeaturedCourses);
		
	}
	
	public void click_on_ClickPointer()
	{
	        
		for(int i = 0; i<clickarrowlist.size(); i++) {
			
			clickarrowlist.get(i).click();
		}
		
	//	Clickpointer.click();
		
		
	}
	
	public void click_on_Aboutus()
	
	{
		Aboutus.click();
	}
	
	public void scroll_to_businessmgmt() {
		scrollToElement(Businessmgmt);
}
	public void click_arrow()
	{
	        
		for(int i = 0; i<Clickpointerlist.size(); i++) {
			
			Clickpointerlist.get(i).click();
		}
	}
}

	