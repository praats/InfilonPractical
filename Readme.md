README with:
o How to run the tests
o Framework choice justification
o Short explanation of architecture (1–2 paragraphs max)



1. mvn clean test
   - POM file having cucumberTest as file to run in surefire plugin

2. Hybrid Framework 
    - This is modular, BDD framework created with Page Object Model pattern and we can enhance and extend it 
      to hybrid by creation of property file and keeping URL in it and fetching it to step definition file.
      Logging mechanism I have implemented but still there many improvement we can do this. I keep this
      as limited for quick finish.

3. Architecture wise, BDD layer, Page layers, Test layer, utility as Driver and Steps, I have created
   - I use features where BDD files kept as readable format like scenario.feature
   - CucumberTest - runner file where BDD, feature, step def & Hooks file runs as After and Before.
   - POM : I have created BasePage as abstract class and inherited to CommonPage.
     - as there are 4 pages involves, I did not create separate page, but we can extend it easily from commonpage
     - all pages can be inherited
     - BasePage contains all common selenium method and footer career link section there.
     - Pages contains locators and actions those used into StepDefinition
     - steps/FirstScenario is test layer where steps and methods are mentioned into it.

Note* - There are still things are there to enhance this framework.
    - Assertions, I kept on final text match, rest placed, I have used wait method to verified titles.
    