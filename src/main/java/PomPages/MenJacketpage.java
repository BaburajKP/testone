package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenJacketpage {
	@FindBy(xpath="//span[text()='New Arrivals']")
	private WebElement NewArrival;
	
	@FindBy(xpath="(//i[contains(@class,'icomoon-arrow_right')])[1]")
	private WebElement FirstArrowDown;
	
	@FindBy(xpath="//input[contains(@id,'nw-omnifilter-input')]")
	private WebElement PIN;
	@FindBy(xpath="//i[contains(@class,'icomoon-search3 nw-omnifilter-icon')]")
	private WebElement searchbtn;
	
	@FindBy(xpath="(//span[text()='WC Indiranagar Bangalore'])[1]")
	private WebElement bangalore;
	
	@FindBy(xpath="(//i[contains(@class,'icomoon-arrow_right nw-produc')])[1]")
	private WebElement arrowUP;
	
	
	@FindBy(xpath="(//a[contains(@class,'wc-footersociallinks-anchor nwc-anchortag')])[1]")
	private WebElement FacebbokIconbtn;
	
	@FindBy(xpath="//a[contains(text(),'Men Trunks')]")
	private WebElement MenTrunks;
	
	public MenJacketpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void Newarrivalebtn() {
		NewArrival.click();
	}
	
	public void FstArrowdown() {
		FirstArrowDown.click();
	}
	public void PINnumber(String name) {
		PIN.sendKeys(name);
	}
	
	public void SearchBTN() {
		searchbtn.click();
	}
	public void Bagalorebrach() {
		bangalore.click();
	}
	public void ArrowUP() {
		arrowUP.click();
	}
	public void FaceBook() {
		FacebbokIconbtn.click();
	}

	public WebElement getFacebbokIconbtn() {
		return FacebbokIconbtn;
	}

	public WebElement getMenTrunks() {
		return MenTrunks;
	}
	public void Mentrunk() {
		MenTrunks.click();
	}
}
