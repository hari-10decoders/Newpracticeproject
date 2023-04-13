Feature: To check the all fields Autoamtion practice site in automation practice site

@RadioField @E2Erun
Scenario: I Check the Radio Field

Given I Launch the web application
When I launch the automation practice website
And Click the Radio Option-One on Radio field
And Click the Radio Option-Two on Radio field
Then Click the Radio Option-Three on Radio field

@countryField @E2Erun
Scenario: I Check the Select the country
When I click the select country field
Then I enter the country name in country name field

@DropdownField @E2Erun
Scenario: I Check the Dropdown fucntionality
When I click the Dropdown in Options and select the OptionOne
And  I click the Dropdown in Options and select the Optiontwo
Then I click the Dropdown in Options and select the Optionthree

@checkboxField @E2Erun
Scenario: I Check the checkbox fucntionality
When I click the OptionOne checkbox in Options checkbox field
And  I click the Optiontwo checkbox in Options checkbox field
Then I click the Optionthree checkbox in Options checkbox field

@switchtoWindow @E2ERun
	Scenario: To switch to window handle fucntionality
		When I click on open window button 
		And I need to switch to new window
		Then I close the child Window
		And I switch to parent window
	
@TocheckswitchtoTab @E2ERun
	Scenario: switch to Tab methods
		When I click on open tab button
		And I need to switch to tab
		Then I close the child tab
		And I switch to parent window
		
		
@Tocheckswitcalert @E2ERun
	Scenario: To handle alerts
		When I enter the text in alert field
		And I click the alert button  
		And I able to swith to alert 
		And I able to click on popup alert
		And I enter the text in alert field1
		When I click on confirm button
		And I need to switch to alert mode
		Then I click on ok on alert popup
		
		
			@GetTableData  @E2ERun
	Scenario: Get Table Data
		Then Get course details for jmeter
		And Get "Chennai" city name selection data  
		
	@GetElementvisibility  @E2ERun
	Scenario: Get the element visibility
		When I click on hide button
		Then Input textbox should not show
		When I click on Show button
		Then Input textbox should show
		
	@Actionchains  @E2ERun
	Scenario: Use Action chains for mouse hover
		When I click reload on mouse hover button 	
		
	@Iframe  @E2ERun
	Scenario: Access the iframe
		When I switch to iframe
		Then I click contact button
		And Verify the contact page
		And Switch to main content
		
		
		