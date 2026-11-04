# Assignment 9: Matrices: Rows and Columns

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Matrices: Rows, Columns and Counting Values in Java.

## 2. Aim

To visit the rows and columns of a matrix with nested loops to print, add and count its values.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. Matrix Elements:**
In `m[i][j]`, `i` is the row index and `j` is the column index. The first row is `m[0]` and the last row of a 3 x 3 matrix is `m[2]`.

**2. Row-wise Traversal:**
The outer loop goes over rows and the inner loop goes over columns.

**3. Column-wise Traversal:**
To add a column, the outer loop goes over the columns (`j`) and the inner loop goes over the rows (`i`).

**4. Counting with a Condition:**
A counter is increased only when an element satisfies the condition (for example, greater than 5).

## 5. Algorithm / Procedure

### Question 1: First Row and Last Row

1. Start the program.
2. Create the 3 x 3 matrix with rows `1 2 3`, `4 5 6` and `7 8 9`.
3. Print "First row:" and the elements of `m[0]` separated by spaces.
4. Print "Last row:" and the elements of `m[2]` separated by spaces.
5. Stop the program.

### Question 2: Sum of Each Column

1. Start the program.
2. Create the 3 x 3 matrix with rows `1 2 3`, `4 5 6` and `7 8 9`.
3. For each column `j`, set `sum = 0` and add `m[i][j]` for all rows `i`.
4. Print "Column", the column number, "sum:" and the total.
5. Stop the program.

### Question 3: Count Values Greater Than 5

1. Start the program.
2. Create the 3 x 3 matrix with rows `1 2 3`, `4 5 6` and `7 8 9`, and set `count = 0`.
3. Using nested loops, increase `count` whenever `m[i][j] > 5`.
4. Print "Values greater than 5:" followed by `count`.
5. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- Matrix = {1 2 3}, {4 5 6}, {7 8 9}

**Question 2:**

- Matrix = {1 2 3}, {4 5 6}, {7 8 9}

**Question 3:**

- Matrix = {1 2 3}, {4 5 6}, {7 8 9}

## 7. Output

**Question 1:**

```
First row: 1 2 3
Last row: 7 8 9
```

**Question 2:**

```
Column 1 sum: 12
Column 2 sum: 15
Column 3 sum: 18
```

**Question 3:**

```
Values greater than 5: 4
```

---

**Result:** All three Java programs were successfully written and executed to demonstrate row-wise and column-wise traversal of a matrix and counting values.
