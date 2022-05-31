Feature:  user want to visit dell web page and verify search

 In order to verify search 
 as a register uger 
 i want to visit dell web page and write a text in serch box then search
  
 Scenario Outline: 
   Given  user visit dell home page
   When   user search by "<productname>"
   Then    user click on search button
Examples:

| productname       | 
| iphone 12 pro max |