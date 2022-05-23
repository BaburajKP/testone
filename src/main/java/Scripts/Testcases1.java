package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.wildcraftloginpage;
import genericLib.BaseClass;

public class Testcases1 extends BaseClass {
	@Test
	public void TS1() throws IOException   {
		wildcraftloginpage w=new wildcraftloginpage(driver);
		w.LOGIN();
		w.Emailadd(p.getPropertyFiledata("username"));
		w.password(p.getPropertyFiledata("password"));
		w.Submit();
		w.ClosePopu();
		
		
		
	}

}
