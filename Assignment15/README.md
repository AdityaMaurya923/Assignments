# Assignment 15: StringBuilder Methods

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

StringBuilder Methods: append, insert and deleteCharAt in Java.

## 2. Aim

To build and change text using `StringBuilder` with the methods `append`, `insert` and `deleteCharAt`.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. String vs StringBuilder:**
A `String` cannot be changed after it is created (it is immutable). A `StringBuilder` is mutable, so its text can be changed without creating a new object each time.

**2. StringBuilder Methods:**

- `append(x)` : Adds `x` at the end of the text.
- `insert(i, x)` : Adds `x` at index `i`.
- `deleteCharAt(i)` : Removes the character at index `i`.
- `length()` : Returns the number of characters.

**3. Method Chaining:**
Because `append` returns the same StringBuilder, calls can be chained, for example `sb.append(i).append(",")`.

## 5. Algorithm / Procedure

### Question 1: append and length

1. Start the program.
2. Create `StringBuilder sb` with the text "Hello".
3. Append " World" to `sb`.
4. Print `sb`.
5. Print "Length:" followed by `sb.length()`.
6. Stop the program.

### Question 2: Numbers with Commas

1. Start the program.
2. Create an empty `StringBuilder sb`.
3. Run a loop from 1 to 5 and append the number followed by a comma.
4. Remove the last comma with `sb.deleteCharAt(sb.length() - 1)`.
5. Print `sb`.
6. Stop the program.

### Question 3: insert

1. Start the program.
2. Create `StringBuilder sb` with the text "Java".
3. Use `sb.insert(0, "Hello ")` to add "Hello " at index 0.
4. Print `sb`.
5. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- Initial text = "Hello", appended text = " World"

**Question 2:**

- Numbers = 1 to 5

**Question 3:**

- Initial text = "Java", inserted text = "Hello " at index 0

## 7. Output

**Question 1:**

```
Hello World
Length: 11
```

**Question 2:**

```
1,2,3,4,5
```

**Question 3:**

```
Hello Java
```

---

**Result:** All three Java programs were successfully written and executed to demonstrate the StringBuilder methods append, insert, deleteCharAt and length.
