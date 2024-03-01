package org.sample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.login.AmazonLoginPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon extends BaseClass {
	@BeforeClass
	private void beforeClass() {
	browserLaunch2("edge");
	urlLaunch("https://www.amazon.com/");
	implicitlyWait(10);
	}
//	 @AfterClass
//	  private void afterclass() {
//		quit();
//	}
	  @BeforeMethod
	  private void beforemethod() {
		Date d=new Date();
		System.out.println("start time "+d);
	}
	  @AfterMethod
	  private void aftermethod() {
		Date d=new Date();
		System.out.println("end time "+d);
	}
	  @Test
	  private void test1() throws IOException {
		AmazonLoginPage l= new AmazonLoginPage();
		click(l.getClkMenu());
		click(l.getClkElectronics());
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		click(l.getClkCellphones());
		click(l.getClkSamsung());
		click(l.getClkUnder());
		click(l.getClkSamsung25W());
		click(l.getClkCart());
		click(l.getClkBuy());
//		 String url = getCurrentUrl();
//		  Assert.assertTrue(getCurrentUrl().contains("/gp/cart/view.html?ref_=nav_cart"),"verify my cart");
//		  System.out.println("verified");
//		TakesScreenshot tk=(TakesScreenshot)driver;
//		File srcFile = tk.getScreenshotAs(OutputType.FILE);
//		System.out.println(srcFile);
//		
//		File destFile=new File("C:\\Users\\ACER\\eclipse-workspace\\Maven_Amazon_Testng\\screenshot\\img.png");
//		 FileUtils.copyFile(srcFile, destFile);

	}
}
