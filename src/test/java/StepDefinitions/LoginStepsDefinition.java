package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition {
	static WebDriver driver;
	///////TC-1///////////
	@Given("User is on Homepage")
	public void user_is_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.samsung.com/bd/");
	}

	@When("User click on Computing menu")
	public void user_click_on_computing_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[normalize-space()='Computing']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.close();
	}

	
	///////TC-2/////////////
	@When("User click on search Button")
	public void user_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@class='nv00-gnb__utility-btn gnb__search-btn-js']//*[name()='svg']")).click();
	}

	@Then("User input keyword on search box")
	public void user_input_keyword_on_search_box() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//h2[@class='text-title']"));
		WebElement search = driver.findElement(By.xpath("//input[@id='gnb-search-keyword']"));
	    search.sendKeys("mobile" + Keys.ENTER);
	}

	////////TC-3/////////////
	@When("User click on language dropdown menu")
	public void user_click_on_language_dropdown_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@class='menu__select-field']//*[name()='svg']")).click();

	}
	@Then("select other language")
	public void select_other_language() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[@class='menu__list-option-text'][normalize-space()='Other Countries or location']")).click();
	}
	@Then("click on continue button")
	public void click_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@aria-label='Button Label']")).click();
	}
	
	/////////TC-4////////////
	@When("User click on scroll menu")
	public void user_click_on_scroll_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@aria-label='Next slide']//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='g']//*[name()='circle' and contains(@cx,'20')]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Next slide']//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='g']//*[name()='circle' and contains(@cx,'20')]")).click();
	}

	////////TC-5/////////
	@When("User click on mobile menu")
	public void user_click_on_mobile_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@role='menuitem'][normalize-space()='Mobile']")).click();
	}
	@Then("click on dropdown smartphone menu")
	public void click_on_dropdown_smartphone_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[normalize-space()='Smartphone']")).click();
	}
	@Then("click on Galaxys products")
	public void click_on_galaxys_products() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//strong[normalize-space()='Galaxy S']")).click();
	}
	@Then("click on quick look")
	public void click_on_quick_look() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='content']/div[contains(@class,'root responsivegrid')]/div[contains(@class,'aem-Grid aem-Grid--12 aem-Grid--default--12')]/div[contains(@class,'responsivegrid aem-GridColumn aem-GridColumn--default--12')]/div[contains(@class,'aem-Grid aem-Grid--12 aem-Grid--default--12')]/div[contains(@class,'pd-g-product-finder-v2 aem-GridColumn aem-GridColumn--default--12')]/section[contains(@class,'pd03-product-finder pd03-product-finder--vertical margin-bottom--normal js-pfv2-finder')]/div[contains(@class,'pd03-product-finder__wrap')]/div[contains(@class,'pd03-product-finder__inner')]/div[contains(@class,'pd03-product-finder__content')]/div[contains(@class,'pd03-product-finder__content-wrap js-pfv2-content-wrap')]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	}
	
	////////TC-6//////////
	@When("User click on smartphones on product and service menu")
	public void user_click_on_smartphones_on_product_and_service_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[@aria-label='Smartphones Smartphones']")).click();
	}
	
	////////TC-7//////////
	@When("User click on sound device on product and service menu")
	public void user_click_on_sound_device_on_product_and_service_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@aria-label='Sound Devices Sound Devices']")).click();
	}

////////TC-8//////////
	@When("User click on monitors on product and service menu")
	public void user_click_on_monitors_on_product_and_service_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@aria-label='Monitors Monitors']")).click();
	}
	
////////TC-9//////////
	@When("User click on company info on About us menu")
	public void user_click_on_company_info_on_about_us_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@aria-label='Company Info Company Info']")).click();
	}
	
///////TC-10///////////
	@When("User click on business area on About us menu")
	public void user_click_on_business_area_on_about_us_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@aria-label='Business Area Business Area']")).click();
	}
	
	///////TC-11//////
	@When("User click on Brand identity on About us menu")
	public void user_click_on_brand_identity_on_about_us_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@aria-label='Brand Identity Brand Identity']")).click();
	}
	
	//////TC-12//////////
	@When("User click on Ethics on About us menu")
	public void user_click_on_ethics_on_about_us_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@aria-label='Ethics Ethics']")).click();
	}

	//////////////TC-13///////
	@When("User click on Samsung Design on About us menu")
	public void user_click_on_samsung_design_on_about_us_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@aria-label='Samsung Design  Samsung Design  : Open in a New Window']")).click();
	}
	
	
	//////////TC-14///////
	@When("User click on Email Us on Support menu")
	public void user_click_on_email_us_on_support_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@aria-label='Email Us Email Us']")).click();
	}
	
	//////////TC-15////////////
	@When("User click on Whatsapp Us on Support menu")
	public void user_click_on_whatsapp_us_on_support_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@aria-label='WhatsApp Us WhatsApp Us']")).click();
	}
	
	//////////TC-16//////////
	@When("User click on Phone on Support menu")
	public void user_click_on_phone_on_support_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@aria-label='Phone Phone']")).click();
	}

	///////////TC-17///////////
	@When("User click on QLED 4K")
	public void user_click_on_qled_4k() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[normalize-space()='QLED 4K']")).click();
	}
	@And("User click on Crystal 4K UHD")
	public void user_click_on_crystal_4k_uhd() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[normalize-space()='Crystal 4K UHD']")).click();
	}

	///////////TC-18///////////
	@When("User click on Washer Machines")
	public void user_click_on_washer_machines() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[normalize-space()='Washer Machines']")).click();
	}

	//////////TC-19///////////
	@When("User click on Home Applience menu")
	public void user_click_on_home_applience_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@role='menuitem'][normalize-space()='Home Appliances']")).click();
	}
	@Then("click on dropdown Front load menu")
	public void click_on_dropdown_front_load_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[normalize-space()='Front Load']")).click();
	}

	///////////TC-20/////////
	@When("User click on TV & AV menu")
	public void user_click_on_tv_av_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@role='menuitem'][normalize-space()='TV & AV']")).click();
	}

	
	/////////TC-21////////
	@When("User click on Support menu")
	public void user_click_on_support_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[normalize-space()='Support']")).click();
	}
	
	
}
