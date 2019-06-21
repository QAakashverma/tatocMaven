import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameDungeon
{
    private static WebElement element;

    public static void switch_to_main_frame(WebDriver driver)
    {
        driver.switchTo().frame("main");
    }

    public static void switch_to_child_frame(WebDriver driver)
    {
        driver.switchTo().frame("child");
    }

    public static void switch_to_parent_frame(WebDriver driver)
    {
        driver.switchTo().parentFrame();
    }

    public static String boxColor(WebDriver driver)
    {
        element = driver.findElement(By.id("answer"));
        return element.getAttribute("class");
    }

    public static WebElement lnk_repaint(WebDriver driver)
    {
        element = driver.findElement(By.linkText("Repaint Box 2"));

        return element;
    }

    public static WebElement lnk_proceed(WebDriver driver)
    {
        element = driver.findElement(By.linkText("Proceed"));
        return element;
    }
}
