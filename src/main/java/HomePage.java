import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage
{
    private static WebElement element = null;

    public static WebElement lnk_BasicCourse(WebDriver driver)
    {
        element = driver.findElement(By.linkText("Basic Course"));
        return element;
    }

    public static WebElement lnk_AdvanceCourse(WebDriver driver)
    {
        element = driver.findElement(By.linkText("Advanced Course"));
        return element;
    }
}
