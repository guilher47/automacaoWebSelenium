package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class GooglePage {

    protected WebDriver driver;
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public GooglePage(WebDriver driver){
        this.driver = driver;
    }

    public void acessarSite() throws InterruptedException, IOException {
        driver.navigate().to("https://advantageonlineshopping.com/#/");
        Thread.sleep(5000);
    }

    public void clicarNoCardLaptop() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='laptopsImg']")).click();
        Thread.sleep(2000);
    }

    public void clicarProduto() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='HP Chromebook 14 G1(ES)']")).click();
        Thread.sleep(3000);
    }

    public void validarProdutoTela(){
        driver.findElement(By.xpath("//div[@id='Description']//following::h1[text()=' HP CHROMEBOOK 14 G1(ES) ']")).isDisplayed();
    }

    public void adicionarProdutoCarrinho(){
        driver.findElement(By.xpath("//button[@name='save_to_cart']")).click();
    }

    public void acessarTelaCarrinho() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='shoppingCartLink']")).click();
        Thread.sleep(3000);
    }

    public void validarProdutoCarrinho() {
        driver.findElement(By.xpath("//label[contains(text(),'HP CHROMEBOOK 14 G1(ES)')]")).isDisplayed();
    }

    public void removerProdutoCarrinho() throws InterruptedException{
        driver.findElement(By.xpath("//a[@class='remove red ng-scope']")).click();
        Thread.sleep(2000);
    }

    public void validarCarrinhoVazio()  {
        driver.findElement(By.xpath("//label[text()='Your shopping cart is empty']")).isDisplayed();
    }
}
