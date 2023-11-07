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
	
	