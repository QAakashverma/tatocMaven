import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GridGate
{
    private static WebElement element;

    public static WebElement greenBox(WebDriver driver)
    {
        element = driver.findElement(By.className("greenbox"));
        return element;
    }
}
