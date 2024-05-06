# mi-proyecto-maven

This is a simple Maven project that includes JUnit for testing and JavaDoc for documentation.

## Prerequisites

You need to have Maven and JDK installed on your machine.

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

This command cleans the project, compiles the source code, runs the tests, and installs the package to your local repository.

## Running the Tests

To run the tests, use the following command:

```
mvn test
```

## Generating JavaDoc

To generate JavaDoc, use the following command:

```
mvn javadoc:javadoc
```

The generated JavaDoc can be found in the `target/site/apidocs` directory.

## Running the Application

To run the application, use the following command:

```
mvn exec:java -Dexec.mainClass=com.ejemplo.App
```

Replace `com.ejemplo.App` with the fully qualified name of your main class.