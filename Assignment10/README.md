# Assignment 10: Switch and ArrayList

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Switch Statement and ArrayList in Java.

## 2. Aim

To choose a branch with a `switch` statement, and to store and change a list of numbers using an `ArrayList`.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. switch Statement:**
A `switch` statement selects one of many code blocks based on the value of a variable. Each `case` ends with `break`, and `default` runs when no case matches.

**2. ArrayList:**
`ArrayList` is a resizable list from the `java.util` package. Unlike an array, its size can grow and shrink.

**3. ArrayList Methods:**

- `add(x)` : Adds a value at the end.
- `get(i)` : Returns the value at index `i`.
- `size()` : Returns the number of elements.
- `set(i, x)` : Replaces the value at index `i` with `x`.
- `remove(i)` : Deletes the element at index `i`.

**4. Wrapper Class:**
An `ArrayList` stores objects, so `Integer` is used instead of `int`.

## 5. Algorithm / Procedure

### Question 1: Day Name Using switch

1. Start the program.
2. Store 3 in the integer variable `day`.
3. Use `switch (day)` with cases 1 (Monday), 2 (Tuesday) and 3 (Wednesday).
4. Use `default` to print "Invalid day".
5. Stop the program.

### Question 2: ArrayList Basics

1. Start the program.
2. Import `java.util.ArrayList` and create `ArrayList<Integer> list`.
3. Add the values 10, 20, 30 and 40.
4. Print the whole list.
5. Print "Size:" with `list.size()` and "Item at index 2:" with `list.get(2)`.
6. Stop the program.

### Question 3: set and remove

1. Start the program.
2. Create `ArrayList<Integer> list` and add 10, 20, 30 and 40.
3. Use `list.set(1, 25)` to change index 1 to 25.
4. Use `list.remove(3)` to delete the element at index 3.
5. Print the list and "Size:" with its size.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- day = 3

**Question 2:**

- List values = 10, 20, 30, 40

**Question 3:**

- List values = 10, 20, 30, 40
- set index 1 to 25, remove index 3

## 7. Output

**Question 1:**

```
Wednesday
```

**Question 2:**

```
[10, 20, 30, 40]
Size: 4
Item at index 2: 30
```

**Question 3:**

```
[10, 25, 30]
Size: 3
```

---

**Result:** All three Java programs were successfully written and executed to demonstrate the switch statement and the ArrayList methods add, get, size, set and remove.
