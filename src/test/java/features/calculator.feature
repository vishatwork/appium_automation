Feature: Calculator Operations
  As a user
  I want to verify mathematical operations in the calculator application
  So that I can confirm all operations work as expected

  @Calculator
  Scenario Outline: Verify calculator operations
    Given the calculator app is opened
    When I perform "<operation>" between "<num1>" and "<num2>"
    Then the result should be "<expectedResult>"

    Examples:
      | operation       | num1 | num2 | expectedResult |
      | add   			    | 5    | 3    | 8              |
      | sub  					  | 9 	 | 4 	  | 5              |
      | mul						  | 6    | 7    | 42             |
      | div             | 8    | 2    | 4              |
