package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CadastroAzul {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\501479\\Desktop\\WebDriver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.voeazul.com.br/tudoazul/cadastro-rapido");
		driver.findElement(By.id("nome")).sendKeys("Marco");
		driver.findElement(By.id("sobrenome")).sendKeys("Veio");
		driver.findElement(By.xpath("//*[contains(text(),'Não possuo')]")).click();
		driver.findElement(By.xpath("//*[@id='cadastro-form']/fieldset/div[1]/div[3]/div/ul/li[3]/a")).click();
		driver.findElement(By.id("cpf")).sendKeys("28714233509");
		driver.findElement(By.id("data")).sendKeys("11111995");
		driver.findElement(By.xpath("//*[@id='genero']/label[2]")).click();
		driver.findElement(By.id("celular")).sendKeys("11988172328");
		driver.findElement(By.id("cep")).sendKeys("04248000");
		driver.findElement(By.id("cep")).sendKeys(Keys.TAB);
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.or(
		    ExpectedConditions.visibilityOfElementLocated(By.id("end_num")),
		    ExpectedConditions.visibilityOfElementLocated(By.id("end_compl"))
		));
		driver.findElement(By.id("end_num")).click();
		driver.findElement(By.id("end_num")).sendKeys("26");
		driver.findElement(By.id("end_compl")).sendKeys("fundos");
		driver.findElement(By.id("email")).sendKeys("marco_veio@cheryamur.com.br");
		driver.findElement(By.id("senha")).sendKeys("pass4321");
		driver.findElement(By.id("confirmacao")).sendKeys("pass4321");
		driver.findElement(By.id("confirmacao")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id='submit']")).click();

	}

}
