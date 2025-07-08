
# API JSONPlaceholder Tests

This project performs automated testing on the JSONPlaceholder API using:

- Java 17
- RestAssured
- Cucumber
- TestNG
- Allure for reporting

## How to Run

### Run all tests

```
mvn clean test
```

### Run only positive tests

```
mvn test -Dcucumber.filter.tags="@positive"
```

### Run only negative tests

```
mvn test -Dcucumber.filter.tags="@negative"
```

### Generate Allure Report

```
allure serve target/allure-results
```
