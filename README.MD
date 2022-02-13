
Stem QE Coding Exercise
We want to test what is the best solution/program you can come up with when working with REST APIs. For this exercise, we are going to work with OMDb API. Please see the documentation and get familiar with it. (I found using Postman to exercise this API particularly useful)

The assignment is as follows:

Write code that does the following
Goto https://www.omdbapi.com/ and sign up for an API Key. You'll need this API key to run the test.
Build a client that contains following methods using the OMDb API:
search(string): returns a list of all results that matched that search string. Takes pagination in account when generating the list. Query uses s parameter as specified here.
get_by_id(string): returns the result based on the input id e.g. tt999999. Query uses i parameter as specified here.
get_by_title(string): returns the result based on input string as title name. Query uses t parameter as specified here.
Write a test that does the following:
Using search method, search for all items that match the search string stem
Assert that the result should contain at least 30 items
Assert that the result contains items titled The STEM Journals and Activision: STEM - in the Videogame Industry
From the list returned by search above, get imdbID for item titled Activision: STEM - in the Videogame Industry and use it to get details on this movie using get_by_id method.
Assert that the movie was released on 23 Nov 2010 and was directed by Mike Feurstein
Using get_by_title method, get item by title The STEM Journals and assert that the plot contains the string Science, Technology, Engineering and Math and has a runtime of 22 minutes.
Follow these steps
Create a new project. Do not use any existing project
Use any programming language of your choice
Use your judgement and design the APIs, classes, clients, objects and tests as you see fit. We are looking for something that is:
Maintainable
Scalable
Extensible
Provide a README that gives information about your code and at the very least a step-by-step instruction on how to run the tests
Assume that we only deal in JSON. Please do not add support for XML.
Extra credit
Doing the following is not a requirement but they are nice-to-haves that we would like to see:
Modular code with OO design
Code comments / docs
Logging using a logging framework instead of just a print statement. (No need for a configuration file)
Try to write the test as data-driven so that we can easily add more tests for different test data/parameters if needed.


When done, please send us your project as a compressed zip/tar file. The sooner, the better.

Best of luck!



# RestAssuredSerenityCucumber Framework

This is a sample Rest API test solution for sample endpoints available in http://www.omdbapi.com . The OMDb API is a RESTful web service to obtain movie information, all content and images on the site are contributed and maintained by our users.


Tests are written using a combination of SerenityBDD, RestAssured, Cucumber, Junit & Maven.

## Technology Stack

- Java
- Serenity BDD
- Maven
- RestAssured

## Prerequisites

* [Java 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java Dev Kit
* [Maven](https://maven.apache.org/download.cgi) - Dependency Manager

## Application Under Test

We are using OMDb APIs as the Application Under Test.

* URL : http://www.omdbapi.com/

## The project directory structure
The project follows the standard directory structure used in most Serenity projects:

```Gherkin
src
  + main
    + java                          
      + env                         methods to get/set env related configs
      + models                      pojos of all endpoints
      + utilities                   utility methods and constants
  + test
    + java                          
      + endpoints                   endpoints of the services
      + runners                     test runner(senerity runner/trigger configurations)
      + stepdefinitions             Step definitions for the BDD feature
      + utils                       Common utility methods
    + resources
      + features                  Feature files
      + properties                AUT properties files
      + logback.xml               for rebug logs
```
Following instructions will help you running the project. First, clone this project locally on your machine from the master branch.

### Installation and Test Execution

Open the project in any IDE Eclipse/IntelliJ. Run the following command in Terminal and build the project. It will automatically download all the required dependencies.

```sh
$ mvn clean install
```

### Execute Tests

Run the following command in Terminal to execute tests.

```sh
$ mvn clean verify
```

### Test Report

You can find the Serenity reports in the following directory of the Project.

```sh
\target\site\serenity\
```

In the serenity directory, open 'index.html' file to view the report.
