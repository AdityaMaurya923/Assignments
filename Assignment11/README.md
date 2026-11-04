# Assignment 11: Bubble Sort and Selection Sort

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Bubble Sort and Selection Sort in Java.

## 2. Aim

To sort small arrays in increasing order using bubble sort and selection sort, and to count the swaps made by bubble sort.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. Sorting:**
Sorting arranges the elements of an array in a particular order, here in increasing order.

**2. Bubble Sort:**
It repeatedly compares neighbouring elements and swaps them if they are in the wrong order. After each pass, the largest remaining value moves to its correct place at the end.

**3. Selection Sort:**
In each pass, it finds the smallest value in the unsorted part and swaps it into the next position of the sorted part.

**4. Swap:**
Two values are exchanged using a temporary variable:
`temp = a; a = b; b = temp;`

**5. Time Complexity:**
Both bubble sort and selection sort take `O(n^2)` time.

## 5. Algorithm / Procedure

### Question 1: Bubble Sort

1. Start the program.
2. Create the array `{5, 1, 4, 2, 8}`.
3. Repeat for `i` from 0 to `n - 2`: for `j` from 0 to `n - 2 - i`, if `arr[j] > arr[j + 1]`, swap them.
4. Print "Sorted:" followed by the values in square brackets separated by commas.
5. Stop the program.

### Question 2: Selection Sort

1. Start the program.
2. Create the array `{64, 25, 12, 22, 11}`.
3. For each `i` from 0 to `n - 2`, find the index `minIndex` of the smallest value from `i` to the end.
4. Swap `arr[i]` with `arr[minIndex]`.
5. Print "Sorted:" followed by the values in square brackets separated by commas.
6. Stop the program.

### Question 3: Count Swaps in Bubble Sort

1. Start the program.
2. Create the array `{5, 1, 4, 2, 8}` and set `swaps = 0`.
3. Perform bubble sort and increase `swaps` by 1 each time two values are swapped.
4. Print "Swaps:" followed by `swaps`.
5. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- Array = {5, 1, 4, 2, 8}

**Question 2:**

- Array = {64, 25, 12, 22, 11}

**Question 3:**

- Array = {5, 1, 4, 2, 8}

## 7. Output

**Question 1:**

```
Sorted: [1, 2, 4, 5, 8]
```

**Question 2:**

```
Sorted: [11, 12, 22, 25, 64]
```

**Question 3:**

```
Swaps: 4
```

---

**Result:** All three Java programs were successfully written and executed to sort arrays using bubble sort and selection sort and to count the swaps.
