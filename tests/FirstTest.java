package tests;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.InitializePage;
import pages.SearchPageResult;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class FirstTest extends InitializePage {

    @BeforeTest
    public void setUp(){
        super.setUp();
    }

    @Test (priority = 1)
    public void AcceptCookies(){
        homePage.AcceptCookies();
        WebElement e = driver.findElement(By.xpath("/html/body/div[22]/div[3]/div/div[1]/div/div[2]/div/button[2]"));
        Assert.assertEquals(searchPage.AcceptCookies(),e);
        //assertNotNull(utilities.waitForElement(searchPage.searchFlagLogo(), 20));
    }
    @Test (priority = 2)
    public void FindElement(){
        homePage.FindElement("tennis racket");
        WebElement e = driver.findElement(By.xpath("//body/div[@id='header']/div[1]/div[3]/div[17]/div[2]/div[1]/div[1]/form[1]/input[1]"));
        Assert.assertEquals(searchPage.FindElement(),e);

    }
    @Test (priority = 3)
    public void Tecnifibre() {
        homePage.Tecnifibre();
        WebElement e = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[4]/div[1]/label[1]/input[1]"));
        Assert.assertEquals(searchPage.Tecnifibre(), e);
    }
    @Test (priority =4)
    public void smashinnline() {
        homePage.smashinnline();
        WebElement e = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/ul[1]/li[9]/a[1]/img[1]"));
        Assert.assertEquals(searchPage.smashinnline(), e);
    }
    @Test (priority =5)
    public void Prince() {
        homePage.Prince();
        WebElement e = driver.findElement(By.xpath("//a[contains(text(),'Prince')]"));
        Assert.assertEquals(searchPage.Prince(), e);
    }

        @Test (priority =6)
        public void Balls () {
            homePage.Balls();
            WebElement e = driver.findElement(By.xpath("/html[1]/body[1]/div[8]/div[1]/section[1]/section[1]/section[1]/section[2]/div[1]/p[1]"));
            Assert.assertEquals(searchPage.Balls(), e);
    }

    @Test (priority =7)
    public void shoes () {
        homePage.shoes("shoes");
        WebElement e = driver.findElement(By.xpath("//body/div[@id='header']/div[1]/div[3]/div[17]/div[2]/div[1]/div[1]/form[1]/input[1]"));
        Assert.assertEquals(searchPage.shoes(), e);
    }
    @Test (priority =8)
    public void Asics () {
        homePage.Asics();
        WebElement e = driver.findElement(By.xpath("//body/div[@id='header']/div[1]/div[2]/ul[1]/li[11]/a[1]/img[1]"));
        Assert.assertEquals(searchPage.Asics(), e);
    }
    @Test (priority =9)
    public void AllCookies () {
        homePage.AcceptCookies();
        WebElement e = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        Assert.assertEquals(searchPage.AllCookies(), e);
    }
    @Test (priority =10)
    public void WaterSports () {
        homePage.WaterSports();
        WebElement e = driver.findElement(By.xpath("//body/div[@id='header']/div[1]/div[5]/div[1]/div[4]/ul[1]/li[1]/a[1]"));
        Assert.assertEquals(searchPage.WaterSports(), e);
    }
    @Test (priority =11)
    public void Accessories () {
        homePage.Accessories("Balls");
        WebElement e = driver.findElement(By.xpath("//body/div[@id='header']/div[1]/div[3]/div[17]/div[2]/div[1]/div[1]/form[1]/input[1]"));
        Assert.assertEquals(searchPage.Accessories(), e);
    }
    @Test (priority =12)
    public void Football() {
        homePage.Football();
        WebElement e = driver.findElement(By.xpath("//body/div[@id='content_all_search']/div[@id='zona_txtfiltros']/div[@id='refinement-list']/div[1]/ul[1]/li[5]/div[1]/label[1]/input[1]"));
        Assert.assertEquals(searchPage.Football(), e);
    }
    @Test (priority =13)
    public void NikeBall() {
        homePage.NikeBall();
        WebElement e = driver.findElement(By.xpath("//span[contains(text(),'Boys´ clothing')]"));
        Assert.assertEquals(searchPage.NikeBall(), e);
    }


   @Test (priority =14)
    public void SportsWear() {
        homePage.SportsWear();
        WebElement e = driver.findElement(By.xpath("//body/div[@id='header']/div[1]/div[2]/ul[1]/li[7]/a[1]/img[1]"));
        Assert.assertEquals(searchPage.SportsWear(), e);
    }

    @Test (priority =15)
    public void bikeInn() {
        homePage.bikeInn();
        WebElement e = driver.findElement(By.xpath("/html/body/div[22]/div[3]/div/div[1]/div/div[2]/div/button[2]"));
        Assert.assertEquals(searchPage.bikeInn(), e);
    }
    public void tearDown() throws IOException {
        // utilities.screenshot();
        super.tearDown();
    }
}