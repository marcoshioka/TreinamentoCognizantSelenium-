package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroSmile {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\501479\\Desktop\\WebDriver\\Firefox\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.smiles.com.br/cadastro");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_firstname")).sendKeys("Marco");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_lastname")).sendKeys("Veio");
	driver.findElement(By.id("dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectNacionality")).click();;
	driver.findElement(By.xpath("//*[@data-dk-dropdown-value='US Citizen']")).click();;
	driver.findElement(By.id("dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectLanguage")).click();;
	driver.findElement(By.xpath("//*[@data-dk-dropdown-value='Português']")).click();;
	driver.findElement(By.xpath("//input[@value='M']")).click();;
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_birthDay")).sendKeys("19");	
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_birthMonth")).sendKeys("03");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_birthYear")).sendKeys("1995");
	driver.findElement(By.id("dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_documentType")).click();;
	driver.findElement(By.xpath("//*[@data-dk-dropdown-value='Passport']")).click();;
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_rg")).sendKeys("1234567890");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_cpf")).sendKeys("51716887534");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_homePhoneDDI")).sendKeys("55");	
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_homePhoneDDD")).sendKeys("11");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_homePhoneNumber")).sendKeys("27288886");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_cellPhoneDDI")).sendKeys("55");	
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_cellPhoneDDD")).sendKeys("11");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_cellPhoneNumber")).sendKeys("982251987");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_email")).sendKeys("marcoveio@teste.com");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_emailConfirm")).sendKeys("marcoveio@teste.com");
	driver.findElement(By.id("dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectCountry")).click();;
	driver.findElement(By.xpath("//*[@data-dk-dropdown-value='BRA']")).click();;
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_zipcode")).sendKeys("77824040");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_zipcode")).click();;
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_streetNumber")).click();;
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_streetNumber")).sendKeys("4321");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_complement")).click();;
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_complement")).sendKeys("casa 2");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_password")).sendKeys("1995");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_passwordConfirm")).sendKeys("1995");
	driver.findElement(By.id("_smilesregistermemberportlet_WAR_smilesaccountportlet_saveButton")).click();;
	}

}
