Feature: To check the all fields Automation practice site in automation practice site
@RadioField @E2Erun
Scenario: I Check the Radio Field

Given I launch the automation practice website
When Click the Radio Option-One on Radio field
And Click the Radio Option-Two on Radio field
Then Click the Radio Option-Three on Radio field
@countryField @E2Erun
Scenario: I Check the Select the country
When I click the select country field
Then I enter the country name in country name field
@DropdownField @E2Erun
Scenario: I Check the Dropdown functionality
When I click the Dropdown in Options and select the OptionOne
And  I click the Dropdown in Options and select the Optiontwo
Then I click the Dropdown in Options and select the Optionthree
@checkboxField @E2Erun
Scenario: I Check the checkbox functionality
When I click the OptionOne checkbox in Options checkbox field
And  I click the Optiontwo checkbox in Options checkbox field
Then I click the Optionthree checkbox in Options checkbox field
@switchtoWindow @E2ERun
	Scenario: To switch to window handle functionality
		When I click on open window button
		And I need to switch to the child Window and close window
		And I switch to parent window
	
@TocheckswitchtoTab @E2ERun
	Scenario: switch to Tab methods
		When I click on open tab button
		And I need to switch to tab
		Then I close the child tab and switch to parent tab
		
		
@Tocheckswitcalert @E2ERun
	Scenario: To handle alerts
		And I click the alert button 
		And I able to switch to alert and click on popup alert
		And I click on confirm button
		Then I switch to alert  click on dismiss alert popup
		
		
			@GetTableData  @E2ERun
	Scenario: Get Table Data
		Then Get course details for selenium course details
		And Get Chennai city name selection data 
		
	@GetElementvisibility  @E2ERun
	Scenario: Get the element visibility
		When I click on hide button
		And I click on Show button
				
	@Actionchains  @E2ERun
	Scenario: Use Action chains for mouse hover
		When I click on mouse hover button 	
		And I click on reload button
		
	@Iframe  @E2ERun
	Scenario: Access the iframe
		When I switch to iframe and click the home button
		
		
		
