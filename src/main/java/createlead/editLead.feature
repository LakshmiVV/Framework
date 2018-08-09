Feature: Editing a lead
Background:
Given open the browser
And maximize the window
And launch the url
And set the timeout
Given Enter the username as Demosalesmanager
And Enter the password as crmsfa
And click the login
And click the crmsfa
And click the Leads
@smoke
Scenario: Editing the lead
Given click on Find leads button
And Enter the firstname as Lakshmi
And click on findLeads button
And click the first resulting id
And click on edit button
And change the Salutation as Italian
When click on update button
Then verify the Salution