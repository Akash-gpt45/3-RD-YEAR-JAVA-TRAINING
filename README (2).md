# Java Training – 3rd Year

## About
This repository contains my Java training exercises and beginner-level programs. The programs practise console input, variables, arithmetic operations, arrays, loops, and formatted output.

## Programs

| File | Description | Concepts Practised |
|---|---|---|
| `personalinfo.java` | Reads and displays a person's name, age, and city. | `Scanner`, `String`, `int`, console input/output |
| `rectanglecalc.java` | Calculates the area and perimeter of a rectangle from its length and width. | `double`, arithmetic operators, formulas |
| `salary.java` | Reads an employee's name, basic salary, and bonus, then displays the total salary to two decimal places. | `double`, addition, `printf()`, format specifier `%.2f` |
| `studentmarks.java` | Reads a student's name and marks for five subjects, then calculates total and average marks. | Arrays, `for` loops, accumulation, average calculation |
| `temporary.java` | Swaps two integers using a temporary variable. | Variables, assignment, swapping logic |
| `twonumcalc.java` | Calculates the sum, difference, product, and integer quotient of two integers. | `int`, arithmetic operators, `Scanner` |

## How to Run

1. Install a Java Development Kit (JDK).
2. Open a terminal in the folder containing the Java file.
3. Compile the file:
   ```bash
   javac personalinfo.java
   ```
4. Run the class:
   ```bash
   java personalinfo
   ```

Replace `personalinfo` with the relevant filename and class name for another program. The public class name should match the `.java` filename.

## Notes
- `twonumcalc.java` uses integer division, so a fractional part of the quotient is discarded.
- For `twonumcalc.java`, enter a non-zero second number to avoid division by zero.
- `personalinfo.java` reads the city using `next()`, so it accepts a single word for the city.
- These are practice programs and will be expanded as more Java concepts are learned.

## Learning Goals
- Build confidence with Java syntax and program structure.
- Practise reading user input with `Scanner`.
- Apply arithmetic operations and simple formulas.
- Understand arrays and loops.
- Display output clearly and format numeric results.
