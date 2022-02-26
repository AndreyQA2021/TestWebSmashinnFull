package pages;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "/html/body/div[22]/div[3]/div/div[1]/div/div[2]/div/button[2]")
    WebElement AcceptCookies;

    @FindBy(xpath = "//body/div[@id='header']/div[1]/div[3]/div[17]/div[2]/div[1]/div[1]/form[1]/input[1]")
    WebElement FindElement;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[4]/div[1]/label[1]/input[1]")
    WebElement Tecnifibre;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/ul[1]/li[9]/a[1]/img[1]")
    WebElement smashinnline;

    @FindBy(xpath = "//a[contains(text(),'Prince')]")
    WebElement Prince;

    @FindBy(xpath = " /html[1]/body[1]/div[8]/div[1]/section[1]/section[1]/section[1]/section[2]/div[1]/p[1]")
    WebElement Balls;

    @FindBy(xpath = "//body/div[@id='header']/div[1]/div[3]/div[17]/div[2]/div[1]/div[1]/form[1]/input[1]")
    WebElement shoes;

    @FindBy(xpath = "//body/div[@id='header']/div[1]/div[2]/ul[1]/li[11]/a[1]/img[1]")
    WebElement Asics;

    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    WebElement AllCookies;

    @FindBy(xpath = "//body/div[@id='header']/div[1]/div[5]/div[1]/div[4]/ul[1]/li[1]/a[1]")
    WebElement WaterSports;

    @FindBy(xpath = "//body/div[@id='header']/div[1]/div[3]/div[17]/div[2]/div[1]/div[1]/form[1]/input[1]")
    WebElement Accessories;

    @FindBy(xpath = "//body/div[@id='content_all_search']/div[@id='zona_txtfiltros']/div[@id='refinement-list']/div[1]/ul[1]/li[5]/div[1]/label[1]/input[1]")
    WebElement Football;

    @FindBy(xpath = "//span[contains(text(),'Boys´ clothing')]")
    WebElement NikeBall;

    @FindBy(xpath = "//body/div[@id='header']/div[1]/div[2]/ul[1]/li[7]/a[1]/img[1]")
    WebElement SportsWear;

    @FindBy(xpath= " /html/body/div[22]/div[3]/div/div[1]/div/div[2]/div/button[2]")
    WebElement bikeInn;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void AcceptCookies() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AcceptCookies.click();

    }

    public void FindElement(String item) {
        FindElement.sendKeys(item);
        FindElement.submit();
    }

    public void Tecnifibre() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Tecnifibre.click();

    }

    public void smashinnline() {
        smashinnline.click();
    }

    public void Prince() {
        Prince.click();
    }

    public void Balls() {
        Balls.click();
    }

    public void shoes(String item) {
        shoes.sendKeys(item);
        shoes.click();
    }

    public void Asics() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Asics.click();


    }

    public void AllCookies() {
        AllCookies.click();
    }

    public void WaterSports() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WaterSports.click();
    }

    public void Accessories(String item) {
        Accessories.sendKeys(item);
        Accessories.submit();
    }

    public void Football() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Football.click();
    }

    public void NikeBall() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NikeBall.click();
    }

    public void SportsWear() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SportsWear.click();
    }

    public void bikeInn() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bikeInn.click();
    }

}