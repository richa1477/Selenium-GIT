package Selenium01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium01 {
    @Test
    public void Test_Selenium01(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.close();
        System.out.println("Success");
    }
}
