package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage extends BaseClass {
	public AmazonLoginPage() {
		  PageFactory.initElements(driver, this);
	  }
 
	@FindBy(id="nav-hamburger-menu")
	private WebElement clkMenu;

	public WebElement getClkMenu() {
		return clkMenu;
	}
	@FindBy(xpath="//div[text()='Electronics']")
	private WebElement clkElectronics;

	public WebElement getClkElectronics() {
		return clkElectronics;
	}
	@FindBy(xpath="(//a[text()='Cell Phones & Accessories'])")
	private WebElement clkCellphones;

	public WebElement getClkCellphones() {
		return clkCellphones;
	}
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[2]")
	private WebElement clkSamsung;

	public WebElement getClkSamsung() {
		return clkSamsung;
	}
	@FindBy(xpath="//span[text()='Under $25']")
	private WebElement clkUnder;

	public WebElement getClkUnder() {
		return clkUnder;
	}
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")
	private WebElement clkSamsung25W;

	public WebElement getClkSamsung25W() {
		return clkSamsung25W;
	}
	@FindBy(id="add-to-cart-button")
	private WebElement clkCart;

	public WebElement getClkCart() {
		return clkCart;
	}
	@FindBy(xpath="(//span[@class='nav-line-2'])[3]")
	private WebElement clkBuy;

	public WebElement getClkBuy() {
		return clkBuy;
	}
	
}
