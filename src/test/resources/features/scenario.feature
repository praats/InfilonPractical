Feature: Tenforce Practical sceanrio


  Scenario: Tenforce Practical
    Given I have open URL
    And I go on Career page
    And I go on Life at Tenforce session
    And I Open "Life of two interns" article
    And I scroll through the article
    When I go back to Job openings
    Then I make sure there is the text “Feel free to send your CV to job”