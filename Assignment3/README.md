# Assignment 3: Star and Number Patterns

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Star and Number Patterns Using Nested Loops in Java.

## 2. Aim

To write Java programs that use a loop inside another loop to print stars and numbers in rows.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. Nested Loops:**
A loop written inside another loop is called a nested loop. The inner loop runs fully for every single step of the outer loop.

**2. Rows and Columns:**

- The outer loop controls the **rows**.
- The inner loop controls the **columns** (items printed in each row).

**3. Print Statements:**

- `System.out.print()` prints on the same line.
- `System.out.println()` prints and then moves to the next line.

## 5. Algorithm / Procedure

### Question 1: Square of Stars

1. Start the program.
2. Run the outer loop for `i` from 1 to 4 (rows).
3. Run the inner loop for `j` from 1 to 4 (columns).
4. Print `*` in each step of the inner loop.
5. After the inner loop, move to the next line.
6. Stop the program.

### Question 2: Right Triangle of Stars

1. Start the program.
2. Run the outer loop for `i` from 1 to 4.
3. Run the inner loop for `j` from 1 to `i`.
4. Print `*` in each step of the inner loop.
5. After the inner loop, move to the next line.
6. Stop the program.

### Question 3: Number Triangle

1. Start the program.
2. Run the outer loop for `i` from 1 to 4.
3. Run the inner loop for `j` from 1 to `i`.
4. Print `j` followed by a space.
5. After the inner loop, move to the next line.
6. Stop the program.

### Question 4: Upside-Down Triangle of Stars

1. Start the program.
2. Run the outer loop for `i` from 4 down to 1.
3. Run the inner loop for `j` from 1 to `i`.
4. Print `*` in each step of the inner loop.
5. After the inner loop, move to the next line.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- Rows = 4, Columns = 4

**Question 2:**

- Rows = 4

**Question 3:**

- Rows = 4

**Question 4:**

- Rows = 4

## 7. Output

**Question 1:**

```
****
****
****
****
```

**Question 2:**

```
*
**
***
****
```

**Question 3:**

```
1 
1 2 
1 2 3 
1 2 3 4 
```

**Question 4:**

```
****
***
**
*
```

---

**Result:** All four Java programs were successfully written and executed to print star and number patterns using nested loops.
