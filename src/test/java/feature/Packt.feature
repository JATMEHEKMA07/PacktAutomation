Feature: Basic Homepage check. 



@pack 
Scenario: 
	To check that all elements on screen are correct, such as positioning, colour, text etc on homepage. 
	When user on homepage validate colour,text and position of packt 
	And  verify colour,text and position of Advance Search 
	And  verify colour,text and position of Start free trial 
	And  verify colour,text and position of Sign in 
	And  verify colour,text and position of Read now 
	And  verify colour,text and position of Advance your knowledge in tech 
	Then verify colour,text and position of Your suggested titles 
	
	
@pack 
Scenario: 
	To check that the top nav bar, and their sub options go to the correct pages. 

	When user click on Browse library he should land on Browse lib homepage 
	And  user click on Advanced search he should land on Advanced search page 
	Then user click on my lib and then on all option provided below he should be redirected to respective pages 
	
@pack 
Scenario: 
	In the “your suggested titles” section, check the titles in the carousel below the main title, and ensure that they appear correctly as the main title.   


	When  user click on carousel titles i.e Layered Design for Ruby on Rails Applications 
	And   click on Machine Learning Engineering with Python 
	Then  click on Modern generative AI these titles should appear correctly as the main title 
	
	@pack 
Scenario: 
	To verify that when user click on browse in the top nav, on the browse page click to clear any filters that are already set, and then click to set the 2021 filter for publication date and search books   
	When user click on  the top nav 
	And  on browser page clear all filter and apply 2021 filter for publication date 
	And  type the Python,Paint,Secure,Tableau words into the search bar 
	Then check that all titles found include that search text 
	