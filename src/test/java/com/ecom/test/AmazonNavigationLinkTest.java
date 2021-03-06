package com.ecom.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

class AmazonNavigationLinkTest {

	final String siteURL = "https://www.amazon.in/";
	final String driverPath = "driver/geckodriver";
	WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		// setup up
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		// set headless driver option
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		driver = new FirefoxDriver(options);
		driver.get(siteURL);
	}

	@AfterEach
	void tearDown() throws Exception {
		// close driver
		driver.close();
	}

	@Test
	@DisplayName("Amazon Test : Mobile Link Verfication")
	void testMobileNavigationLink() {
		// find mobile link
		WebElement mobileLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)"));
		// test evaluation
		assertTrue(mobileLink.isDisplayed());
		assertTrue(mobileLink.isEnabled());
		// click action
		mobileLink.click();
		String expected = "Amazon.in Bestsellers: The most popular items on Amazon";
		assertEquals(expected, driver.getTitle());
	}

	@Test
	@DisplayName("Amazon Test : Tooday Deals Link Verfication")
	void testTodaysDealNavigationLink() {
		// find mobile link
		WebElement todayLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)"));
		// test evaluation
		assertTrue(todayLink.isDisplayed());
		assertTrue(todayLink.isEnabled());
	}

	// TODO :: Test to verify 3 more nav links from amazon commerce web site.

}
