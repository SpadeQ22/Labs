import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class myFirstSelenium {
    static WebDriver driver;
    static  final String WEBSITE="http://formy-project.herokuapp.com/form";
    @BeforeAll
    public  static  void  initSelenium(){
        WebDriverManager.chromedriver().setup();

    }
    @Nested
    @DisplayName("Testing on Chrome Browser")
    public  class ChromeTesting{
        @BeforeAll
        public static void initEdge(){
            driver = new ChromeDriver();
        }
        @Test
        public  void toggle(){
            driver.get(WEBSITE);
            WebElement first_name = driver.findElement(By.id("first-name"));
            first_name.sendKeys("Omar");
            WebElement last_name = driver.findElement(By.id("last-name"));
            last_name.sendKeys("Ashraf");
            WebElement job_title = driver.findElement(By.id("job-title"));
            job_title.sendKeys("Student");
            WebElement radio_button = driver.findElement(By.id("radio-button-2"));
            radio_button.click();
            WebElement check_box = driver.findElement(By.id("checkbox-1"));
            check_box.click();
            WebElement btn = driver.findElement(By.className("btn"));
            btn.click();

        }

    }

//    @AfterEach
//    public void tearDownDriver(){
//        if(driver!=null){
//            driver.quit();
//        }
//    }
}
