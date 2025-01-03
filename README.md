# Unexpected Loop Termination Bug in Java

This repository demonstrates a common error in Java programming: unexpected loop termination.  The code contains a `while` loop that's designed to iterate from 10 down to 1, but a conditional `break` statement causes it to stop prematurely at the number 5. This is a simple example illustrating a subtle error that can be challenging to debug in larger and more complex programs.

The solution file (`bugSolution.java`) shows how the problem can be easily fixed by removing or modifying the unintended `break` statement.

## How to run the code:

1.  Clone the repository
2.  Compile the java files: `javac bug.java` and `javac bugSolution.java`
3. Run the compiled classes: `java bug` and `java bugSolution`

Observe the difference in output to understand the bug and its fix.