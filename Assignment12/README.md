# Assignment 12: Insertion Sort

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Insertion Sort in Java.

## 2. Aim

To sort small arrays in increasing order using insertion sort and to count how many values are shifted.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. Insertion Sort:**
It builds the sorted array one element at a time. Each new element (the key) is taken from the unsorted part and inserted into its correct place in the sorted part on its left.

**2. Shifting:**
To make room for the key, every larger value in the sorted part moves one place to the right. Each such move is one shift.

**3. Time Complexity:**

- Worst case (reverse order): `O(n^2)`
- Best case (already sorted): `O(n)`

**4. Maximum Shifts:**
For an array of `n` elements in reverse order, the number of shifts is `n(n − 1) / 2`. For 6 elements this is 15.

## 5. Algorithm / Procedure

### Question 1: Insertion Sort on {7, 3, 5, 1}

1. Start the program.
2. Create the array `{7, 3, 5, 1}`.
3. For `i` from 1 to `n - 1`, set `key = arr[i]` and `j = i - 1`.
4. While `j >= 0` and `arr[j] > key`, move `arr[j]` one place right and decrease `j`.
5. Place `key` at `arr[j + 1]`.
6. Print "Sorted:" followed by the values in square brackets separated by commas.
7. Stop the program.

### Question 2: Insertion Sort on {14, 3, 9, 21, 6}

1. Start the program.
2. Create the array `{14, 3, 9, 21, 6}`.
3. Apply the same insertion sort steps as in Question 1.
4. Print "Sorted:" followed by the values in square brackets separated by commas.
5. Stop the program.

### Question 3: Count Shifts

1. Start the program.
2. Create the array `{6, 5, 4, 3, 2, 1}` and set `shifts = 0`.
3. Perform insertion sort and increase `shifts` by 1 each time a value moves one place to the right.
4. Print "Shifts:" followed by `shifts`.
5. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- Array = {7, 3, 5, 1}

**Question 2:**

- Array = {14, 3, 9, 21, 6}

**Question 3:**

- Array = {6, 5, 4, 3, 2, 1}

## 7. Output

**Question 1:**

```
Sorted: [1, 3, 5, 7]
```

**Question 2:**

```
Sorted: [3, 6, 9, 14, 21]
```

**Question 3:**

```
Shifts: 15
```

---

**Result:** All three Java programs were successfully written and executed to sort arrays using insertion sort and to count the shifts.
