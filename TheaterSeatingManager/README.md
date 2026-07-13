# Theater Seating Manager

A console-based Java application that manages theater seat reservations using a two-dimensional boolean array. Users can view available seats, book seats, and track the total number of booked tickets. The program maps user-friendly seat numbers to 2D array coordinates internally.

## Features

* Displays the current theater seating arrangement
* Shows available and booked seats separately

  * `✓` represents an available seat
  * `X` represents a booked seat
* Allows users to book available seats
* Prevents booking of already reserved seats
* Tracks the total number of booked tickets
* Converts seat numbers into corresponding row and column positions

## Technologies Used

* Java
* 2D Arrays
* Nested `for` loops
* `Scanner` for user input
* Enhanced `switch` expressions

## Sample Output

```text
**** WELCOME TO XYZ THEATER!! ****

1. See Available Seats
2. Book a Seat
3. Total sold out tickets
4. Quit

Enter your choice: 1

   1✓       2✓       3✓       4✓       5✓       6✓
   7✓       8✓       9✓      10X      11✓      12✓
   13✓     14✓      15✓      16✓      17✓      18✓

Enter your choice: 2

Enter the seat number you want to book: 10

Congratulations!! The seat 10 has been booked for you!!
```

## Concepts Practiced

* Two-dimensional arrays
* Array indexing and coordinate mapping
* Nested loops
* Methods and code organization
* Boolean state management
* Conditional statements
* User input handling
* Clean code practices
