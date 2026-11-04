# Assignment 5: Arrays: Traversal and Counting

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Array Traversal and Counting in Java.

## 2. Aim

To create arrays, visit every element with a loop, and find the sum, the largest value and the count of values that meet a condition.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. Array:**
An array stores many values of the same type under one name. Elements are accessed by an index that starts at 0.

**2. Array Length:**
`arr.length` gives the number of elements in the array. The last valid index is `arr.length - 1`.

**3. Traversal:**
Visiting each element of an array one by one using a loop is called traversal.

**4. Sum, Largest and Count:**
While traversing, a running total, a "largest so far" value or a counter can be updated.

## 5. Algorithm / Procedure

### Question 1: Print Index and Value

1. Start the program.
2. Create the array `arr = {3, 4, 5}`.
3. Run a `for` loop from `i = 0` to `arr.length - 1`.
4. Print "Index", `i`, a colon and `arr[i]`.
5. Stop the program.

### Question 2: Sum and Largest Value

1. Start the program.
2. Create the array `{12, 45, 7, 33, 21}`.
3. Set `sum = 0` and `largest = arr[0]`.
4. Traverse the array: add each element to `sum`, and if the element is greater than `largest`, update `largest`.
5. Print `Sum:` and `Largest:` with their values.
6. Stop the program.

### Question 3: Count Values Greater Than 10

1. Start the program.
2. Create the array `{5, 12, 2, 14, 7}`.
3. Set `count = 0`.
4. Traverse the array; if an element is greater than 10, increase `count` by 1.
5. Print "Count greater than 10:" followed by `count`.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- Array = {3, 4, 5}

**Question 2:**

- Array = {12, 45, 7, 33, 21}

**Question 3:**

- Array = {5, 12, 2, 14, 7}

## 7. Output

**Question 1:**

```
Index 0: 3
Index 1: 4
Index 2: 5
```

**Question 2:**

```
Sum: 118
Largest: 45
```

**Question 3:**

```
Count greater than 10: 2
```

---

**Result:** All three Java programs were successfully written and executed to demonstrate array traversal, finding the sum and largest value, and counting values.
