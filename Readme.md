# Reverse Polish Notation (RPN) Calculator

This is a simple implementation of a Reverse Polish Notation (RPN) calculator in Java, allowing users to perform basic arithmetic operations using a command-line interface.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### Usage

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/rpn-calculator-java.git
   cd rpn-calculator-java
2.  **Compile the Java code:**
    ```bash
    javac App.java
    ```

3. **Run the RPN Calculator:**

    ```bash
    java App
    ```

4. **Enter RPN expressions at the prompt. For example:**

    ```bash
    > 1 
    1.0 
    > 2 
    2.0 
    > + 
    3.0 
   
   OR 
   
   > 1 2 +
   3.0
    ```
5. **To exit, type q or press Ctrl + D.**

## Features
- Basic Arithmetic Operations: Addition, subtraction, multiplication, and division.
- Error Handling: Gracefully handles errors such as insufficient operands, invalid tokens, and division by zero.
- User-friendly Interface: Provides a simple and intuitive command-line interface.
- Interactive Input: Allows users to enter expressions interactively.

# Solution Description
The solution is implemented in a single Java class (App.java). It utilizes a Stack to process RPN expressions and includes error-checking mechanisms for a reliable user experience.

- scanner for read the input
- two patterns for number ot for operator
- supports number entered one by one or entire expression in one line
- if have a number push it in stack
- if have an operator extract from stack and calculate
# Code Structure
App.java: Contains the main logic for the RPN calculator, including methods for calculating expressions and performing arithmetic operations.

```java
// App.java
import java.util.Scanner;
import java.util.Stack;

public class App {
// ... (rest of the Java code)
}
```
How to Run
Clone the repository and navigate to the project directory.
Compile the Java code using javac App.java.
Run the application with java App.
Enter RPN expressions and observe the results.
#Future Improvements
- Extend functionality to support additional operators.
- Enhance error messages for more informative user feedback.
- Implement alternative interfaces, such as file input/output.
