# Articles from Baeldung.com

* [A Guide to JUnit 5](https://www.baeldung.com/junit-5)
* [Execute Tests Based on Active Profile With JUnit 5](https://www.baeldung.com/spring-boot-junit-5-testing-active-profile)

# Articles from Medium

* [Writing Unit Tests in Java with JUnit and Mockito in Spring boot Simplified](https://medium.com/@robindamisi/writing-unit-tests-in-java-with-junit-and-mockito-in-spring-boot-simplified-f81212539d68)

-----------

To run JUnit 5 tests through Maven, below are the main required dependencies:

- junit-jupiter-api: It is the main module where all core annotations are located, such as @Test, Lifecycle method
  annotations and assertions.
- junit-jupiter-engine: It has test engine implementation which is required at runtime to execute the tests.
- junit-platform-suite: The @Suite support provided by this module to make the JUnitPlatform runner obsolete.
- junit-jupiter-params: Support for parameterized tests in JUnit 5.