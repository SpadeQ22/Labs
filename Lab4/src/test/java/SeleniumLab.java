import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLab {
    @Test
    public void seltest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }

}
