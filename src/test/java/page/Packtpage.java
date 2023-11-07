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

	}}

