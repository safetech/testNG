import com.excelData.excelData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;


@Test () 
public class driverTest extends excelData {
    public WebDriver driver;
    public WebDriverWait wait;
    String appURL = "https://www.linkedin.com/";

    //
//
    @BeforeClass
    public void testSetup() {
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 9);
    }

    @DataProvider(name="empLogin")
    public Object[][] loginData() {
        Object[][] arrayObject = getExcelData("/Users/sislam13/Desktop/TestCases.xls", "Sheet1");
        return arrayObject;
    }
    
//    @DataProvider
//    public Object[][] data(){
//        return new String [][]{
//            new String[]{"data1"}, new String[]{"data2"}, new String []{"3"}, new String[]{"d4"}, new String[]{"d5"}
//        };
//    }
    
    @ObjectFactory
    
    
    @Test(dataProvider = "empLogin")
    public void test(linkedInWelcomePage identifiers, String userName, String password ){
        driver.navigate().to(appURL);
        
    }




        
}
