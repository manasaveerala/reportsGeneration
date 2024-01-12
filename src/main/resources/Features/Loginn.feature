Feature: Login with Valid Credentials

  @sanity @regression
  Scenario: Successful Login with Valid Credentials
  Given User Launch browser
  And opens URL "http://localhost/opencart/upload/"
  When User navigate to MyAccount menu
  And click on Login
  And User enters Email as "anushakondeti@gmail.com" and Password as "kondeti@123"
  And Click on Login button
  Then User navigates to MyAccount Page