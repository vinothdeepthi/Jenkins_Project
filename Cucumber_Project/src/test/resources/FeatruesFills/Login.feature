Feature: This is Book Cart Appliaction Demo
 
Scenario: User Able To Register The Book Cart Application
         
    
    Given User Should Be Navigate The Application
    And User Click On The Login Link
    And User Click On The Register Link
    And User Enter The First Name As "vinothss"
    And User Enter The Last Name As "Vinothss"
    And User Enter The User Name As "divyabalarajs"
    And User Enter The Password As "Vinothbe@23"
    And User Enter The Confirm Password As "Vinothbe@23"
    And User Select The Gender As Male
    When User Click On The Register button
    Then User Successfully Register on Book Cart Application
    
    
    
