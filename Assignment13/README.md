# Assignment 13: Strings: Methods and Palindromes

**Name:** Aditya Kumar Maurya
**Roll No:** 2510303042

## 1. Experiment Title

String Methods, Reversing, Palindromes and Substrings in Java.

## 2. Aim

To use common `String` methods, reverse a word, check whether a word is a palindrome and print all substrings of a word.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

**1. String:**
A `String` is a sequence of characters. Characters are numbered from index 0.

**2. String Methods:**

- `length()` : Returns the number of characters.
- `indexOf(ch)` : Returns the position of the first occurrence of `ch`.
- `toUpperCase()` : Returns the string in capital letters.
- `charAt(i)` : Returns the character at index `i`.
- `substring(start, end)` : Returns the part from `start` up to (not including) `end`.

**3. String Concatenation:**
The `+` operator joins strings and characters together.

**4. Palindrome:**
A word that reads the same from both ends, for example `racecar`.

## 5. Algorithm / Procedure

### Question 1: String Methods

1. Start the program.
2. Store "Programming" in the String `word`.
3. Print "Length:" with `word.length()`.
4. Print "Position of g:" with `word.indexOf('g')`.
5. Print "Upper case:" with `word.toUpperCase()`.
6. Stop the program.

### Question 2: Reverse a Word

1. Start the program.
2. Store "Java" in `word` and set `reversed = ""`.
3. Run a loop from `i = word.length() - 1` down to 0.
4. In each step, set `reversed = reversed + word.charAt(i)`.
5. Print "Reversed:" followed by `reversed`.
6. Stop the program.

### Question 3: Palindrome Check

1. Start the program.
2. Store "racecar" in `word` and set `palindrome = true`.
3. Compare `word.charAt(i)` with `word.charAt(word.length() - 1 - i)` for the first half of the word.
4. If any pair is different, set `palindrome = false` and stop.
5. Print the word followed by "is a palindrome" or "is not a palindrome".
6. Stop the program.

### Question 4: All Substrings

1. Start the program.
2. Store "abc" in `word`.
3. Run the outer loop for the start index `i` from 0 to `word.length() - 1`.
4. Run the inner loop for the end index `j` from `i + 1` to `word.length()`.
5. Print `word.substring(i, j)` on its own line.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

- Word = "Programming"

**Question 2:**

- Word = "Java"

**Question 3:**

- Word = "racecar"

**Question 4:**

- Word = "abc"

## 7. Output

**Question 1:**

```
Length: 11
Position of g: 3
Upper case: PROGRAMMING
```

**Question 2:**

```
Reversed: avaJ
```

**Question 3:**

```
racecar is a palindrome
```

**Question 4:**

```
a
ab
abc
b
bc
c
```

---

**Result:** All four Java programs were successfully written and executed to demonstrate String methods, reversing a word, palindrome checking and printing substrings.
