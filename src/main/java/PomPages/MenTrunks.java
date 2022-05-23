package PomPages;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenTrunks {
	@FindBy(xpath="(//img[contains(@class,'nwc-lazyimg is-loaded')])[1]")
	private WebElement LineTrunk;
	
	@FindBy(xpath="(//span[contains(text(),'FAVOURITE')])[1]")
	private WebElement Favouritebt;
	
	
	@FindBy(xpath="(//span[text()='Trunks'])[1]")
	private WebElement SelectionTR;
	
	
	public MenTrunks (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	
	public void Favorite() {
		Favouritebt.click();
		
	}
	public WebElement getFavouritebt() {
		return Favouritebt;
	}
public void LineTrunkpage() {
	LineTrunk.click();
}
public void SelectionTr() {
	SelectionTR.click();
}



public WebElement getLineTrunk() {
	return LineTrunk;
}
}
