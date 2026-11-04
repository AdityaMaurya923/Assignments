# Assignment 7: Counting Steps and Complexity

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Counting Steps and Time Complexity in Java.

## 2. Aim

To count the number of steps a program takes and to write its time complexity as a comment.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. Time Complexity:**
Time complexity describes how the number of steps of a program grows as the input size `n` grows.

**2. Common Complexities:**

- `O(n)` : Linear. A single loop that runs `n` times.
- `O(n^2)` : Quadratic. Two nested loops that each run `n` times.
- `O(log n)` : Logarithmic. The problem size is halved in every step.

**3. Step Counter:**
A counter variable is increased inside the loop body so the total number of steps can be printed.

## 5. Algorithm / Procedure

### Question 1: Single Loop

1. Start the program.
2. Set `steps = 0`.
3. Write the comment `O(n)` above the loop.
4. Run a loop from 1 to 10 and increase `steps` by 1 in each iteration.
5. Print "Steps:" followed by `steps`.
6. Stop the program.

### Question 2: Nested Loops

1. Start the program.
2. Set `steps = 0`.
3. Write the comment `O(n^2)` above the loops.
4. Run an outer loop from 1 to 10 and an inner loop from 1 to 10.
5. Increase `steps` by 1 in every run of the inner loop body.
6. Print "Steps:" followed by `steps`.
7. Stop the program.

### Question 3: Halving Loop

1. Start the program.
2. Store 1024 in `n` and set `steps = 0`.
3. Write the comment `O(log n)` above the loop.
4. While `n > 1`, set `n = n / 2` and increase `steps` by 1.
5. Print "Halving steps:" followed by `steps`.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- Loop runs from 1 to 10

**Question 2:**

- Both loops run from 1 to 10

**Question 3:**

- n = 1024

## 7. Output

**Question 1:**

```
Steps: 10
```

**Question 2:**

```
Steps: 100
```

**Question 3:**

```
Halving steps: 10
```

---

**Result:** All three Java programs were successfully written and executed to count steps and to identify the time complexities O(n), O(n^2) and O(log n).
