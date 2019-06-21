import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAround
{
    private static WebElement element;

    public static WebElement dragBox(WebDriver driver)
    {
        element = driver.findElement(By.id("dragbox"));
        return element;
    }

    public static  WebElement dropBox(WebDriver driver)
    {
        element = driver.findElement(By.id("dropbox"));
        return element;
    }

    public static void dragAndDrop(WebDriver driver, WebElement toDrag, WebElement dropbox)
    {
        Actions action = new Actions(driver);
        action.dragAndDrop(toDrag, dropbox).build().perform();
    }

    public static WebElement lnk_proceed(WebDriver driver)
    {
        element = driver.findElement(By.linkText("Proceed"));
        return element;
    }
}
