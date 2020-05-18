package com.pageobjects;


import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Jackson_Pageobject {
	
       AndroidDriver<MobileElement> driver;
       
       public int sal;
       public  int sav;
       public int TotalExp;

	
		public void loginpage(AndroidDriver driver) {
			 
		    MobileElement el1 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		    el1.click();
		    MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[5]");
		    el2.click();
		    MobileElement el3 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		    el3.click();
		    MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
		    el4.click();
		    MobileElement el5 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		    el5.click();
		    MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		    el6.click();
		    MobileElement el7 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		    el7.click();
		    MobileElement el8 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		    el8.click();
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    MobileElement el9 = (MobileElement) driver.findElementById("android:id/button1");
		    el9.click();
		}
		
		public void Incomepage(AndroidDriver driver) throws InterruptedException {
			
			MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout");
		    el10.click();
		    MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.RelativeLayout");
		    el11.click();
		    MobileElement el12 = (MobileElement) driver.findElementById("org.gnucash.android:id/fab_create_transaction");
		    el12.click();
		    MobileElement el13 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
		    el13.sendKeys("May Salary");
		    MobileElement el14 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
		    el14.sendKeys("4500");
		     sal = Integer.parseInt(el14.getText());
		    System.out.println("Welcome to Salary Management APP");
		    System.out.println("May Month Salary:"+sal);
		    MobileElement el15 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_type");
		    el15.click();
		    MobileElement el16 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_description");
		    el16.sendKeys("salary has been credited for may month");
		    MobileElement el17 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
		    el17.click();
		    Thread.sleep(2000);
		    driver.navigate().back();
		    driver.navigate().back();
		}
		
		public void Assetpage(AndroidDriver driver) {
			MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout");
		    el21.click();
		    MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout");
		    el22.click();
		    MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout");
		    el23.click();
		    MobileElement el24 = (MobileElement) driver.findElementById("org.gnucash.android:id/fab_create_transaction");
		    el24.click();
		    MobileElement el25 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
		    el25.sendKeys("May Savings");
		    MobileElement el26 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
		    el26.sendKeys("500");
		    sav = Integer.parseInt(el26.getText());
		    System.out.println("May Savings:"+sav);
		    MobileElement el27 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
		    el27.click();
		    driver.navigate().back();
		    driver.navigate().back();
		    driver.navigate().back();
		}
		
		public void Expensepage(AndroidDriver driver) {
			 MobileElement el28 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout");
			    el28.click();

			    MobileElement radioGroup = (MobileElement) driver

			    		.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"

			    		+".resourceId(\"org.gnucash.android:id/fragment_account_list\")).scrollIntoView("

			    		+"new UiSelector().text(\"Utilities\"));");

			    		radioGroup.click();
			    		
			    		
			    		 MobileElement el29 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]");
			    		 el29.click();
			    		    MobileElement el30 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
			    		    el30.sendKeys("Electric bill");
			    		    MobileElement e31 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
			    		    e31.sendKeys("50");
			    		    int exp1 = Integer.parseInt(e31.getText());
			    		    MobileElement el31 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
			    		    el31.click();
			    		    MobileElement el32 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ImageView[1]");
			    		    el32.click();
			    		    MobileElement el33 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
			    		    el33.sendKeys("Garbage");
			    		    MobileElement el34 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
			    		    el34.sendKeys("50");
			    		    int exp2 = Integer.parseInt(el34.getText());
			    		    MobileElement el35 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
			    		    el35.click();
			    		    MobileElement el36 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.ImageView[1]");
			    		    el36.click();
			    		    MobileElement el37 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
			    		    el37.sendKeys("Gas");
			    		    MobileElement el39 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
			    		    el39.sendKeys("50");
			    		    int exp3 = Integer.parseInt(el39.getText());
			    		    MobileElement el40 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
			    		    el40.click();
			    		    MobileElement el41 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.ImageView[1]");
			    		    el41.click();
			    		    MobileElement el42 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
			    		    el42.sendKeys("Water");
			    		    MobileElement el43 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
			    		    el43.sendKeys("50");
			    		    int exp4 = Integer.parseInt(el43.getText());
			    		    MobileElement el44 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
			    		    el44.click();
			    		    
			    		    driver.navigate().back();
			    		    driver.navigate().back();
			    		    
			    		    TotalExp = exp1+exp2+exp3+exp4;
			    		    System.out.println("Total Expenses:"+TotalExp);
			    		    
			    		    System.out.println("Remaining Salary Amount:"+(sal-(sav+TotalExp)));
			    
			
		}
		
	

}
