package com.terrain;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class swathi extends BaseTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@Test
	public void Activity() throws InterruptedException {

		MobileElement Next = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		Next.click();
		Next.click();
		Next.click();

		MobileElement checkbox = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]");

		checkbox.click();
		Next.click();
		Next.click();
		MobileElement button = (MobileElement) driver.findElementById("android:id/button1");
		button.click();
         
		MobileElement Income = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout");
	    Income.click();
	    MobileElement IncomeTab = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.RelativeLayout/android.widget.ImageView[1]");
	    IncomeTab.click();
	    MobileElement Salary = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
	    Salary.sendKeys("PartTime Salary");
	    MobileElement SalaryAmount = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
	    SalaryAmount.sendKeys("25000");
	    MobileElement HomeMenu = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
	    HomeMenu.click();
	    driver.navigate().back();
	    MobileElement Expense = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout");
	    Expense.click();
	    MobileElement ExpenseTab = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.ImageView[1]");
	    ExpenseTab.click();
	    MobileElement ExpenseDescription = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
	    ExpenseDescription.sendKeys("Trip Expense ");
	    MobileElement ExpenseAmount = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
	    ExpenseAmount.sendKeys("2580");
	    MobileElement MainMenu = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
	    MainMenu.click();
	    driver.navigate().back();
	    MobileElement LiabilityTab = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.RelativeLayout");
	    LiabilityTab.click();
	    MobileElement Liability = (MobileElement) driver.findElementById("org.gnucash.android:id/create_transaction");
	    Liability.click();
	    MobileElement LiabilityDescription = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
	    LiabilityDescription.sendKeys("Phone EMI");
	    MobileElement EMIAmount = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
	    EMIAmount.sendKeys("3755");
	    MobileElement menu = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
	    menu.click();
	    driver.navigate().back();
		   
		  }

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
}
