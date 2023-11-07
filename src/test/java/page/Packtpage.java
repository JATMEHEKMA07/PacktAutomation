package page;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Packtpage extends Base {

	public void user_on_homepage_validate_colour_text_and_position_of_packt() {

		WebElement packt = driver.findElement(By.xpath("//img[@class='logo']"));
		ColorOfElement(packt, "color", "#454a55");

		GetTextOfElement(packt, "");

		PositionOfElement(packt, 55, 20);

	}

	public void verify_colour_text_and_position_of_Advance_Search() {

		WebElement advance = driver.findElement(By.xpath("(//button[@type='button'])[1]"));

		ColorOfElement(advance, "color", "#ec6611");

		GetTextOfElement(advance, "Advanced Search");

		PositionOfElement(advance, 325, 15);

	}

	public void verify_colour_text_and_position_of_Start_free_trial() {
		driver.navigate().refresh();
		WebElement free = driver.findElement(By.xpath("(//a[@class='button'])[1]"));
		explicitweight(free);
		ColorOfElement(free, "color", "#ffffff");

		GetTextOfElement(free, "Start FREE trial");

		PositionOfElement(free, 679, 307);

	}

	public void verify_colour_text_and_position_of_Sign_in() {

		WebElement Sign = driver.findElement(By.xpath("//a[@class='style-1 nav-link']"));
		ColorOfElement(Sign, "color", "#4ac5e3");

		GetTextOfElement(Sign, "Sign In");

		PositionOfElement(Sign, 1156, 22);

	}

	public void verify_colour_text_and_position_of_Read_now() {

		WebElement Read = driver.findElement(By.xpath("//div[@class='pl-0 col-sm-4']/a"));
		ColorOfElement(Read, "color", "#ffffff");

		GetTextOfElement(Read, "Read now");

		PositionOfElement(Read, 736, 592);

	}

	public void verify_colour_text_and_position_of_Advance_your_knowledge_in_tech() {

		WebElement Advance = driver.findElement(By.xpath("//div[@class='col-md-6 mx-auto']/h2"));
		ColorOfElement(Advance, "color", "#ffffff");

		GetTextOfElement(Advance, "Advance your knowledge in tech");

		PositionOfElement(Advance, 437, 150);

	}

	public void verify_colour_text_and_position_of_Your_suggested_titles() {

		WebElement Title = driver.findElement(By.xpath("//div[@class='d-flex justify-content-center']/h2"));
		ColorOfElement(Title, "color", "#ffffff");

		GetTextOfElement(Title, "Your Suggested Titles");

		PositionOfElement(Title, 604, 477);

	}
	public void user_click_on_browse_library_he_should_land_on_browse_lib_homepage() {

		WebElement sign = driver.findElement(By.xpath("//a[@class='style-1 nav-link']"));
		ExecutorClick(sign);
		WebElement email = driver.findElement(By.xpath("//input[@id='inline-form-input-username']"));
		email.sendKeys("sudhirmalik8051@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='inline-form-input-password']"));
		pass.sendKeys("Lgr.pB@5$V6eVhz"); 
		WebElement signin = driver
				.findElement(By.xpath("//button[@class='login-page__main__container__login__form__button__login']"));
		ExecutorClick(signin);
		WebElement browser = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		ExecutorClick(browser);
		assertTrue(driver.findElement(By.xpath("//div[@class='filter-results']")).isDisplayed());
	}

	public void user_click_on_advanced_search_he_should_land_on_advanced_search_page() {
		WebElement Advance = driver
				.findElement(By.xpath("//button[@class='button--more-info btn btn-primary advanced-search-button']"));
		ExecutorClick(Advance);
		assertTrue(
				driver.findElement(By.xpath("//div[@class='advanced-search__search-form__header']/h2")).isDisplayed());

	}

	public void user_click_on_my_lib_and_then_on_all_option_provided_below_he_should_be_redirected_to_respective_pages() {

		driver.navigate().refresh();
		driver.findElement(By.xpath("//li[@id='library-dropdown']")).click();

		List<WebElement> list = driver.findElements(By.xpath("//a[@class='dropdown-item']"));

		for (int i = 0; i < 6; i++) {

			if (i == 0) {
				driver.findElement(By.xpath("(//a[@class='dropdown-item'])[1]")).click();

				WebElement Element1 = driver.findElement(By.xpath("//a[@class='button']"));
				String Text1 = Element1.getText();
				System.out.println(Text1);

				if (Element1.isDisplayed()) {
					assertTrue(true);
					driver.findElement(By.xpath("//a[@id='library-dropdown']")).click();
				} else {
					assertTrue(false);
				}

			}
			if (i == 1) {
				WebElement home = driver.findElement(By.xpath("(//a[@class='dropdown-item'])[2]"));
				home.click();
				WebElement Element2 = driver.findElement(By.xpath("//h2[@class='title']"));
				String Text2 = Element2.getText();
				System.out.println(Text2);

				if (Element2.isDisplayed()) {
					assertTrue(true);
					driver.findElement(By.xpath("//a[@id='library-dropdown']")).click();
				} else {
					assertTrue(false);
				}

			}
			if (i == 2) {
				driver.findElement(By.xpath("(//a[@class='dropdown-item'])[3]")).click();

				WebElement Element3 = driver.findElement(By.xpath("//h2[@class='title']"));
				String Text3 = Element3.getText();
				System.out.println(Text3);

				if (Element3.isDisplayed()) {
					assertTrue(true);
					driver.findElement(By.xpath("//a[@id='library-dropdown']")).click();
				} else {
					assertTrue(false);
				}
			}
			if (i == 3) {
				driver.findElement(By.xpath("(//a[@class='dropdown-item'])[4]")).click();

				WebElement Element4 = driver.findElement(By.xpath("//div[@ class='note-header']/h2"));
				String Text4 = Element4.getText();
				System.out.println(Text4);

				if (Element4.isDisplayed()) {
					assertTrue(true);
					driver.findElement(By.xpath("//a[@id='library-dropdown__BV_toggle_']")).click();
				} else {
					assertTrue(false);
				}
			}
			if (i == 4) {
				driver.findElement(By.xpath("(//a[@class='dropdown-item'])[5]")).click();

				WebElement Element5 = driver
						.findElement(By.xpath("//div[@class='row pl-5 header-container mt-5 mb-0']/h2"));
				String Text5 = Element5.getText();
				System.out.println(Text5);

				if (Element5.isDisplayed()) {
					assertTrue(true);
					driver.findElement(By.xpath("(//a[@aria-haspopup='true'])[1]")).click();
				} else {
					assertTrue(false);
				}
			}
			if (i == 5) {
				driver.findElement(By.xpath("(//a[@class='dropdown-item'])[6]")).click();

				WebElement Element6 = driver
						.findElement(By.xpath("//section[@class='full-width-container header-block']/h1"));
				String Text6 = Element6.getText();
				System.out.println(Text6);

				if (Element6.isDisplayed()) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
			}
		}
	}

	
}

