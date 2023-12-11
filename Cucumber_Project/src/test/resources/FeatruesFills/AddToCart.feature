Feature: This is Book Cart Appliaction Demo

  Background:
  
   Given User Should Be Navigate To The Application
   
   When User Should Be Login As "<UserName>" And "<Password>"

  Scenario Outline: Add A Product To The Cart
   
    
    And User Search A Book "<Books>"
    And User Add  The Book To The Cart
    Then The Cart Badge Should Be Updated

    Examples: |
      | Username  | Password    | Books   |
      | divyabala | Vinothbe@23 | Roomies |

Scenario: Add To Cart DashBoard Product

And User Select The Product of "HP2"

And User Click On AddoToCart button

Then Verify The Selected Product Successfully Added To The Cart page
