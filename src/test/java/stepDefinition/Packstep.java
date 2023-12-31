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
	}
	@When("user click on Browse library he should land on Browse lib homepage")
	public void user_click_on_browse_library_he_should_land_on_browse_lib_homepage() {
		Packt.user_click_on_browse_library_he_should_land_on_browse_lib_homepage();
	}

	@And("user click on Advanced search he should land on Advanced search page")
	public void user_click_on_advanced_search_he_should_land_on_advanced_search_page() {
		Packt.user_click_on_advanced_search_he_should_land_on_advanced_search_page();
	}



	@Then("user click on my lib and then on all option provided below he should be redirected to respective pages")
	public void user_click_on_my_lib_and_then_on_all_option_provided_below_he_should_be_redirected_to_respective_pages() {
		Packt.user_click_on_my_lib_and_then_on_all_option_provided_below_he_should_be_redirected_to_respective_pages();
	}
	@When("user click on carousel titles i.e Layered Design for Ruby on Rails Applications")
	public void user_click_on_carousel_titles_i_e_layered_design_for_ruby_on_rails_applications() {
		Packt.user_click_on_carousel_titles_i_e_layered_design_for_ruby_on_rails_applications();
		assertTrue(driver.findElement(By.xpath("//h2[@class='text-white']")).isDisplayed());
	}

	@And("click on Machine Learning Engineering with Python")
	public void click_on_machine_learning_engineering_with_python() {
		Packt.click_on_machine_learning_engineering_with_python();
	}
	@Then("click on Modern generative AI these titles should appear correctly as the main title")
	public void click_on_Modern_generative_AI_these_titles_should_appear_correctly_as_the_main_title() {
		Packt.click_on_Modern_generative_AI_these_titles_should_appear_correctly_as_the_main_title();
	}
	@When("user click on  the top nav")
	public void user_click_on_the_top_nav() {
		Packt.user_click_on_the_top_nav();
	}

	@And("on browser page clear all filter and apply {int} filter for publication date")
	public void on_browser_page_clear_all_filter_and_apply_filter_for_publication_date(Integer int1)  {
		Packt.on_browser_page_clear_all_filter_and_apply_filter_for_publication_date(int1);
	}

	@And("type the Python,Paint,Secure,Tableau words into the search bar")
	public void type_the_python_paint_secure_tableau_words_into_the_search_bar() {
		Packt.type_the_python_paint_secure_tableau_words_into_the_search_bar();

	}

	@Then("check that all titles found include that search text")
	public void check_that_all_titles_found_include_that_search_text() {
		Packt.check_that_all_titles_found_include_that_search_text(); 

	}


}

	
