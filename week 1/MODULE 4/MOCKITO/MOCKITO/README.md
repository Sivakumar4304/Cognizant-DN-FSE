# Exercise 1 - Mocking and Stubbing

## Objective
Learn how to create a mock object using Mockito and stub a method to return predefined data.

## Scenario
The service depends on an external API. Instead of calling the real API, Mockito creates a mock object and returns sample data.

## Steps
1. Create a mock object for `ExternalApi`.
2. Stub the `getData()` method using `when()` and `thenReturn()`.
3. Inject the mock into `MyService`.
4. Verify that the returned value is the mocked data.

## Mockito Methods Used
- `mock()` – Creates a fake object.
- `when()` – Defines method behavior.
- `thenReturn()` – Returns a predefined value.

## Output
The test passes by returning `"Mock Data"` instead of calling a real external API.

## Result
Successfully tested the service using Mockito without depending on an actual API.

# Exercise 3 - Argument Matching

## Objective
Learn how to verify that a method is called with the correct argument using Mockito argument matchers.

## Scenario
The service calls an external API with a customer name. Mockito verifies that the expected argument is passed to the API.

## Steps
1. Create a mock object for `ExternalApi`.
2. Stub the `getData()` method using `anyString()`.
3. Call `fetchData("Siva")`.
4. Verify the interaction using `eq("Siva")`.

## Mockito Methods Used
- `anyString()` – Accepts any string argument.
- `eq()` – Matches the exact argument.
- `verify()` – Confirms the method call.

## Output
The test passes when the method is called with the expected argument `"Siva"`.

## Result
Successfully verified method arguments using Mockito argument matchers.