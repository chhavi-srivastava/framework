package script;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;

public class DemoTest extends BaseTest 

{

	@Test
	public void testDemo()
	
	{
		
		int r = Excel.getRowCount("./data/input.xlsx", "Sheet1");
		Reporter.log("Rowcount:"+r,true);
		
		String d = Excel.getData("./data/input.xlsx", "Sheet1",0,0);
		
		Reporter.log("Data:"+d,true);
		Reporter.log("test demo...",true);
		//Assert.fail();
	}
	
}
