# Tufin Junior Developer Assessment Solutions

## Programming Language
- **Java 19**

## Solutions Overview

### Question 1: Get Longest Valid String
- **Solution**: Checks each string for consecutive identical characters and ensures all characters are from the valid set. Returns the longest valid string.
- **How it works**: Iterates through strings, validates characters, and tracks the longest valid string.

### Question 2: Unique Sums
- **Solution**: Uses backtracking to find all unique combinations of numbers that sum to the target value.
- **How it works**: Sorts the array, skips duplicates, and recursively explores combinations.

### Question 3: Zero Array Possibility
- **Solution**: Determines if an array can be reduced to all zeros by checking divisibility conditions.
- **How it works**: Validates that each element (after the first) is divisible by the preceding value.

### Question 4: First Unique Product
- **Solution**: Uses a `LinkedHashMap` to count product occurrences and returns the first unique product.
- **How it works**: Maintains insertion order to efficiently find the first product with a count of 1.

### Question 5: Distance Between Minimums
- **Solution**: Finds the smallest distance between occurrences of the minimum value in the array.
- **How it works**: Tracks indices of the minimum value and calculates the smallest gap.

### Question 6: Top Three Words
- **Solution**: Counts word frequencies and returns the top three words, sorted alphabetically.
- **How it works**: Uses a `HashMap` for frequency counts and streams to sort and limit results.

### Question 7: Rotate Linked List
- **Solution**: Rotates a linked list by moving elements `n` positions to the right.
- **How it works**: Adjusts pointers to reposition the tail and head of the list.

## How to Run the Code

### For IntelliJ IDEA (Recommended)
1 .**Run the Code**:
   - Right-click `Main.java` in the project explorer.
   - Select **Run 'Main.main()'** to execute all solutions at once.
   - To run a specific question, right-click its test case in `Main.java` (e.g., `runQuestion1()`) and choose **Run**.

### For Command Line (General)
1. **Compile**:  
   Navigate to the project directory (where `Main.java` is located) and run:
   ```bash
   javac Main.java