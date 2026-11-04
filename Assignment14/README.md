# Assignment 14: Characters: Counting and Positions

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

Counting Characters and Printing Positions in a String in Java.

## 2. Aim

To use `charAt()` to count vowels and a particular letter in a string, and to print each letter with its position.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. char Data Type:**
A `char` stores a single character, written in single quotes, for example `'a'`.

**2. charAt() Method:**
`s.charAt(i)` returns the character at position `i` of the string `s`. Positions start at 0 and end at `s.length() - 1`.

**3. Vowels:**
The vowels are `a`, `e`, `i`, `o` and `u`.

**4. Counting Characters:**
A loop visits every character, and a counter is increased when the character matches the condition.

**5. Comparison Operators:**
`==` compares characters, and `||` (OR) combines several conditions.

## 5. Algorithm / Procedure

### Question 1: Count Vowels

1. Start the program.
2. Store "programming" in the String `s` and set `count = 0`.
3. Run a loop from `i = 0` to `s.length() - 1`.
4. If `s.charAt(i)` is `a`, `e`, `i`, `o` or `u`, increase `count` by 1.
5. Print "Vowels:" followed by `count`.
6. Stop the program.

### Question 2: Count the Letter g

1. Start the program.
2. Store "programming" in the String `s` and set `count = 0`.
3. Run a loop from `i = 0` to `s.length() - 1`.
4. If `s.charAt(i) == 'g'`, increase `count` by 1.
5. Print "Count of g:" followed by `count`.
6. Stop the program.

### Question 3: Letters with Positions

1. Start the program.
2. Store "hello" in the String `s`.
3. Run a loop from `i = 0` to `s.length() - 1`.
4. Print `i`, a colon, a space and `s.charAt(i)`.
5. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- s = "programming"

**Question 2:**

- s = "programming"

**Question 3:**

- s = "hello"

## 7. Output

**Question 1:**

```
Vowels: 3
```

**Question 2:**

```
Count of g: 2
```

**Question 3:**

```
0: h
1: e
2: l
3: l
4: o
```

---

**Result:** All three Java programs were successfully written and executed to demonstrate the use of `charAt()` for counting vowels, counting a letter and printing the position of each letter.
