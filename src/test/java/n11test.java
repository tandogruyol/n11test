import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class n11test
{

    static WebDriver driver;

    public static void main(String [] args) throws InterruptedException {

        setUp();
        driver.navigate().to("https://www.n11.com/");//
        Thread.sleep(1000);
        System.out.println("Anasayfayya giriş yapıldı");
        findElement(By.cssSelector("#header > div > div > div.hMedMenu > div.customMenu > div.myAccountHolder.customMenuItem.withLocalization > div > div > a.btnSignIn")).click();

        //driver.findElement(By.cssSelector("#email")).click();
        Thread.sleep(1000);
        findElement(By.id("email")).sendKeys("taner.dogruyol60@gmail.com");
        //driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[1]/div/form/div[1]/input")).sendKeys("sefamelek868@hotmail.com");
       Thread.sleep(1000);
        findElement(By.id("password")).sendKeys("2504684Td");
        //driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[1]/div/form/div[2]/input")).sendKeys("sanane123");

       // driver.findElement(By.cssSelector("#loginForm > div:nth-child(1)")).sendKeys("sesss");
        //driver.findElement(By.cssSelector("#loginForm > div:nth-child(2)")).sendKeys("sas");
        findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[1]/div/form/div[4]")).click();
        Thread.sleep(1000);

        clickElement((By.id("searchData")));
        Thread.sleep(1000);
        findElement(By.id("searchData")).sendKeys("samsung");

        //driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[2]/div[1]/div/form/input[1]")).sendKeys("samsung");
        clickElement((By.cssSelector("a.searchBtn")));
        System.out.println("Samsung için sonuç bulundu");

        Thread.sleep(1000);
        clickElement((By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[4]/a[2]")));
        System.out.println("2. sayfaya geçildi");

        Thread.sleep(1000);
        clickElement((By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/section/div[2]/ul/li[3]/div/div[1]/span")));
        Thread.sleep(1000);
        clickElement((By.xpath("/html/body/div[1]/header/div/div/div[2]/div[2]/div[2]/div[1]/a[1]")));
         Thread.sleep(1000);
        clickElement((By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div[1]/div[2]/ul/li[5]/a")));
        System.out.println("Ürün favorilere alındı");

        Thread.sleep(1000);
        clickElement((By.cssSelector("#myAccount > div.accContent > ul > li.wishGroupListItem.favorites > div > a > h4")));

        Thread.sleep(1000);
        clickElement((By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[3]/div[1]/div[2]/ul/li/div/div[3]/span")));

        Thread.sleep(1000);
        clickElement((By.cssSelector("body > div.lightBox > div > div > span")));
        System.out.println("Ürün favorilerden kaldırıldı");

        Thread.sleep(3000);

        driver.close();


    }


    public static WebElement findElement(By by){
    return driver.findElement(by);

    }

    public static void setUp (){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver= new ChromeDriver();
    }
    public static void clickElement(By by){
        findElement(by).click();
    }

}



