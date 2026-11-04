# Assignment 2: Decisions and Loops with Numbers

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Decision Making and Loops with Numbers in Java.

## 2. Aim

To write Java programs that use `if-else`, the `else-if` ladder and loops to make decisions and repeat steps with whole numbers.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. if-else Statement:**
It executes one block of code if a condition is true, and another block if it is false.

**2. else-if Ladder:**
It checks several conditions one after another and runs the block of the first condition that is true.

**3. Modulus Operator (`%`):**
It gives the remainder after division. A number is even if `n % 2 == 0`.

**4. Logical Operators:**

- `&&` : Logical AND
- `||` : Logical OR
- `!=` : Not equal to

**5. Leap Year Rule:**
A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.

**6. for Loop:**
It repeats a block of code a fixed number of times. Factorial of n = 1 × 2 × 3 × ... × n.

## 5. Algorithm / Procedure

### Question 1: Even or Odd

1. Start the program.
2. Store 27 in the integer variable `n`.
3. If `n % 2 == 0`, print "n is even".
4. Otherwise, print "n is odd".
5. Stop the program.

### Question 2: Grade Using else-if Ladder

1. Start the program.
2. Store 83 in the integer variable `marks`.
3. If `marks >= 90`, print "Grade: A".
4. Else if `marks >= 75`, print "Grade: B".
5. Otherwise, print "Grade: C".
6. Stop the program.

### Question 3: Leap Year

1. Start the program.
2. Store 2024 in the integer variable `year`.
3. Check if `(year % 4 == 0 && year % 100 != 0) || year % 400 == 0`.
4. If true, print "Leap year".
5. Otherwise, print "Not a leap year".
6. Stop the program.

### Question 4: Factorial Using for Loop

1. Start the program.
2. Initialize `fact = 1`.
3. Run a `for` loop with `i` from 1 to 5.
4. In each step, multiply `fact` by `i`.
5. Print "Factorial of 5 is" followed by `fact`.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- n = 27

**Question 2:**

- marks = 83

**Question 3:**

- year = 2024

**Question 4:**

- Number = 5

## 7. Output

**Question 1:**

```
27 is odd
```

**Question 2:**

```
Grade: B
```

**Question 3:**

```
Leap year
```

**Question 4:**

```
Factorial of 5 is 120
```

---

**Result:** All four Java programs were successfully written and executed to demonstrate the use of if-else statements, the else-if ladder, logical operators and the for loop.
