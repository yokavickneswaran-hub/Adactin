$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/FirstProject.feature");
formatter.feature({
  "name": "To validate login funcionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate login using valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter\"\u003cusername\u003e\" and \"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clk login btn",
  "keyword": "And "
});
formatter.step({
  "name": "you must be displayed with error  message the \"\u003ccombination\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user select location,hotels,roomtype,roomno,checkin,checkout,adultperroom,childperroom,searchbtn,Submit,radiobutton,countinue,first_name,last_name,address,cc_num,cc_type,cc_exp_month,cc_exp_year,cc_cvv,book_now",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "pass",
        "combination"
      ]
    },
    {
      "cells": [
        "wizardian123",
        "wizardian123",
        "positive"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_in_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter\"wizardian123\" and \"wizardian123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clk login btn",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clk_login_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "you must be displayed with error  message the \"positive\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.you_must_be_displayed_with_error_message_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select location,hotels,roomtype,roomno,checkin,checkout,adultperroom,childperroom,searchbtn,Submit,radiobutton,countinue,first_name,last_name,address,cc_num,cc_type,cc_exp_month,cc_exp_year,cc_cvv,book_now",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_select_location_hotels_roomtype_roomno_checkin_checkout_adultperroom_childperroom_searchbtn_Submit_radiobutton_countinue_first_name_last_name_address_cc_num_cc_type_cc_exp_month_cc_exp_year_cc_cvv_book_now()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_in_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using invalid credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clk login btn",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_clk_login_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user must be in invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_must_be_in_invalid_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});