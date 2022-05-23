package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wildcraftloginpage {
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement LOgin;
	
	@FindBy(xpath="//input[contains(@name,'text')]")
	private WebElement Emailbtn;
	
	@FindBy(xpath="//input[contains(@type,'password')]")
	private WebElement PAsswordbtn;
	
	@FindBy(xpath="//button[contains(@type,'submit')]")
	private WebElement submitbtn;
	
	@FindBy(xpath="(//button[contains(@class,'ng-binding')])[1]")
	private WebElement closepopu;
	
	@FindBy(xpath="//a[text()='MEN']")
	private WebElement mentb;
	
	@FindBy(xpath="(//a[text()='JACKETS & CHEATERS'])[1]")
	private WebElement men_jacket;
	
	
	public wildcraftloginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void LOGIN() {
		LOgin.click();
	}
	public void Emailadd(String name) {
		Emailbtn.sendKeys(name);
	}
	public void password(String name) {
		PAsswordbtn.sendKeys(name);
	}
	public void Submit() {
		submitbtn.submit();	
	}
	public void ClosePopu() {
		closepopu.click();
	}
	public WebElement getMentb() {
		return mentb;
	}
	public void MenJacket() {
		men_jacket.click();
	}
	

}
