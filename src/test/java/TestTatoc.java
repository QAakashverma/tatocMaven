import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestTatoc
{
    private WebDriver driver;

    @BeforeSuite
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash.verma\\Downloads\\chromedriver_win32\\chromedriver.exe");
        this.driver = new ChromeDriver();

        //Navigate to URL
        driver.navigate().to("http://10.0.1.86/tatoc");
    }

    @Test(priority = 1)
    public void home()
    {
        HomePage.lnk_BasicCourse(driver).click();
    }

    @Test(priority = 2)
    public void gridGate()
    {
        WebElement green = GridGate.greenBox(driver);

        Assert.assertEquals("greenbox", green.getAttribute("class"));
        green.click();
    }

    @Test(priority = 3)
    public void frameDungeon()
    {
        //Switch to main frame
        FrameDungeon.switch_to_main_frame(driver);
        String box1Color = FrameDungeon.boxColor(driver);

        while(true)
        {
            //Switch to child frame
            FrameDungeon.switch_to_child_frame(driver);
            String box2Color = FrameDungeon.boxColor(driver);

            if (!box1Color.equals(box2Color))
            {
                //Switch to parent(main) frame
                FrameDungeon.switch_to_parent_frame(driver);
                FrameDungeon.lnk_repaint(driver).click();
            }
            else
                break;
        }//end while

        //Switch frame to parent
        FrameDungeon.switch_to_parent_frame(driver);
        FrameDungeon.lnk_proceed(driver).click();
    }

    @Test(priority = 4)
    public void dragAround()
    {
        WebElement toDrag = DragAround.dragBox(driver);
        WebElement dropBox = DragAround.dropBox(driver);

        DragAround.dragAndDrop(driver, toDrag, dropBox);

        DragAround.lnk_proceed(driver).click();
    }

    @AfterSuite
    public void exit()
    {
        driver.close();
    }
}
