


# Duplicate Name Finder

## Overview
This Java program detects duplicate names from a user-inputted array. It prompts the user to enter the size of the array and then inputs names into an array. The program then iterates through the array to check for duplicate values and prints any found duplicates.

## How the Code Works

### 1. Importing Required Packages
```java
import java.util.Scanner;
```
The `Scanner` class is imported to read user input.

### 2. Declaring the Class and Main Method
```java
public class DuplicateNames
{
    public static void main(String[] args)
```
- The class is named `DuplicateNames`.
- The `main` method is the entry point where execution starts.

### 3. Taking User Input for Array Size
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter the Size of Array");
int size = s.nextInt();
```
- A `Scanner` object (`s`) is created to take user input.
- The user is prompted to enter the size of the array.
- The entered size is stored in the integer variable `size`.

### 4. Declaring and Initializing the Array
```java
String arr[] = new String [size];
System.out.println("Enter the Elements");
```
- A `String` array named `arr` is created with the given size.
- The user is prompted to enter elements (names).

### 5. Using a `for` Loop to Store User Inputs
```java
for(int i=0; i<=arr.length-1; i++)
{
    arr[i] = s.next();
}
```
- This `for` loop iterates from `i = 0` to `i = size - 1`.
- It reads a name from the user and stores it in `arr[i]`.

### 6. Checking for Duplicate Names
```java
for(int i=0; i<=arr.length-1; i++)
{
    for(int j=0; j<=i-1; j++)
    {
        if(arr[j].equals(arr[i]))
            System.out.println(arr[j]);
    }
}
```
#### **Outer `for` loop (`i` loop)**
- Runs from `i = 0` to `size - 1`.
- Picks an element `arr[i]` to compare with previously entered elements.

#### **Inner `for` loop (`j` loop)**
- Runs from `j = 0` to `i - 1`, ensuring only previous elements are checked.
- Compares `arr[j]` with `arr[i]`.

#### **`if` Condition**
```java
if(arr[j].equals(arr[i]))
    System.out.println(arr[j]);
```
- The `equals()` method checks if `arr[j]` (previous elements) is the same as `arr[i]`.
- If a match is found, it prints the duplicate name.

### 7. Closing the Scanner
```java
s.close();
```
- The `Scanner` object is closed to free resources.

## Example Run
### **Input:**
```
Enter the Size of Array
5
Enter the Elements
Alice
Bob
Alice
Charlie
Bob
```
### **Output:**
```
Alice
Bob
```
The program detects and prints duplicate names (Alice and Bob).

## Key Concepts Used
- **Arrays**: Used to store names.
- **Loops (`for`)**: Used for iteration through the array.
- **Conditionals (`if`)**: Used for duplicate detection.
- **String Methods (`equals()`)**: Used for string comparison.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Duplicate_Name_Detection.git
```
