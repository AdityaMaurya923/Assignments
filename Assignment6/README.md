# Assignment 6: Arrays: Reverse and Duplicates

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Reversing an Array, Finding the Smallest Value and Checking Duplicates in Java.

## 2. Aim

To print an array in reverse order, find the smallest value with its index, and check an array for repeated values using nested loops.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. Reverse Traversal:**
An array can be printed in reverse by starting the loop at the last index (`arr.length - 1`) and counting down to 0.

**2. Smallest Value:**
Assume the first element is the smallest, then compare it with every other element and update when a smaller one is found. The index is stored along with the value.

**3. Finding Duplicates:**
Nested loops compare each element with all the elements after it. If two are equal, the value is repeated.

**4. break and boolean flag:**
A `boolean` variable remembers whether a repeated value was found, and `break` stops the inner loop early.

## 5. Algorithm / Procedure

### Question 1: Print Array in Reverse

1. Start the program.
2. Create the array `{10, 20, 30, 40, 50}`.
3. Run a `for` loop from `i = arr.length - 1` down to 0.
4. Print `arr[i]` on its own line.
5. Stop the program.

### Question 2: Smallest Value and Its Index

1. Start the program.
2. Create the array `{2, 5, 1, 8, 3, 4}`.
3. Set `smallest = arr[0]` and `index = 0`.
4. Traverse from `i = 1`; if `arr[i] < smallest`, update `smallest` and `index`.
5. Print "Smallest:", the value, "at index" and the index.
6. Stop the program.

### Question 3: Find a Repeated Value

1. Start the program.
2. Create the array `{4, 9, 2, 9, 7}` and set `found = false`.
3. Use nested loops: for each `i`, compare `arr[i]` with `arr[j]` for all `j > i`.
4. If they are equal, print "Repeated value:" and the value, set `found = true` and stop.
5. If no pair is equal, print "No repeated value".
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- Array = {10, 20, 30, 40, 50}

**Question 2:**

- Array = {2, 5, 1, 8, 3, 4}

**Question 3:**

- Array = {4, 9, 2, 9, 7}

## 7. Output

**Question 1:**

```
50
40
30
20
10
```

**Question 2:**

```
Smallest: 1 at index 2
```

**Question 3:**

```
Repeated value: 9
```

---

**Result:** All three Java programs were successfully written and executed to demonstrate reverse traversal, finding the smallest value, and detecting a repeated value.
