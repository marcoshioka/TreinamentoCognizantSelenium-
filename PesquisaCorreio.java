package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class PesquisaCorreio {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\501479\\Desktop\\WebDriver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.buscacep.correios.com.br/sistemas/buscacep/buscaCepEndereco.cfm");
		driver.findElement(By.xpath("//*[@id='Geral']/div/div/span[2]/label/input")).sendKeys("Rua dos Vianas");
		driver.findElement(By.xpath("//*[@id='Geral']/div/div/div[6]/input")).click();
		
		String text = driver.findElement(By.className("tmptabela")).getText();
        System.out.println(text);
		
		
	}

}
