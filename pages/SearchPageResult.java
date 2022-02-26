package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageResult extends BasePage {

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

    @FindBy(xpath = " /html/body/div[22]/div[3]/div/div[1]/div/div[2]/div/button[2]")
    WebElement bikeInn;

    public SearchPageResult(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement AcceptCookies() {
        return AcceptCookies;
    }

    public WebElement FindElement() {
        return FindElement;
    }

    public WebElement Tecnifibre() {
        return Tecnifibre;

    }

    public WebElement smashinnline() {
        return smashinnline;
    }

    public WebElement Prince() {
        return Prince;

    }

    public WebElement Balls() {
        return Balls;
    }

    public WebElement shoes() {
        return shoes;
    }

    public WebElement Asics() {
        return Asics;
    }

    public WebElement AllCookies() {
        return AllCookies;
    }

    public WebElement WaterSports() {
        return WaterSports;
    }

    public WebElement Accessories() {
        return Accessories;

    }

    public WebElement Football() {
        return Football;
    }

    public WebElement NikeBall() {
        return NikeBall;
    }

    public WebElement SportsWear() {
        return SportsWear;
    }

    public WebElement bikeInn() {
        return bikeInn;
    }

}