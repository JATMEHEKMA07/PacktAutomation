package stepDefinition;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Packtpage;

public class Packstep extends Base {
	Packtpage Packt = new Packtpage();

	@When("user on homepage validate colour,text and position of packt")
	public void user_on_homepage_validate_colour_text_and_position_of_packt() {
		Packt.user_on_homepage_validate_colour_text_and_position_of_packt();
	}
	
	@And("verify colour,text and position of Advance Search")
	public void verify_colour_text_and_position_of_Advance_Search() {
		Packt.verify_colour_text_and_position_of_Advance_Search();
	}
	
	@And("verify colour,text and position of Start free trial")
	public void verify_colour_text_and_position_of_Start_free_trial(){
		Packt.verify_colour_text_and_position_of_Start_free_trial();
	}
	
	@And("verify colour,text and position of Sign in")
	public void verify_colour_text_and_position_of_Sign_in() {
		Packt.verify_colour_text_and_position_of_Sign_in();
	}
	
	@And("verify colour,text and position of Read now")
	public void verify_colour_text_and_position_of_Read_now() {
		Packt.verify_colour_text_and_position_of_Read_now();
	}
	
	@And("verify colour,text and position of Advance your knowledge in tech")
	public void verify_colour_text_and_position_of_Advance_your_knowledge_in_tech() {
		Packt.verify_colour_text_and_position_of_Advance_your_knowledge_in_tech();
	}
	
	@Then("verify colour,text and position of Your suggested titles")
	public void verify_colour_text_and_position_of_Your_suggested_titles() {
		Packt.verify_colour_text_and_position_of_Your_suggested_titles();
	}}
