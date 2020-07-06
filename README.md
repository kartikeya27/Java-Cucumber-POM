# Web Automation with Selenium, Cucumber, Maven, and TestNG using Page Object Pattern in Java (end-to-end)


### Background

I have used Page Object Model pattern for modelling different pages of the application, in order to ensure that framework is robust to UI changes and quite easy to maintain. You can clone this framework, modify the code, and start writing your test suite on top of it. 


### Installation
Please insure that you have following on your laptop.

```sh

Eclipse
Java 8
Eclipse Cucumber Plugin
Eclipse TestNG Plugin
Other necessary Jars will be downloaded by Maven.

```

### Application Under Test

https://www.depop.com/

Automate this website using BDD with Page Object Pattern. I am  going to navigate to this website and test few Links on Login page and then navigate to Home page to verify Logout text to make sure I am landing on a Home page. Logout from Web-site. This is my first scenario.

In my second scenario I am deliberately enters wrong password and validate error message. In this scenario, I have used data provider using examples.

#### Page Object Pattern framework structure.

```sh

- So, as I have implemented Page Object Model, we are going to create a java class for each page 
  in the application.
- Inside src/main/java I have created 6 packages.
- com.depop.config inside this package I have config.properties where we can define our 
  browser,url,username and password.
- com.depop.feature package I have two feature files one for positive test case and one for 
  negative test case. This is based on Gherkin key words.
- com.depop.pages package where I define my pages for this web application.
- com.depop.runner package running testng runner.
- com.depop.StepDefinitiuons package where we can define our selenium code.
- com.depop.util where we can define our common utilities like How to initialize the browser, 
  which browser we suppose to run and finally terminate the browser.

```

### Executing the Test

#### Step1: Please copy below git repository on your local system.

```sh

$ git clone https://github.com/kartikeya27/Java-Cucumber-POM.git

```

#### Step2: open terminal prompt and navigate to your project root folder and perform. It will run two test scenario I have mentioned above.

```sh

$ mvn -U clean install

```

#### Note:

```sh

I have installed chromedriver and gecko driver inside project root chrome and Firefox folder. 
TestNG runner will pick testng.xml configuration and it will generate beautiful report inside 
arget/cucumber-reports/advanced-reports/cucumber-html-reports/overview-features.html. 
Please open overview-features.html in any browser. If you have any questions about this 
framework please do let me know.

```









