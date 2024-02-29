package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driver {
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\erebo\\OneDrive\\Masaüstü\\Web_Auto_Skeletion\\Web_Auto_Skeletion\\src\\test\\resources\\Drivers\\chromedriver.exe");
        ChromeOptions wd = new ChromeOptions();
        wd.addArguments("--remote-allow-origins=*");
        ChromeDriver testDriver = new ChromeDriver(wd);
        testDriver.manage().window().maximize();
        return testDriver;
    }
}
