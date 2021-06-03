Feature: This is NinjaStore Testing 
Scenario: Opening Ninjastrore
 Given launch browser and open ninjastore 
 When search products "Mac" in searchbox
 Then select MacBook Pro
 