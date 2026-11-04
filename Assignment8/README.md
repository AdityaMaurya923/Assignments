# Assignment 8: Matrices: Transpose and Row Sums

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Matrices: Filling, Transpose and Row Sums in Java.

## 2. Aim

To create two-dimensional arrays, visit them row by row, build a new matrix from an existing one (transpose) and find the sum of each row.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. Two-Dimensional Array:**
A matrix is stored as an array of arrays. `m[i][j]` is the element in row `i` and column `j` (both counted from 0).

**2. Declaration:**
`int[][] m = new int[3][4];` creates a matrix with 3 rows and 4 columns.

**3. Traversal:**
Nested loops are used. The outer loop visits the rows and the inner loop visits the columns.

**4. Transpose:**
The transpose of a matrix swaps its rows and columns: `t[j][i] = m[i][j]`.

**5. Row Sum:**
The sum of a row is found by adding all the elements `m[i][0]`, `m[i][1]`, ... of that row.

## 5. Algorithm / Procedure

### Question 1: Fill and Print a 3 x 4 Matrix

1. Start the program.
2. Create the matrix `m` with 3 rows and 4 columns and set `value = 1`.
3. Using nested loops, store `value` in `m[i][j]` and increase `value` by 1.
4. Using nested loops again, print each element followed by a space.
5. Move to the next line after each row.
6. Stop the program.

### Question 2: Transpose of a 3 x 3 Matrix

1. Start the program.
2. Create the matrix with rows `1 2 3`, `4 5 6` and `7 8 9`, and a new matrix `t` of size 3 x 3.
3. Using nested loops, set `t[j][i] = m[i][j]`.
4. Print the matrix `t` row by row with a space after each number.
5. Stop the program.

### Question 3: Sum of Each Row

1. Start the program.
2. Create the 3 x 3 matrix with rows `1 2 3`, `4 5 6` and `7 8 9`.
3. For each row `i`, set `sum = 0` and add all elements of that row.
4. Print "Row", the row number, "sum:" and the total.
5. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- Matrix size = 3 x 4, values 1 to 12

**Question 2:**

- Matrix = {1 2 3}, {4 5 6}, {7 8 9}

**Question 3:**

- Matrix = {1 2 3}, {4 5 6}, {7 8 9}

## 7. Output

**Question 1:**

```
1 2 3 4 
5 6 7 8 
9 10 11 12 
```

**Question 2:**

```
1 4 7 
2 5 8 
3 6 9 
```

**Question 3:**

```
Row 1 sum: 6
Row 2 sum: 15
Row 3 sum: 24
```

---

**Result:** All three Java programs were successfully written and executed to demonstrate two-dimensional arrays, matrix transpose and row sums.
