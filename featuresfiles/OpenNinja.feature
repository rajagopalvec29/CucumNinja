Feature: This is NinjaStore Testing 

Background:
   When launch browser and open ninjastore 

Scenario: Ordering Mac
 When search products "Mac" in searchbox
 Then select MacBook Pro
 
 
 Scenario: Ordering Iphone
 When search products "phone" in searchbox
 Then select iphone mobile
 
  Scenario: Ordering Tab
 When search products "tab" in searchbox
 Then select samsung tab