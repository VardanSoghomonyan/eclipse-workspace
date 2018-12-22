//package jUnit;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class JUnitTest {
//
//	private WebDriver driver;
//	private String URL;
//
//	@Before
//	public void setUp() throws Exception {
//		System.setProperty("webdriver.chrome.driver", "/Users/vardansoghomonyan/chromedriver");
//		driver = new ChromeDriver();
//		URL = "https://m.vbet.com";
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		driver.quit();
//	}
//
//	@Test
//	public void unitTest() throws InterruptedException {
//		driver.get(URL);
//		String RealTitle = driver.getTitle();
//		String TitleShouldBe = "Vbet.com";
//
//		assertEquals(TitleShouldBe, RealTitle);
//		Thread.sleep(10000);
//	}
//
//}
//
////ASHXATOX JUNIT CODE, Commentner@ hanel
