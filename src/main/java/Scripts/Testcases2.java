package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import PomPages.MenJacketpage;
import PomPages.MenTrunks;
import PomPages.wildcraftloginpage;
import genericLib.BaseClass;

public class Testcases2 extends BaseClass{
	@Test
	public void TC2() throws IOException, InterruptedException  {
		
		wildcraftloginpage w=new wildcraftloginpage(driver);
		w.LOGIN();
		w.Emailadd(p.getPropertyFiledata("username"));
		w.password(p.getPropertyFiledata("password"));
		w.Submit();
		w.ClosePopu();
		driverutilies.mouseHover(driver, w.getMentb());
		w.MenJacket();
		MenJacketpage M=new MenJacketpage(driver);
		M.Newarrivalebtn();
		M.FstArrowdown();
		M.PINnumber(p.getPropertyFiledata("pin"));
		M.SearchBTN();
		M.Bagalorebrach();
		M.ArrowUP();
		Point Ge = M.getMenTrunks().getLocation();
		int x=Ge.getX();
		int y=Ge.getY();
		driverutilies.scrollbar(driver, x, y);
		M.Mentrunk();
		
		driverutilies.switchTabs(driver);
		MenTrunks T=new MenTrunks(driver);
		T.SelectionTr();
		//
		Thread.sleep(3000);
		T.LineTrunkpage();
		driverutilies.mouseHover(driver,T.getFavouritebt());
		T.Favorite();
		
	/*Point loca = T.getLineTrunk().getLocation();
	int x1=loca.getX();
	int y1=loca.getY();
	driverutilies.scrollbar(driver, x1, y1);
	T.LineTrunkpage();
	//driverutilies.mouseHover(driver,T.getFavouritebt());
	//T.Favorite();
	*/	
		
	}

}
