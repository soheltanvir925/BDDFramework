@release
Feature: Test case automation on Samsung

	@tag
		Scenario: Check navigation bar working properly
		Given User is on Homepage 
		When User click on Computing menu
		And Close the browser
	
	@tag
		Scenario: Check search function working properly
		Given User is on Homepage 
		When User click on search Button
		Then User input keyword on search box 
		And Close the browser

  @tag
  	Scenario: Check language change function working properly
		Given User is on Homepage
		When User click on language dropdown menu
		Then select other language 
		Then click on continue button
		And Close the browser

	@tag
		Scenario: Check Slider change function working properly
		Given User is on Homepage
		When User click on scroll menu
		And Close the browser
		
	@tag
		Scenario: Check dropdown menu working properly
		Given User is on Homepage
		When User click on mobile menu
		Then click on dropdown smartphone menu
		Then click on Galaxys products 
		Then click on quick look 
		And Close the browser
		
	@tag
		Scenario: Check footer menu function working properly
		Given User is on Homepage
		When User click on smartphones on product and service menu
		And Close the browser
		
	@tag
		Scenario: Check footer menu function working properly
		Given User is on Homepage
		When User click on sound device on product and service menu
		And Close the browser
		
	@tag
		Scenario: Check footer menu function working properly
		Given User is on Homepage
		When User click on monitors on product and service menu
		And Close the browser
		
	@tag
		Scenario: Check footer menu function working properly
		Given User is on Homepage
		When User click on company info on About us menu
		And Close the browser
		
	@tag
		Scenario: Check footer menu function working properly
		Given User is on Homepage
		When User click on business area on About us menu
		And Close the browser

	@tag
		Scenario: Check footer menu function working properly
		Given User is on Homepage
		When User click on Brand identity on About us menu
		And Close the browser
		
	@tag
		Scenario: Check footer menu function working properly
		Given User is on Homepage
		When User click on Ethics on About us menu
		And Close the browser
	
	@tag
		Scenario: Check footer menu function working properly
		Given User is on Homepage
		When User click on Samsung Design on About us menu
		And Close the browser
	
	@tag
		Scenario: Check footer menu function working properly
		Given User is on Homepage
		When User click on Email Us on Support menu
		And Close the browser
		
	@tag
		Scenario: Check footer menu function working properly
		Given User is on Homepage
		When User click on Whatsapp Us on Support menu
		And Close the browser
		
	@tag
		Scenario: Check footer menu function working properly
		Given User is on Homepage
		When User click on Phone on Support menu
		And Close the browser
	
	@tag
		Scenario: Check TV & AV section working properly
		Given User is on Homepage
		When User click on QLED 4K
		And User click on Crystal 4K UHD
		And Close the browser
		
	@tag
		Scenario: Check Home appliance section working properly
		Given User is on Homepage
		And User click on Washer Machines
		And Close the browser
	

	@tag
		Scenario: Check dropdown menu working properly
		Given User is on Homepage
		When User click on Home Applience menu
		Then click on dropdown Front load menu
		And Close the browser
		
	@tag
		Scenario: Check Home appliance section working properly
		Given User is on Homepage
		When User click on TV & AV menu
		And Close the browser
		
	@tag
		Scenario: Check Home appliance section working properly
		Given User is on Homepage
		When User click on Support menu
		And Close the browser