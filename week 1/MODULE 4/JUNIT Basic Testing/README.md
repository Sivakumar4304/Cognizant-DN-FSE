# Exercise 4 - Arrange-Act-Assert (AAA) Pattern

## Objective
Learn how to organize JUnit test cases using the Arrange-Act-Assert (AAA) pattern and use setup and teardown methods with `@Before` and `@After`.

---

## Arrange-Act-Assert (AAA) Pattern

### Arrange
Prepare the required objects and input data for the test.

Example:
```java
int a = 10;
int b = 20;
```

### Act
Call the method that needs to be tested.

Example:
```java
int result = calculator.add(a, b);
```

### Assert
Compare the expected result with the actual result.

Example:
```java
assertEquals(30, result);
```

---

## JUnit Annotations Used

### @Before
- Executes before every test method.
- Used to initialize objects or prepare the test environment.
- In this exercise, it creates a new `Calculator` object before each test.

### @After
- Executes after every test method.
- Used to clean up resources after the test execution.
- In this exercise, it sets the `Calculator` object to `null`.

---

## Methods Used

### setUp()
- Runs before each test.
- Initializes the `Calculator` object.

### testAdd()
- Tests the `add()` method.
- Follows the AAA pattern.

### tearDown()
- Runs after each test.
- Cleans up the created object.

---

## Execution Order

JUnit automatically executes the methods in the following order:

1. `setUp()` (`@Before`)
2. `testAdd()` (`@Test`)
3. `tearDown()` (`@After`)

---

## Approach

1. Created a `Calculator` class with an `add()` method.
2. Created a JUnit test class `CalculatorAAATest`.
3. Used `@Before` to initialize the object.
4. Followed the AAA pattern:
    - Arrange → Prepared test data.
    - Act → Called the `add()` method.
    - Assert → Verified the result using `assertEquals()`.
5. Used `@After` to clean up the object after test execution.

---

## Test Result

### If the test passes

- No assertion error is displayed.
- Only the messages inside `System.out.println()` are shown.

Example:

```text
Before Test
After Test

Process finished with exit code 0
```

### If the test fails

JUnit throws an `AssertionError` and displays:

- Expected value
- Actual value
- Line number where the test failed
- Stack trace for debugging

Example:

```text
Before Test
After Test

java.lang.AssertionError:
Expected :30
Actual   :210
```

This helps identify exactly why the test failed.

---

## Importance of AAA Pattern and Test Fixtures

- Improves the readability and organization of test cases.
- Eliminates repeated initialization and cleanup code using `@Before` and `@After`.
- Makes test cases easier to maintain, debug, and extend as the project grows.

---

## Conclusion

This exercise demonstrates how to write clean and organized JUnit tests using the AAA pattern. It also shows how `@Before` and `@After` automatically prepare and clean up the test environment, making unit tests more reliable and maintainable.