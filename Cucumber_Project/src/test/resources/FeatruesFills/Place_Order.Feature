Feature: Place The Order To Book Cart Appliaction 

  

  Scenario Outline: User Able To palce The Order
   
    Given User Able Navigate To The Application
    When User Able Be Login As "<UserName>" And "<Password>"
    And User Search A Books "<Books>"
    And User Add  The Book To The Cart page
    And User Should Be CheckOut The Product
    And User Should Be Entering The Shipping Addres"<Name>" And "<Address1>" And "<Address2>" And "<Pincode>" And "<State>"
    And user Should be Place The Order
    Then User Should Be Verify The Order Id Is Successfully Placed Or Not 
    

    Examples: |
      | UserName  | Password    | Books   |Name | Address1 | Address2|Pincode|State|
      | divyabala | Vinothbe@23 | a princess in theory |kala | tiruttani | tiruvallur | 632209 | tamil |