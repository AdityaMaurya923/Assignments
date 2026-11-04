# Assignment 4: Writing Functions

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Writing Functions (Methods) with Parameters and Return Values in Java.

## 2. Aim

To write Java functions that take parameters and return values, and to call them from the `main()` method.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. Function (Method):**
A function is a named block of code that performs a task. It can be written once and called many times.

**2. Parameters and Return Value:**

- Parameters are the values given to a function when it is called.
- The `return` statement sends a result back to the caller.

**3. Factorial:**
n! = 1 × 2 × 3 × ... × n

**4. Combination and Permutation:**

- nCr = n! / (r! × (n − r)!)
- nPr = n! / (n − r)!

## 5. Algorithm / Procedure

### Question 1: Factorial and nCr

1. Start the program.
2. Write `fact(int n)` that multiplies 1 to `n` using a loop and returns the result.
3. Write `nCr(int n, int r)` that returns `fact(n) / (fact(r) * fact(n - r))`.
4. In `main()`, call `nCr(5, 2)`.
5. Print "5C2 =" followed by the result.
6. Stop the program.

### Question 2: Factorial and nPr

1. Start the program.
2. Write `fact(int n)` that multiplies 1 to `n` using a loop and returns the result.
3. Write `nPr(int n, int r)` that returns `fact(n) / fact(n - r)`.
4. In `main()`, call `nPr(5, 2)`.
5. Print "5P2 =" followed by the result.
6. Stop the program.

### Question 3: Larger of Two Numbers

1. Start the program.
2. Write `maxOf(int a, int b)` that returns `a` if `a > b`, otherwise returns `b`.
3. In `main()`, call `maxOf(14, 9)`.
4. Print "Larger:" followed by the result.
5. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- n = 5, r = 2

**Question 2:**

- n = 5, r = 2

**Question 3:**

- a = 14, b = 9

## 7. Output

**Question 1:**

```
5C2 = 10
```

**Question 2:**

```
5P2 = 20
```

**Question 3:**

```
Larger: 14
```

---

**Result:** All three Java programs were successfully written and executed to demonstrate functions with parameters and return values.
