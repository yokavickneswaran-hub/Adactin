Feature: To validate login funcionality

  Background: 
    Given User in Adactin login page

  @smoke
  Scenario Outline: To validate login using valid credential
    When user enter"<username>" and "<pass>"
    And user clk login btn
    And you must be displayed with error  message the "<combination>"
    Then user select location,hotels,roomtype,roomno,checkin,checkout,adultperroom,childperroom,searchbtn,Submit,radiobutton,countinue,first_name,last_name,address,cc_num,cc_type,cc_exp_month,cc_exp_year,cc_cvv,book_now

    Examples: 
      | username     | pass         | combination |
      | wizardian123 | wizardian123 | positive    |

  Scenario: To validate login using invalid credential
    When user clk login btn
    Then user must be in invalid login page
