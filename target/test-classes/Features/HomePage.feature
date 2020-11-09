Feature: Weight Watchers Test Cases 

@Smoke
Scenario: Verify Page Title match
	Given  Launch "<URL>" 
	Then  Verify Page Title

@Smoke
Scenario: Verify Page Title Find a Workshop
	Given Launch "<URL>" 
	When Click on find a workshop
	Then Verify title of Workshop page

@Smoke
Scenario: Verify workshop zipcode search
	Given Launch "<URL>" 
	When Click on find a workshop
	And Type zipcode search field
	And Click on search
	Then Verify title of first search
