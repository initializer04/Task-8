# Task-8

Online Quiz App (Java Console Project)
🎯 Objective Recap
Build a console-based quiz app in Java to:

Demonstrate understanding of object-oriented programming (OOP).

Practice control structures (if-else, loops).

Take input from the user via the console.

Store and process multiple-choice questions.

🧱 Core Concepts Used
1. Object-Oriented Programming (OOP)
This project uses the fundamental principles of OOP:

Class & Objects:
The Question class represents each quiz question as an object, encapsulating:

The question text

The answer options

The index of the correct answer

Encapsulation:
The data fields in the Question class (questionText, options, correctOptionIndex) are private and accessed via getter methods. This ensures that the data is protected from direct external access.

2. Java Collections: List
We use a List<Question> to store all the quiz questions. This provides dynamic management of question sets and can be easily scaled to include dozens or hundreds of questions.

java
Copy
Edit
List<Question> questions = new ArrayList<>();
3. Control Flow
The application uses control flow features such as:

for loops to iterate through each question

if-else to check if the user's answer is correct

Index-based comparison (userAnswer == correctOptionIndex)

This helps in:

Managing quiz progress

Providing instant feedback

Calculating the final score

4. Input Handling with Scanner
Java’s Scanner class is used to accept input from the user through the console.

java
Copy
Edit
Scanner scanner = new Scanner(System.in);
int userAnswer = scanner.nextInt() - 1;
This input is then compared with the correct answer for scoring.

5. Console Output
We use System.out.println() to:

Display questions and options

Prompt the user for input

Show correct/incorrect feedback

Display the final score

🧠 Program Flow Summary
Initialization

Create a list of Question objects with question text, options, and correct answers.

Quiz Loop

Iterate over the list of questions.

Display each question and options.

Take the user's input and validate it.

Check if the answer is correct and update the score.

Result

After the loop ends, display the total score.
