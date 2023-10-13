# CFW_Online_Batch23
Java, Selenium WD, CucumberBDD, Jenkins, Git, CI/CD, TestNG, Maven, POM.xml ect

# What's left
- Branch - done
- Cross-browser - done
- Cross-env (qa/stage/prod) - Hook.class
- Use different test data for different env
- Report - if test fail, take screenshot
- CI/CD using Jenkins


# How to run the test?
mvn verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags=@hb