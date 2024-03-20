# HBV202GAssignment10
A documented version of Assignment 9, a project implementing the *Composite* pattern and the *Observer* pattern 
(and some sort of *Template Method* pattern) based on tests using JUnit4, to realize plus and multiplication functions.

## Licence
[Link to MIT licence](./LICENSE)

## Design
[A UML diagram of the project design](./src/site/markdown/design.md)

## Installation

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE should understand 
when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

Both the implementation and the tests are in Java package `is.hi.hbv202g.ass9`,  
but in the usual separate Maven `src` directories:

- `src/main/java`:
  - `is.hi.hbv202g.ass9.composite`: The implementation of the *Composite* pattern is here. 
  - `is.hi.hbv202g.ass9.compositeObserved`: The implementation of the *Composite* pattern that is combined with the 
    *Observable* patterns is here. 
  - `is.hi.hbv202g.ass9.compositeObservedTemplateMethod`: A refactoring of the above patterns inspired by the *Template Method* pattern.
- `src/test/java`: (each package contains an `Alltests` class that collects all the test cases for the respective 
  package in one test suite),
  - `is.hi.hbv202g.ass9.composite`: Test cases testing a composite implementation.
  - `is.hi.hbv202g.ass9.compositeObserved`: Test cases testing an implementation of a composite where the leafs are 
   observed by the composite implementation.
  - `is.hi.hbv202g.ass9.compositeObservedTemplateMethod`: The same test cases for testing the refactoring of the 
     above patterns inspired by the *Template Method* pattern.

## Building

Maven:
- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, 
  `Tests`, or `TestCase`). As long as you have not finished implementing all packages, it is better to use the IDE to
  run individual test cases or package-level test suites.

## Running

Maven:
- `mvn exec:java` runs the main method in the CompositeMain class, executing a preprogrammed mathematical problem.


## Notes

Documentation for all classes, methods and tests generated with GitHub Copilot.