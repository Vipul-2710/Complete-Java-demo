cd 1.	Java Fundamentals
1.1 Introduction to Java
Java is a high-level, class-based, object-oriented programming language developed to create secure, reliable, and platform-independent software applications. It enables developers to write a program once and run it on any device that supports the Java Virtual Machine (JVM), following the principle of Write Once, Run Anywhere (WORA).
Java was developed by James Gosling and his team at Sun Microsystems and officially released in 1995. Since then, it has become one of the most widely used programming languages in the world, powering enterprise software, banking systems, Android applications, cloud platforms, web services, big data applications, and Internet of Things (IoT) devices.
Unlike many programming languages that compile directly into machine code, Java source code is first compiled into an intermediate form called bytecode. This bytecode is then executed by the Java Virtual Machine (JVM), allowing Java applications to run on different operating systems such as Windows, Linux, and macOS without modification.
Java is designed to be simple, secure, robust, portable, multithreaded, and object-oriented, making it an ideal language for both beginners and professional software developers.
Key Characteristics of Java
1. High-Level Language - Java uses English-like syntax that is easy to read, write, and understand. Example:System.out.println("Hello World"); The programmer does not need to understand machine language or hardware-level instructions.

2. Object-Oriented Programming Language (OOP) - Java follows the Object-Oriented Programming paradigm, where programs are organized around classes and objects.
The four pillars of OOP are:
•	Encapsulation 
•	Inheritance 
•	Polymorphism 
•	Abstraction 
These concepts make software modular, reusable, and easier to maintain.

3. Platform Independent - Java programs are not compiled directly into machine code.
Instead:
Java Source Code
↓
Java Compiler (javac)
↓
Bytecode (.class)
↓
Java Virtual Machine (JVM)
↓
Operating System
Since every operating system has its own JVM, the same Java program runs without modification on multiple platforms. This is known as Write Once, Run Anywhere (WORA).

4. Secure Programming Language - Java includes several security mechanisms:
•	No explicit pointers 
•	Bytecode verification 
•	Automatic memory management 
•	Class loader security 
•	Exception handling 
•	Sandboxed execution 
These features make Java suitable for banking, healthcare, and enterprise software.

5. Robust Language - Java minimizes programming errors through:
•	Strong type checking 
•	Exception handling 
•	Garbage Collection 
•	Automatic memory management 
•	Compile-time checking 
This improves application reliability.

6. Multithreading Support - Java allows multiple tasks to execute simultaneously. Examples include:
•	Downloading files while browsing 
•	Streaming videos 
•	Multiplayer games 
•	Banking servers 
•	Cloud services 

7. Distributed Language - Java supports networking and distributed computing. Applications running on different computers can communicate through:
•	Sockets 
•	RMI 
•	REST APIs 
•	Web Services 

8. Dynamic Language - Java loads classes dynamically during execution. This enables:
•	Runtime class loading 
•	Plugin development 
•	Dynamic libraries

Components of Java Platform
The Java platform consists of three important components.
1. JDK (Java Development Kit) - Used by developers.
Includes:
•	Java Compiler 
•	JVM 
•	JRE 
•	Development tools 
Purpose:
Develop Java applications.

2. JRE (Java Runtime Environment) - Used for running Java applications.
Contains:
•	JVM 
•	Libraries 
Purpose: Execute Java programs.

3. JVM (Java Virtual Machine) - Acts as the bridge between Java bytecode and the operating system.
Responsibilities:
•	Loads classes 
•	Verifies bytecode 
•	Allocates memory 
•	Executes bytecode 
•	Performs Garbage Collection 
•	Uses JIT Compiler
History of Java
The history of Java reflects the evolution of modern software development. Java was created to overcome the limitations of existing programming languages and to provide a simple, secure, portable, and platform-independent solution for developing applications that could run on a variety of devices.
Originally intended for consumer electronic devices such as televisions and set-top boxes, Java eventually evolved into one of the world's most successful programming languages, powering billions of devices and millions of applications across industries.

The Beginning: The Green Project (1991)
The story of Java began in 1991 at Sun Microsystems, where a team of engineers led by James Gosling, along with Mike Sheridan and Patrick Naughton, initiated an internal research effort known as the Green Project.
The objective of the project was to develop software that could run on a wide range of consumer electronic devices without requiring changes for different hardware platforms.
At that time, software had to be rewritten whenever it was moved to another operating system or processor. The Green Team aimed to solve this problem by creating a language that was portable, secure, and independent of hardware architecture.

Oak: The First Name
The programming language developed during the Green Project was initially named Oak, inspired by an oak tree located outside James Gosling's office.
Oak was specifically designed for embedded systems and consumer electronics. However, before the language could be released commercially, the name "Oak" was found to be legally trademarked by another company.
As a result, the development team selected a new name—Java, reportedly inspired by Java coffee enjoyed during brainstorming sessions.

Official Release of Java (1995)
Java was officially introduced to the public by Sun Microsystems in 1995.
The language immediately attracted attention because of its revolutionary Write Once, Run Anywhere (WORA) capability. Unlike traditional programming languages, Java programs could be compiled once into bytecode and executed on any platform equipped with a Java Virtual Machine (JVM).
This portability significantly simplified software development and deployment across different operating systems.

Growth During the Internet Era
The rapid growth of the Internet in the late 1990s contributed greatly to Java's popularity.
Java enabled developers to create:
•	Interactive web applications 
•	Network-based software 
•	Enterprise applications 
•	Distributed systems 
Businesses adopted Java because of its portability, security, and scalability.

Enterprise Adoption
As organizations required robust business applications, Java became the preferred language for enterprise software development.
Major industries using Java included:
•	Banking 
•	Insurance 
•	Healthcare 
•	Retail 
•	Telecommunications 
•	Government 
Technologies such as Servlets, JSP, and later the Spring Framework further strengthened Java's enterprise ecosystem.

Oracle Acquires Sun Microsystems (2010)
In 2010, Oracle Corporation acquired Sun Microsystems and became the official steward of Java.
Oracle introduced:
•	Regular Java releases 
•	Performance improvements 
•	Enhanced security 
•	New language features 
•	Long-Term Support (LTS) versions 
These updates ensured Java remained modern and competitive.

Modern Java
Today, Java continues to evolve with new features that improve developer productivity and application performance.
Modern Java supports:
•	Cloud-native development 
•	Microservices 
•	Artificial Intelligence 
•	Big Data 
•	Internet of Things (IoT) 
•	Enterprise applications 
•	Android development 
•	Financial systems 
Java remains one of the most in-demand programming languages worldwide.

1.2 Introduction to the Java Virtual Machine (JVM)
One of the most important reasons behind Java's popularity is the Java Virtual Machine (JVM). The JVM enables Java programs to run on different operating systems without changing the source code. It acts as a bridge between Java programs and the underlying hardware, making Java a platform-independent programming language.
Unlike languages such as C or C++, which compile directly into machine code specific to an operating system, Java programs are compiled into an intermediate format called bytecode. This bytecode can run on any system that has a compatible JVM installed.
The JVM is a software-based virtual machine that provides an execution environment for Java applications. It loads Java bytecode, verifies its security, manages memory, executes instructions, and optimizes program performance using advanced techniques such as Just-In-Time (JIT) Compilation and Garbage Collection.
Java Execution Process
Java Source Code (.java)
│
▼
Java Compiler (javac)
│
▼
Bytecode (.class)
│
▼
Java Virtual Machine (JVM)
│
▼
Machine Code
│
▼
Operating System
│
▼
Program Output
Write Once, Run Anywhere (WORA) - One of Java's greatest advantages is Write Once, Run Anywhere (WORA).
A Java program is compiled only once.
The generated bytecode can execute on:
•	Windows 
•	Linux 
•	macOS 
•	Android 
•	UNIX 
provided that each platform has its own JVM.
Responsibilities of JVM
The JVM performs several important tasks during program execution.
1. Loading Classes - The JVM loads the required .class files into memory before execution.
2. Bytecode Verification - The JVM verifies whether the bytecode is valid and secure.
It checks for:
•	Illegal code 
•	Memory violations 
•	Invalid instructions 
This prevents malicious programs from damaging the system.
3. Memory Management - The JVM automatically allocates memory for:
•	Objects 
•	Variables 
•	Methods 
•	Class information 
Programmers do not need to manually allocate or free memory.

4. Garbage Collection - Unused objects occupy memory unnecessarily.
The JVM automatically identifies unused objects and removes them from memory.
This process is called Garbage Collection.
Benefits include:
•	Prevents memory leaks 
•	Improves performance 
•	Reduces programmer effort 
5. Program Execution - The JVM converts bytecode into machine code and executes it.
6. Performance Optimization - The JVM improves execution speed using the Just-In-Time (JIT) Compiler, which converts frequently executed bytecode into native machine code.

Components of JVM
The JVM consists of several internal components that work together.
1. Class Loader Subsystem - The Class Loader loads Java classes into memory before execution. Its three stages are:
Loading - Loads required .class files into memory.
Linking -
•	Verifies bytecode 
•	Allocates memory 
•	Resolves symbolic references 
Initialization - Initializes static variables and static blocks.
2. JVM Memory Areas - The JVM divides memory into different regions.
a) Method Area
Stores:
•	Class definitions 
•	Method information 
•	Static variables 
•	Runtime constant pool 

b) Heap Memory - Stores:
•	Objects 
•	Instance variables 
It is the largest memory area and is shared among all threads. 
Example: Student s = new Student();The object Student is stored in the Heap.
c) Java Stack - Each thread has its own stack.
It stores:
•	Local variables 
•	Method calls 
•	Intermediate calculations 
Whenever a method is called, a new Stack Frame is created.
d) Program Counter (PC) Register - Stores the address of the instruction currently being executed. Each thread has its own PC Register.
e) Native Method Stack - Stores native methods written in languages like:
•	C 
•	C++ 
Execution Engine - The Execution Engine executes the bytecode.
It consists of: 
Interpreter - Executes bytecode instruction by instruction.
Advantages:
•	Fast startup 
•	Simple execution 
Disadvantage:
Repeated execution becomes slower.
JIT Compiler - Frequently executed bytecode is converted into machine code.
Advantages:
•	Faster execution 
•	Better performance 
•	Reduced execution time 

Garbage Collector - Automatically removes unused objects from memory.
Benefits:
•	Frees memory 
•	Prevents memory leaks 
•	Improves application stability 
Native Method Interface (JNI) - The Java Native Interface allows Java programs to communicate with programs written in:
•	C 
•	C++ 
•	Assembly Language 
Advantages of JVM
•	Platform independence 
•	Automatic memory management 
•	Enhanced security 
•	High performance 
•	Supports multithreading 
•	Reliable execution 
•	Automatic garbage collection 

Real-Life Example - Consider watching a movie with subtitles. The movie is the Java bytecode. The subtitles translate the movie into different languages. Similarly, the JVM translates Java bytecode into the machine language understood by the operating system.

1.3 Structure of a Java Program
Every Java program follows a predefined structure that helps developers write organized, readable, and maintainable code. Unlike some scripting languages, Java requires all executable statements to be placed inside classes and methods. Understanding the structure of a Java program is the first step toward writing correct Java applications.
A Java source file typically consists of optional package and import statements, a class declaration, variables, methods, and the mandatory main() method, which serves as the entry point of every standalone Java application.
Basic Structure of a Java Program
package mypackage;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

Components of a Java Program
1. Package Declaration - A package groups related Java classes together.
Syntax: package com.company.project;
2. Import Statements - Import statements allow a Java program to use classes from other packages. Example: import java.util.Scanner; Without importing, the Scanner class cannot be used directly.
3. Class Declaration - Every Java program must contain at least one class.
Syntax: public class HelloWorld
Rules:
•	Class name must match the filename. 
•	Class names begin with an uppercase letter (Java convention). 
•	Only one public class is allowed per source file. 
Example:
File Name
HelloWorld.java
Class Name
public class HelloWorld

4. Main Method - The JVM begins execution from the main() method.
Syntax: public static void main(String[] args)
Explanation:
•	public – accessible from anywhere. 
•	static – belongs to the class, so JVM can call it without creating an object. 
•	void – does not return a value. 
•	main – predefined entry point recognized by the JVM. 
•	String[] args – stores command-line arguments. 
5. Statements - Statements are executable instructions.
Example: System.out.println("Welcome to Java"); Every statement ends with a semicolon (;).
6. Comments - Comments improve code readability and documentation.
Single-line Comment // This is a comment
Multi-line Comment
/*
This is a
multi-line comment.
*/
Documentation Comment
/**
 * Displays student details.
 */
Documentation comments are used by Javadoc to generate API documentation.

7. Keywords - Java keywords have predefined meanings and cannot be used as identifiers. Common keywords include:
•	public 
•	class 
•	static 
•	void 
•	int 
•	if 
•	else 
•	return 
•	new 
•	try 
•	catch 
8. Identifiers - Identifiers are names given to:
•	Variables 
•	Methods 
•	Classes 
•	Objects 
Example: int studentAge;
Rules:
•	Must begin with a letter, _, or $. 
•	Cannot start with a digit. 
•	Cannot contain spaces. 
•	Cannot use Java keywords. 
•	Java is case-sensitive. 
9. Braces { } - Braces define blocks of code. Example:
public class Student {
    public static void main(String[] args){
        System.out.println("Java");
    }
}
10. Semicolon (;) - Every executable statement ends with a semicolon. Example: int age = 20;

Program Execution Steps
Step 1: Write source code.
Step 2: Save as: HelloWorld.java
Step 3: Compile javac HelloWorld.java. Creates HelloWorld.class
Step 4: Run java HelloWorld
Step 5: JVM executes bytecode.
Step 6: Output displayed on the screen.

1.4 Variables and Data Types in Java
A computer program processes information by storing, manipulating, and retrieving data. In Java, this data is stored using variables. Every variable has a specific data type, which determines the kind of values it can store and the operations that can be performed on it.
For example, a student's age is stored as an integer, salary as a decimal number, grade as a character, and name as text. Choosing the correct data type improves memory efficiency, program performance, and code readability.
Understanding variables and data types is fundamental because almost every Java program uses them to store user input, perform calculations, and produce meaningful results.
What is a Variable?
A variable is a named memory location used to store data temporarily during program execution. The value stored in a variable can change while the program is running.
When a variable is declared, the Java compiler allocates memory according to its data type.
Declaration and Initialization - A variable must be declared before use.
•	Declaration - int age; Memory is reserved but no value is assigned.
•	Initialization - age = 20; A value is assigned after declaration.
•	Declaration and Initialization Together - int age = 20; This is the most common practice.
Rules for Naming Variables - Java follows strict naming rules.
A variable name:
•	Must begin with a letter, underscore (_), or dollar sign ($). 
•	Cannot begin with a number. 
•	Cannot contain spaces. 
•	Cannot use Java keywords. 
•	Is case-sensitive. 
Examples:
•	studentName
•	rollNumber
•	totalMarks
•	employeeSalary
Invalid examples:
•	2age
•	student name
•	class

Naming Conventions - Java follows camelCase notation.
Correct examples:
•	studentName
•	firstName
•	monthlySalary
•	totalMarks
Incorrect examples:
•	Student_Name
•	student_name
•	STUDENTNAME
Using meaningful names improves program readability.

Types of Variables
Java has three types of variables.
1. Local Variables - Declared inside methods or blocks.
Characteristics:
•	Exist only during method execution 
•	Must be initialized before use 
•	Accessible only within the method 
Example:
public static void main(String[] args){
    int age = 20;
}

2. Instance Variables - Declared inside a class but outside methods.
Characteristics:
•	Each object gets its own copy 
•	Stored in Heap memory 
•	Initialized with default values 
Example:
class Student{
    int age;
}

3. Static Variables - Declared using the static keyword.
Characteristics:
•	Shared among all objects 
•	Created only once 
•	Stored in Method Area 
Example
class Student{
    static String college = "ABC College";
}
Data Types in Java - Every variable has a data type. A data type specifies
•	Memory size 
•	Range of values 
•	Type of data stored 
•	Operations allowed 
Java has two major categories of data types.
Primitive Data Types - Primitive data types are predefined by Java. They directly store actual values.
Java has 8 primitive data types.
Data Type	Size	Description	Example
byte	1 Byte	Small integers	byte age=25;
short	2 Bytes	Medium integers	short marks=500;
int	4 Bytes	Integer values	int salary=50000;
long	8 Bytes	Large integers	long population=8000000000L;
float	4 Bytes	Decimal values	float pi=3.14f;
double	8 Bytes	High precision decimals	double price=150.75;
char	2 Bytes	Single character	char grade='A';
boolean	JVM Dependent	True/False values	boolean passed=true;

Integer Data Types - Used to store whole numbers. Example: int marks = 90; long distance = 5000000000L;
Floating Point Data Types - Used for decimal numbers. Example: float temperature = 37.5f; double salary = 65234.85;
Character Data Type - Stores a single Unicode character. Example: char grade = 'A';
Characters use single quotation marks.
Boolean Data Type - Stores logical values. Example: boolean eligible = true; Used in decision-making.
Non-Primitive Data Types - Non-primitive types store references to objects. Examples include:
•	String 
•	Arrays 
•	Classes 
•	Objects 
•	Interfaces 
•	Enums 
String - Stores text. Example: String name = "Rahul"; Strings are immutable.
Arrays - Store multiple values of the same type. Example: int marks[] = {85,90,95};

Difference Between Primitive and Non-Primitive
Primitive	Non-Primitive
Stores actual value	Stores reference
Fixed size	Variable size
Faster	Comparatively slower
Cannot call methods	Supports methods
Cannot be null	Can be null

1.5 Operators in Java
Operators are symbols that instruct the computer to perform operations on variables and values. Java operators are used to perform calculations, compare values, assign data, and evaluate logical conditions.
Operators are fundamental to every Java program because they enable programs to solve mathematical problems, make decisions, and manipulate data.
What is an Operator?
An operator is a special symbol that performs an operation on one or more operands.
Example int sum = 20 + 10;
Here, 20 and 10 are operands. + is the operator. 
•	Arithmetic Operators - Arithmetic operators perform mathematical calculations.
Operator	Meaning	Example
+	Addition	a+b
-	Subtraction	a-b
*	Multiplication	a*b
/	Division	a/b
%	Modulus	a%b

Example: 
int a=20; 
int b=10;
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);

Applications
•	Billing software 
•	Banking 
•	Marks calculation 
•	Payroll systems 

Relational Operators - Relational operators compare two values. The result is always true or false.
Operator	Meaning
==	Equal to
!=	Not Equal
>	Greater than
<	Less than
>=	Greater than Equal
<=	Less than Equal
Example
int age=20;
System.out.println(age>=18);
Output
true
Applications
•	Login validation 
•	Eligibility checking 
•	Online examinations 

•	Logical Operators - Logical operators combine multiple conditions.
Operator	Meaning
&&	AND
||	OR
!	NOT

Example
boolean eligible=true;
boolean verified=true;
System.out.println(eligible && verified);
Applications
•	ATM systems 
•	User authentication 
•	Banking software 
•	Online shopping 
Real-Life Example - Bank Loan Approval. Loan approved if
•	Age > 21 
•	Income > 30000 
Logical Operator :(age>21 && income>30000)

1.6 Input and Output in Java
Programs become useful when they interact with users. Input allows a program to receive information from the user, while Output displays the processed information.
Java provides the Scanner class to read input from the keyboard and the System.out object to display output.
What is Input?
Input refers to the data entered by the user.
Examples
•	Name 
•	Age 
•	Marks 
•	Salary 

Scanner Class - The Scanner class belongs to
java.util
Import Statement
import java.util.Scanner;
Creating Scanner Object
Scanner sc = new Scanner(System.in);
Common Input Methods
Method	Reads
nextInt()	Integer
nextDouble()	Decimal
nextFloat()	Float
next()	Single Word
nextLine()	Complete Line
nextBoolean()	Boolean

Example
Scanner sc=new Scanner(System.in);
System.out.print("Enter age:");
int age=sc.nextInt();
System.out.println(age);
Output in Java - Output displays information on the screen.
•	print() - Displays output on the same line. System.out.print("Hello");
•	println() - Prints and moves to next line. System.out.println("Hello");
•	printf() - Displays formatted output. System.out.printf("Age=%d",20);
Real-Life Example – ATM Input: PIN; Amount 
Processing - Output: Balance;  Transaction Successful 

1.7 Type Casting in Java
Different operations often require converting one data type into another. Type Casting is the process of converting a value from one data type to another so that different types of data can work together.
For example, an integer may need to be converted into a decimal value for calculations, or a decimal number may need to be converted into an integer for storage or display.
Types of Type Casting
Java supports two types.
Type Casting
│
┌────┴─────┐
│          │
Implicit   Explicit
(Widening) (Narrowing)
•	Implicit Type Casting (Widening) - Automatically performed by Java. Smaller data type to Larger data type. Example: int number=25; double value=number; No data loss occurs.
•	Explicit Type Casting (Narrowing) - Performed manually by the programmer. Larger type to Smaller type. Example: double marks=95.75; int total=(int)marks; Output : 95. Decimal part is discarded.

2.	Control Flow Statements & Functions
2.1 Decision Making and Looping in Java
Programming is all about making decisions and performing repetitive tasks efficiently. In real life, people constantly make decisions based on conditions. For example, if it is raining, we carry an umbrella; otherwise, we do not. Similarly, if a student's marks are above 40, they pass; otherwise, they fail. Java provides decision-making statements such as if, if-else, nested if, and switch-case to perform different actions based on conditions.
Many programming tasks also require executing the same block of code repeatedly. For example, printing numbers from 1 to 100, processing records in a database, or calculating the sum of multiple numbers. Java provides loops such as for, while, and do-while to perform repetitive tasks efficiently. Additionally, break and continue statements help control the flow of loops.
Understanding these concepts is essential for building logical thinking and solving real-world programming problems.

What is Decision Making?
Decision-making statements allow a program to choose different execution paths based on whether a condition is true or false.
For example:
•	If age ≥ 18 → Eligible to vote. 
•	If password is correct → Login successful. 
•	If marks ≥ 40 → Student passes. 
Without decision-making statements, every program would execute sequentially without making choices.

2.1.1 The if Statement
The if statement executes a block of code only when the specified condition evaluates to true.
Syntax
if(condition)
{
    // statements
}
Example
int marks = 75;
if(marks >= 40)
{
    System.out.println("Pass");
}
Output
Pass

2.1.2 The if-else Statement
The if-else statement executes one block of code if the condition is true and another block if the condition is false.
Syntax
if(condition)
{
    // True block
}
else
{
    // False block
}
Example
int age = 20;
if(age >= 18)
{
    System.out.println("Eligible to Vote");
}
else
{
    System.out.println("Not Eligible");
}
Output: Eligible to Vote
Real-Life Example: An online shopping website checks whether a user has sufficient balance.
•	If balance is sufficient → Payment Successful. 
•	Otherwise → Payment Failed. 

2.1.3 Nested if Statement
A nested if is an if statement placed inside another if statement. It is used when multiple conditions need to be evaluated sequentially.
Syntax
if(condition1)
{
    if(condition2)
    {
        // Statements
    }
}
Example
int age = 22;
boolean hasLicense = true;

if(age >= 18)
{
    if(hasLicense)
    {
        System.out.println("Eligible to Drive");
    }
}
Output: Eligible to Drive
Applications
•	Banking transactions 
•	Online examination systems 
•	Employee promotions 
•	College admission systems 

2.1.4 Switch-Case Statement
The switch statement selects one block of code from multiple alternatives based on the value of a variable or expression.
It is a cleaner alternative to multiple if-else statements.
Syntax
switch(expression)
{
case value1:
    statements;
    break;
case value2:
    statements;
    break;
default:
    statements;
}
Example
int day = 3;
switch(day)
{
case 1:
    System.out.println("Monday");
    break;
case 2:
    System.out.println("Tuesday");
    break;
case 3:
    System.out.println("Wednesday");
    break;
default:
    System.out.println("Invalid Day");
}
Output: Wednesday
Applications
•	ATM menu 
•	Calculator menu 
•	Restaurant ordering system 
•	Mobile recharge plans 

2.2 Loops in Java
Loops execute a block of code repeatedly until a specified condition becomes false.
Without loops, programmers would need to write the same statements multiple times.
Example:
Printing numbers from 1 to 100 manually would require 100 print statements.
Using loops, it requires only a few lines of code.

Types of Loops
2.2.1 The for Loop
The for loop is used when the number of iterations is known beforehand.
Syntax
for(initialization; condition; increment)
{
    statements;
}
Example
for(int i=1; i<=5; i++)
{
    System.out.println(i);
}
Output
1
2
3
4
5
Applications
•	Printing multiplication tables 
•	Processing arrays 
•	Pattern printing 
•	Mathematical calculations 
2.2.2 While Loop
The while loop executes a block of code as long as the condition remains true.
The condition is checked before executing the loop body.
Syntax
while(condition)
{
    statements;
}
Example
int i = 1;
while(i <= 5)
{
    System.out.println(i);
    i++;
}
Output
1
2
3
4
5
Applications
•	Reading files 
•	Waiting for user input 
•	Menu-driven programs 
•	Game loops 

2.2.3 Do-While Loop
The do-while loop executes the loop body at least once before checking the condition.
Syntax
do
{
    statements;
}
while(condition);
Example
int i = 1;
do
{
    System.out.println(i);
    i++;
}
while(i <= 5);
Output
1
2
3
4
5
Applications
•	ATM transactions 
•	Menu-driven systems 
•	Password verification 
•	User interaction programs 
Comparison of Loops
Feature	for Loop	while Loop	do-while Loop
Condition Checked	Before execution	Before execution	After execution
Executes at least once	No	No	Yes
Best Used When	Number of iterations is known	Number of iterations is unknown	Code must execute at least once

2.3 Break Statement
The break statement immediately terminates the current loop or switch statement and transfers control to the next statement after the loop.
Syntax
break;
Example
for(int i = 1; i <= 10; i++)
{
    if(i == 5)
    {
        break;
    }
    System.out.println(i);
}
Output
1
2
3
4
Real-Life Example: Searching for a student record in a database. Once the record is found, there is no need to continue searching.

2.4 Continue Statement
The continue statement skips the current iteration of a loop and proceeds to the next iteration.
Syntax
continue;
Example
for(int i = 1; i <= 5; i++)
{
    if(i == 3)
    {
        continue;
    }
    System.out.println(i);
}
Output
1
2
4
5
Real-Life Example: A teacher skips absent students while taking attendance and continues with the remaining students.

Difference Between break and continue
Feature	break	continue
Purpose	Terminates the loop or switch	Skips the current iteration
Loop Execution	Stops completely	Continues with the next iteration
Used In	Loops and switch	Loops only
Control Flow	Exits immediately	Returns to loop condition

Real-World Applications
Concept	Practical Applications
if	Login systems, age verification, exam results
if-else	Banking, e-commerce discounts, eligibility checks
nested if	College admissions, loan approval, employee promotions
switch-case	ATM menus, calculators, restaurant ordering systems
for loop	Multiplication tables, report generation, array traversal
while loop	File reading, user input validation, server monitoring
do-while loop	ATM transactions, game menus, menu-driven applications
break	Search operations, exiting loops, terminating menus
continue	Data validation, skipping invalid records, attendance systems

2.5 Functions (Methods) in Java
As programs grow larger and more complex, writing all the code inside the main() method becomes difficult to read, debug, and maintain. Professional programmers divide a program into smaller, manageable units, where each unit performs a specific task. In Java, these units are called methods (also known as functions).
For example, consider an online banking application. Instead of writing all the code together, separate methods can be created for customer login, balance inquiry, fund transfer, bill payment, and transaction history. This modular approach makes the program organized, reusable, and easier to understand.
Methods are one of the most important concepts in Java because they promote code reusability, improve readability, simplify debugging, and support the principles of modular programming.

What is a Function (Method)?
A function is a reusable block of code that performs a specific task. In Java, functions are called methods because they are always defined inside a class. A method executes only when it is called (invoked).
Why are Methods Needed?
Imagine a program that calculates the total marks of 100 students.
Without methods:
•	The same calculation code would have to be written repeatedly. 
•	The program would become lengthy and difficult to maintain. 
With methods:
•	The calculation logic is written only once. 
•	It can be called whenever needed. 
Methods improve software quality by making programs:
•	Modular 
•	Reusable 
•	Readable 
•	Easy to test 
•	Easy to debug 

Real-Life Analogy
Consider a television remote. Each button performs a specific function.
•	Power Button → Turns the TV on or off. 
•	Volume Button → Adjusts the volume. 
•	Channel Button → Changes the channel. 
Instead of opening the television and performing the internal operations manually each time, you simply press the required button. Similarly, a Java method performs a predefined task whenever it is called.

Structure of a Java Method
A method consists of several parts.
returnType methodName(parameterList)
{
    // statements
}
Components of a Method
Component	Description
Access Modifier	Specifies the visibility of the method (public, private, protected).
Return Type	Specifies the type of value returned by the method.
Method Name	Name used to identify the method.
Parameters	Input values accepted by the method.
Method Body	Contains the statements that perform the task.
Return Statement	Returns a value to the calling method (if required).

Example of a Simple Method
public class Demo {
    static void displayMessage()
    {
        System.out.println("Welcome to Java Programming");
    }
    public static void main(String[] args)
    {
        displayMessage();
    }
}
Output: Welcome to Java Programming

How a Method Works
Program Starts
│
▼
main() Method
│
Calls displayMessage()
│
▼
Method Executes
│
▼
Returns to main()
│
▼
Program Ends

Advantages of Using Methods
Methods offer several benefits.
1. Code Reusability - The same method can be called multiple times without rewriting the code.
2. Modularity - Large programs are divided into smaller modules.
3. Easy Maintenance - Changes are made only in one place.
4. Better Readability - Programs become easier to understand.
5. Easy Testing - Each method can be tested independently.
6. Reduced Code Duplication - The same logic is not written repeatedly.

Types of Methods
Java methods can be classified into two categories.
1. Predefined (Built-in) Methods - These methods are provided by Java libraries.
Examples:
•	Math.sqrt()
•	Math.max()
•	System.out.println()
•	String.length()
Example : System.out.println(Math.sqrt(25)); Output: 5.0

2. User-Defined Methods - These methods are created by programmers according to application requirements.
Example
static void welcome()
{
    System.out.println("Hello Students");
}

Method Declaration - A method declaration tells Java about the method.
General Syntax
accessModifier returnType methodName(parameters)
{
    // body
}
Example
public static void display()
{
    System.out.println("Java");
}

Method Calling (Method Invocation) - A method executes only when it is called.
Example: display(); The control moves to the method, executes the statements, and returns to the calling location.

Method Execution Flow
Method Call
     │
     ▼
Control Transfers
     │
     ▼
Method Executes
     │
     ▼
Return Control

2.6 Code Reusability
Code reusability is the ability to use the same piece of code multiple times without rewriting it.
Instead of copying and pasting the same statements repeatedly, programmers create a method once and call it whenever needed.
Example Without Code Reusability
System.out.println("Welcome");
System.out.println("Welcome");
System.out.println("Welcome");
The same statement is repeated three times.

Example Using a Method
static void welcome()
{
    System.out.println("Welcome");
}
public static void main(String[] args)
{
    welcome();
    welcome();
    welcome();
}
Output
Welcome
Welcome
Welcome
The method is written only once and reused multiple times.

Real-Life Example: Imagine a school where the attendance report is generated every day. Instead of writing the attendance calculation code for every class separately, one reusable method can generate attendance reports for all classes. Similarly, in an e-commerce application, one payment method can process payments for different products.

2.7 Method Parameters
Parameters are variables that receive input values when a method is called. They allow a method to work with different data each time it is executed.
Why are Parameters Needed?
Without parameters, methods always perform the same task. Parameters make methods flexible and reusable.

Syntax
returnType methodName(dataType parameter)
{
    // statements
}

Example
public class Demo {
    static void displayName(String name)
    {
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        displayName("Rahul");
        displayName("Anita");
    }
}
Output
Rahul
Anita
The same method displays different names because it accepts parameters.

Multiple Parameters - A method can accept more than one parameter.
Example
static void add(int a, int b)
{
    System.out.println(a + b);
}
Method Call
add(20,30);
Output
50

Actual Parameters (Arguments) vs Formal Parameters
Formal Parameters	Actual Parameters (Arguments)
Declared in the method definition	Passed during the method call
Receive values	Supply values
Variables	Actual data

Example
static void display(int number)   // number → Formal Parameter
{
    System.out.println(number);
}
display(50);                      // 50 → Actual Parameter (Argument)

2.8 Return Type
Some methods perform a task and send a value back to the calling method. The data type of the returned value is called the return type.
Void Return Type
If a method does not return any value, the return type is void.
Example
static void message()
{
    System.out.println("Hello");
}

Returning a Value
Example
static int square(int number)
{
    return number * number;
}
Method Call
int result = square(5);

System.out.println(result);
Output: 25

Return Statement - The return statement ends the execution of a method and sends a value back to the calling method. Example: return total; Once the return statement executes, control immediately returns to the calling method.

Types of Methods Based on Parameters and Return Values
Type	Parameters	Return Value	Example
Type 1	No	No	void display()
Type 2	Yes	No	void display(String name)
Type 3	No	Yes	int getAge()
Type 4	Yes	Yes	double calculateArea(double radius)

Example: Method with Parameters and Return Value
public class Calculator {
    static int multiply(int a, int b)
    {
        return a * b;
    }
    public static void main(String[] args)
    {
        int answer = multiply(6, 8);
        System.out.println(answer);
    }

}
Output: 48

Method Call Stack (Concept)
Whenever a method is called:
1.	The current method pauses. 
2.	Control moves to the called method. 
3.	The called method executes. 
4.	The called method returns control. 
5.	The previous method resumes execution. 

Real-World Applications
Method Concept	Practical Applications
Methods	ATM operations, login systems, online banking, calculators
Code Reusability	Payroll systems, attendance management, billing software
Parameters	Student information, employee records, shopping cart details
Return Values	Tax calculation, interest computation, result generation, report cards

3.	OOPs Concepts
As software systems become larger and more complex, writing programs using only functions and procedures becomes difficult to manage. Real-world applications such as banking systems, e-commerce websites, hospital management systems, and social media platforms require programs that are modular, reusable, secure, and easy to maintain.
To address these challenges, Java follows the Object-Oriented Programming (OOP) paradigm. OOP organizes software around objects, which represent real-world entities such as students, employees, vehicles, customers, or bank accounts. Each object contains data (attributes) and behaviour (methods).
By modelling software around objects, OOP simplifies software development, improves code reusability, enhances security, and makes applications easier to extend and maintain.

3.1 What is Object-Oriented Programming (OOP)?
Object-Oriented Programming (OOP) is a programming paradigm that organizes software into objects, where each object contains both data (attributes) and methods (behavior). OOP focuses on designing programs that closely represent real-world entities and their interactions.
Unlike procedural programming, which emphasizes functions and procedures, OOP emphasizes objects that communicate with one another to perform tasks.


Real-Life Analogy - Consider a car. A car has:
Attributes (Data)
•	Brand 
•	Color 
•	Engine Number 
•	Speed 
•	Fuel Level 
Behaviors (Methods)
•	Start() 
•	Accelerate() 
•	Brake() 
•	Stop() 
Similarly, in Java, a Car object stores its attributes as variables and performs actions through methods.

Characteristics of OOP
Object-Oriented Programming is based on four fundamental principles.
1. Encapsulation - Combining data and methods into a single unit while restricting direct access to data.
2. Abstraction - Showing only essential information while hiding implementation details.
3. Inheritance - Creating new classes from existing classes to promote code reuse.
4. Polymorphism - Allowing the same method to perform different tasks depending on the object.

Applications of OOP
OOP is widely used in:
•	Banking systems 
•	E-commerce platforms 
•	Hospital management systems 
•	Mobile applications 
•	Desktop applications 
•	Cloud computing 
•	Artificial Intelligence 
•	Game development 
•	Enterprise software 

3.2 Class in Java
A class is a blueprint or template used to create objects. It defines the properties (variables) and behaviors (methods) that objects of that class will possess.
A class itself does not occupy significant memory for object data until objects are created.
Real-Life Analogy: Consider the blueprint of a house.
The blueprint specifies:
•	Number of rooms 
•	Kitchen 
•	Windows 
•	Doors 
However, no actual house exists until construction begins.
Similarly:
•	Class - Blueprint 
•	Object - Actual House 

Syntax of a Class
class Student
{
    int rollNo;
    String name;
    void display()
    {
        System.out.println(name);
    }
}

Components of a Class
A class can contain:
•	Variables (Fields) 
•	Methods 
•	Constructors 
•	Nested Classes 
•	Static Members 
•	Constants 

3.3 Object in Java
An object is a real instance of a class. It occupies memory and represents an actual entity.
Every object has:
•	State (Data) 
•	Behavior (Methods) 
•	Identity (Unique reference) 
Creating an Object
Objects are created using the new keyword.
Student s1 = new Student();
Here,
•	Student - Class 
•	s1 - Reference Variable 
•	new - Allocates memory 
•	Student() - Constructor 


Difference Between Class and Object
Class	Object
Blueprint	Instance of a class
Logical entity	Physical entity
Does not store actual values	Stores actual values
Created once	Multiple objects can be created
Defines properties and methods	Uses properties and methods

3.4 Constructors in Java
A constructor is a special method that is automatically called when an object is created. Its primary purpose is to initialize the object's data members. Unlike ordinary methods, constructors do not have a return type.

Characteristics of Constructors
•	Same name as the class. 
•	No return type. 
•	Called automatically. 
•	Used to initialize objects. 
•	Can be overloaded. 

Syntax
class Student
{
    Student()
    {
        System.out.println("Object Created");
    }
}
Example
class Student
{
    Student()
    {
        System.out.println("Welcome");
    }
    public static void main(String args[])
    {
        Student s = new Student();
    }
}
Output: Welcome

Types of Constructors
Java provides two main types of constructors.
1. Default Constructor - A constructor with no parameters.
class Student
{
    Student()
    {
        System.out.println("Default Constructor");
    }
}

2. Parameterized Constructor - A constructor that accepts parameters.
class Student
{
    String name;

    Student(String n)
    {
        name = n;
    }
}
Object Creation
Student s = new Student("Rahul");

Constructor Overloading - Multiple constructors with different parameter lists.
class Student
{
    Student()
    {
    }
    Student(String name)
    {
    }
    Student(int rollNo,String name)
    {
    }
}

Constructor vs Method
Constructor	Method
Same name as class	Any valid name
No return type	Has return type or void
Called automatically	Called explicitly
Initializes objects	Performs operations

3.5 The this Keyword
The this keyword is a reference variable that refers to the current object of the class. Whenever an object invokes a method or constructor, this refers to that particular object.
Why is this Needed?
Sometimes the local variables (parameters) have the same names as instance variables.
Example:
class Student
{
    String name;
    Student(String name)
    {
        this.name = name;
    }
}
Here,
•	Left side → Instance Variable 
•	Right side → Parameter 
Without this, Java cannot distinguish between them.

Example
class Student
{
    int rollNo;
    Student(int rollNo)
    {
        this.rollNo = rollNo;
    }
    void display()
    {
        System.out.println(rollNo);
    }
    public static void main(String args[])
    {
        Student s = new Student(101);
        s.display();
    }
}
Output: 101

Uses of this Keyword
1. Refer Current Object Variables - this.name = name;
2. Invoke Current Class Method - this.display();
3. Invoke Current Class Constructor - this("Rahul");
4. Pass Current Object as an Argument - display(this);
5. Return Current Object - return this;

Real-Life Analogy: Imagine a classroom with several students. The teacher says: "This student should submit the assignment." The word "this" refers to the specific student currently being addressed. Similarly, in Java, the this keyword refers to the current object executing the method or constructor.
3.6 Encapsulation in Java
In object-oriented programming, one of the primary objectives is to protect data from unauthorized access and modification. Imagine a bank account where anyone could directly change the account balance without following any banking rules. Such unrestricted access could lead to incorrect or insecure data. To prevent this, Java provides the concept of Encapsulation, which combines data and methods into a single unit and restricts direct access to the data.
Encapsulation is one of the four fundamental pillars of Object-Oriented Programming (OOP). It improves data security, promotes modular programming, and ensures that data is accessed only through controlled methods.

Real-Life Analogy: Consider an ATM Machine. A customer cannot directly access the money stored inside the ATM. Instead, the customer performs operations through secure interfaces:
•	Insert ATM Card 
•	Enter PIN 
•	Select Transaction 
•	Withdraw Cash 
The internal banking operations remain hidden.
Similarly, in Java:
•	Data is hidden inside a class. 
•	Public methods provide controlled access. 

Data Hiding - Data hiding means restricting direct access to variables so that they cannot be modified from outside the class. This is achieved using the private access modifier.
Example
class Student
{
    private int marks;
}
The variable marks cannot be accessed directly outside the class.

Complete Example of Encapsulation
class Student
{
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        Student s = new Student();
        s.setName("Rahul");
        s.setAge(20);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
Output: Rahul 20

Real-Life Applications
Encapsulation is widely used in:
•	Banking software 
•	Hospital management systems 
•	Student management systems 
•	Payroll systems 
•	E-commerce applications 
•	Mobile applications 

3.7 Inheritance in Java
Many real-world objects share common characteristics. For example, a Car, Bus, and Bike are all vehicles. They have common properties such as color, speed, and engine, but each also has unique features.
Instead of rewriting the same code for every class, Java provides Inheritance, which allows one class to acquire the properties and methods of another class. Inheritance promotes code reusability, reduces duplication, and establishes relationships between classes. Inheritance is one of the four pillars of Object-Oriented Programming (OOP) and forms the foundation for building hierarchical class structures.
Why Inheritance?
Without inheritance:
•	The same code must be written repeatedly. 
•	Programs become lengthy. 
•	Maintenance becomes difficult. 
With inheritance:
•	Code is reused. 
•	Development becomes faster. 
•	Programs become organized. 
•	Maintenance becomes easier. 

Real-Life Analogy: Consider a Father and Son. The son inherits:
•	Eye color 
•	Height 
•	Hair type 
•	Family surname 
Similarly, in Java, a child class inherits the variables and methods of its parent class.

Terminology
Term	Description
Parent Class	Class whose members are inherited
Child Class	Class that inherits from another class
Superclass	Existing class
Subclass	Newly created derived class

Syntax of Inheritance
Java uses the extends keyword.
class Parent
{
    // variables and methods
}
class Child extends Parent
{
    // additional members
}

Example
class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
Output: 
Animal is eating
Dog is barking

Types of Inheritance
Java supports the following types through classes.

1. Single Inheritance - One child inherits from one parent.
Animal - Dog
Example
class Animal
{
}
class Dog extends Animal
{
}

2. Multilevel Inheritance - A child class becomes the parent of another class.
Animal – Dog - Puppy
Example
class Animal
{
}
class Dog extends Animal
{
}
class Puppy extends Dog
{
}

3. Hierarchical Inheritance - Multiple child classes inherit from one parent.
        Animal
      /    |    \
    Dog   Cat   Cow
Example
class Animal
{
}
class Dog extends Animal
{
}
class Cat extends Animal
{
}

Applications of Inheritance
Inheritance is widely used in:
•	Banking applications 
•	Hospital management systems 
•	Employee management systems 
•	E-commerce websites 
•	Game development 
•	Mobile applications 
•	GUI frameworks 
•	Enterprise software 

Difference Between Parent and Child Classes
Parent Class	Child Class
Base class	Derived class
Provides common properties	Inherits and extends properties
Can exist independently	Depends on parent class
Reusable	Specialized implementation

3.8 Polymorphism in Java
One of the most powerful features of Object-Oriented Programming (OOP) is the ability of a single entity to behave in different ways depending on the context. This concept is known as Polymorphism. The term polymorphism is derived from two Greek words:
•	Poly = Many 
•	Morph = Forms 
Thus, polymorphism means "one interface, many forms."
In Java, polymorphism allows the same method name to perform different tasks depending on the number of parameters, parameter types, or the object that invokes the method. This capability increases code flexibility, promotes code reuse, and simplifies software maintenance.
For example, a smartphone's Camera application has a single Capture button. Depending on the selected mode, the same button can take a photo, record a video, capture a panorama, or scan a QR code. Similarly, in Java, one method name can perform multiple functions.
Polymorphism is one of the four pillars of Object-Oriented Programming, alongside Encapsulation, Inheritance, and Abstraction.
Why Polymorphism?
Without polymorphism:
•	Different names would be required for similar operations. 
•	Programs would become lengthy and difficult to maintain. 
•	Code duplication would increase. 
With polymorphism:
•	The same method name can perform different tasks. 
•	Programs become modular. 
•	Code becomes reusable. 
•	Maintenance becomes easier. 

Real-Life Analogy: Consider a person. The same individual behaves differently depending on the situation.
•	At home - Parent 
•	At office - Employee 
•	At school   Teacher 
•	At bank - Customer 
Although the person is the same, the role changes depending on the environment. Similarly, in Java, the same method behaves differently depending on parameters or objects.

Types of Polymorphism
Java supports two types of polymorphism.
1.	Compile-Time Polymorphism - Compile-time polymorphism occurs when the compiler determines which method to execute during compilation. It is achieved using Method Overloading. Also known as: Static Binding and Early Binding. It is the process of defining multiple methods with the same name in the same class but with different parameter lists. The compiler identifies the appropriate method based on:
o	Number of parameters 
o	Data types of parameters 
o	Order of parameters 

Why Method Overloading?
Suppose a calculator performs addition.
Instead of creating methods like:
•	addInt()
•	addDouble()
•	addThreeNumbers()
We can simply write: add(), with different parameter lists. This improves readability.

Rules for Method Overloading
Methods must differ in at least one of the following:
•	Number of parameters 
•	Type of parameters 
•	Order of parameters 
Changing only the return type does not overload a method.

•	Runtime Polymorphism - Runtime polymorphism occurs when the method to be executed is determined during program execution. It is achieved using Method Overriding. Also called: Dynamic Binding and Late Binding. Method Overriding occurs when a child class provides its own implementation of a method already defined in the parent class. The child method replaces the parent implementation.

Why Method Overriding?
Different child classes may perform the same operation differently.
Example
Animal - Dog - Bark
Cat - Meow
Cow - Moo
Each animal makes a different sound.

Rules for Method Overriding
•	Parent and child classes are required. 
•	Method names must be identical. 
•	Parameters must be identical. 
•	Return type should be the same (or covariant). 
•	Access modifier cannot be more restrictive. 
•	Static methods cannot be overridden. 
•	Constructors cannot be overridden. 

Example
class Animal
{
    void sound()
    {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog Barks");
    }
}
public class Demo
{
    public static void main(String args[])
    {
        Animal obj = new Dog();
        obj.sound();
    }
}
Output: Dog Barks

Method Overloading vs Method Overriding
Feature	Method Overloading	Method Overriding
Definition	Same method name with different parameters	Child class redefines parent method
Occurs In	Same class	Parent and Child classes
Parameters	Different	Same
Return Type	Can differ (not sufficient alone)	Same or covariant
Inheritance Required	No	Yes
Binding	Compile Time	Runtime
Polymorphism Type	Compile-Time	Runtime

Compile-Time vs Runtime Polymorphism
Compile-Time	Runtime
Method Overloading	Method Overriding
Static Binding	Dynamic Binding
Faster	Slightly slower
Decided by Compiler	Decided during Execution

3.9 Abstraction in Java
In the real world, people interact with complex systems every day without knowing their internal implementation. For example, when using a smartphone, users can make calls, send messages, browse the internet, and take photographs without understanding the underlying hardware, operating system, or communication protocols. Similarly, when driving a car, the driver uses the steering wheel, accelerator, and brake pedals without needing to understand how the engine or transmission works internally.
This concept of exposing only the necessary functionality while hiding the internal implementation is known as Abstraction.
Abstraction is one of the four fundamental pillars of Object-Oriented Programming (OOP). It helps developers design software that is modular, secure, maintainable, and easy to extend. Java supports abstraction through Abstract Classes and Interfaces.

Real-Life Analogy: Example 1: ATM Machine. A customer performs operations such as:
•	Withdraw Money 
•	Deposit Money 
•	Check Balance 
The customer does not know:
•	How the bank verifies the account. 
•	How the balance is updated. 
•	How transactions are processed. 
Only the required functionality is visible.

Example 2: Television Remote. A television remote provides buttons such as:
•	Power 
•	Volume 
•	Channel 
Users know what each button does but do not know the internal electronic circuitry that makes the television respond.
Similarly, abstraction hides implementation details while exposing functionality.

Why Abstraction?
Without abstraction:
•	Programs become complex. 
•	Users can accidentally modify implementation details. 
•	Maintenance becomes difficult. 
•	Security decreases. 
With abstraction:
•	Complexity is reduced. 
•	Programs become modular. 
•	Implementation can change without affecting users. 
•	Maintenance becomes easier. 

Features of Abstraction
•	Hides implementation details. 
•	Shows only essential functionality. 
•	Improves security. 
•	Reduces complexity. 
•	Supports modular programming. 
•	Improves maintainability. 
•	Promotes code reuse. 
•	Makes software scalable. 

Ways to Achieve Abstraction in Java - Java provides two mechanisms.
1.	Abstract Class - An abstract class is a class that cannot be instantiated (objects cannot be created directly). It is declared using the abstract keyword. An abstract class serves as a blueprint for its subclasses.
Characteristics of an Abstract Class
•	Declared using the abstract keyword. 
•	Cannot create objects directly. 
•	Can contain abstract and non-abstract methods. 
•	Can contain constructors. 
•	Can contain instance variables. 
•	Can contain static methods. 
•	Can be inherited by other classes. 

Syntax
abstract class Vehicle
{
}

2.	Abstract Method - An abstract method is a method declared without implementation.
The child class must provide its implementation.
Syntax: abstract void start();
Notice there is no method body.

Example of Abstract Class
abstract class Animal
{
    abstract void sound();
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog Barks");
    }
}
public class Demo
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.sound();
    }
}
Output: Dog Barks

Rules of Abstract Classes
•	Cannot instantiate an abstract class. 
•	May contain abstract and concrete methods. 
•	May contain constructors. 
•	Can have instance variables. 
•	Child class must implement all abstract methods. 
•	If the child class does not implement all abstract methods, it must also be declared abstract. 

Interface
An interface is a completely abstract blueprint that specifies what a class should do but not how it should do it. A class implements an interface using the implements keyword.
Why Interfaces?
Interfaces allow unrelated classes to implement the same functionality.
They provide:
•	Multiple inheritance 
•	Standardization 
•	Loose coupling 
•	Better flexibility 

Syntax
interface Vehicle
{
    void start();
}
Implementation
class Car implements Vehicle
{
    public void start()
    {
        System.out.println("Car Started");
    }
}

Complete Example
interface Animal
{
    void sound();
}
class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Dog Barks");
    }
}
public class Demo
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.sound();
    }
}
Output: Dog Barks

Features of Interfaces
•	Cannot create objects. 
•	Supports multiple inheritance. 
•	Contains abstract methods. 
•	Variables are public, static, and final by default. 
•	Methods are public and abstract by default (except default and static methods introduced in Java 8). 
•	Provides complete abstraction (conceptually). 

Interface Variables
Variables declared inside an interface are automatically:
•	public 
•	static 
•	final 
Example
interface Student
{
    int age = 20;
}
Equivalent to
public static final int age = 20;

Abstract Class vs Interface
Feature	Abstract Class	Interface
Object Creation	Not Allowed	Not Allowed
Constructors	Yes	No
Instance Variables	Yes	No (only constants)
Concrete Methods	Yes	Yes (default/static methods)
Abstract Methods	Yes	Yes
Multiple Inheritance	No	Yes
Keyword	extends	implements

When to Use Abstract Class?
Use an abstract class when:
•	Classes share common code. 
•	Some methods have the same implementation. 
•	Common variables are required. 
•	Constructor is needed. 
Example
Vehicle
↓
Car
Bus
Bike

When to Use Interface?
Use an interface when:
•	Only behavior is shared. 
•	Multiple inheritance is required. 
•	Different classes require the same contract. 
•	Loose coupling is desired. 
Example
Payment
↓
Credit Card
UPI
Net Banking

Difference Between Abstraction and Encapsulation
Abstraction	Encapsulation
Hides implementation	Hides data
Achieved using abstract classes and interfaces	Achieved using private variables
Focuses on functionality	Focuses on security
Answers "What?"	Answers "How?"

Advantages of Abstraction
•	Reduces software complexity. 
•	Improves security. 
•	Makes code reusable. 
•	Simplifies maintenance. 
•	Supports modular design. 
•	Improves scalability. 
•	Enables loose coupling. 
•	Encourages standardization.

4.Exception Handling
In real-world applications, errors can occur at any time during program execution. A user may enter invalid input, a file may not exist, a network connection may fail, or a program may attempt to divide a number by zero. If such errors are not handled properly, the program may terminate unexpectedly, leading to poor user experience and unreliable software.
To address these situations, Java provides a powerful Exception Handling mechanism. Exception handling enables programmers to detect runtime errors, handle them gracefully, and continue program execution without abrupt termination.
Exception handling is an essential feature of Java because it improves the reliability, maintainability, and robustness of applications.

4.1 What are Exceptions?
An exception is an event that occurs during program execution and disrupts the normal flow of instructions. When an exception occurs, Java creates an object representing the error and transfers control to an appropriate exception-handling mechanism.

Real-Life Analogy: Imagine driving a car.
Normally:
•	Start the car 
•	Drive 
•	Reach destination 
Unexpected situations:
•	Flat tyre 
•	Engine failure 
•	Empty fuel tank 
Instead of abandoning the journey, you repair the issue and continue. Similarly, Java handles unexpected situations using exception handling.

Why Exception Handling?
Without exception handling:
•	Program terminates immediately. 
•	Remaining code is not executed. 
•	Poor user experience. 
•	Difficult debugging. 
With exception handling:
•	Program continues execution. 
•	Errors are handled gracefully. 
•	Software becomes reliable. 
•	Improves maintainability. 

Example Without Exception Handling
public class Demo
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println(result);
        System.out.println("Program Completed");
    }
}
Output
Exception in thread "main"
java.lang.ArithmeticException: / by zero
The program terminates immediately.

Example With Exception Handling
public class Demo
{
    public static void main(String args[])
    {
        try
        {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero.");
        }
        System.out.println("Program Continues...");
    }
}
Output
Cannot divide by zero.
Program Continues...

Exception Hierarchy
Java exceptions are organized in a hierarchy.
                 Object
                    │
              Throwable
              ┌─────┴─────┐
              │           │
           Error      Exception
                          │
         ┌────────────────┼──────────────┐
         │                │              │
Checked Exceptions   Runtime Exceptions  User-defined Exceptions

Types of Exceptions
Java exceptions are broadly classified into two categories.
1. Checked Exceptions - Checked exceptions are checked by the compiler during compilation.
The programmer must handle or declare them.
Examples
•	IOException 
•	SQLException 
•	FileNotFoundException 
•	ClassNotFoundException 

2. Unchecked Exceptions - Unchecked exceptions occur during runtime. They are not checked by the compiler.
Examples
•	ArithmeticException 
•	NullPointerException 
•	ArrayIndexOutOfBoundsException 
•	NumberFormatException 

Difference Between Checked and Unchecked Exceptions
Checked Exception	Unchecked Exception
Checked during compilation	Occurs during execution
Must be handled	Optional to handle
Extends Exception	Extends RuntimeException
Compiler checks	Compiler does not check

4.2 The try-catch Block
The try block contains code that may generate an exception.
Syntax
try
{
    // risky code
}

Example
public class Demo
{
    public static void main(String args[])
    {
        try
        {
            int result = 50 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed.");
        }
        System.out.println("End of Program");
    }
}
Output
Division by zero is not allowed.
End of Program

4.3 finally Block
The finally block contains statements that execute whether an exception occurs or not.
It is commonly used to release resources such as files, database connections, and network connections.
Syntax
try
{

}
catch(Exception e)
{
}
finally


}

Example
public class Demo
{
    public static void main(String args[])
    {
        try
        {
            int result = 10 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Handled");
        }
        finally
        {
            System.out.println("Closing Resources");
        }
    }
}
Output
Exception Handled
Closing Resources

4.4 throw Keyword
The throw keyword is used to explicitly create and throw an exception. Instead of waiting for Java to generate an exception automatically, the programmer generates it manually.
Syntax: throw new ExceptionType();

Example
public class Demo
{
    public static void main(String args[])
    {
        int age = 16;
        if(age < 18)
        {
            throw new ArithmeticException("Not Eligible to Vote");
        }
        System.out.println("Eligible");
    }
}
Output
Exception in thread "main"
java.lang.ArithmeticException:
Not Eligible to Vote

Why Use throw?
Programmers use throw when business rules are violated.
Examples
•	Invalid age 
•	Negative salary 
•	Invalid marks 
•	Insufficient balance 

4.5 throws Keyword
The throws keyword declares that a method may generate one or more exceptions. It transfers the responsibility of handling the exception to the calling method.
Syntax: returnType methodName() throws ExceptionType

Example
import java.io.*;
public class Demo
{
    static void readFile() throws IOException
    {
    }
    public static void main(String args[])
    {
    }
}

Difference Between throw and throws
throw	throws
Used to throw an exception	Used to declare exceptions
Used inside a method	Used in method declaration
Throws one exception object	Can declare multiple exceptions
Programmer creates exception	Compiler is informed about possible exceptions

4.6 Custom Exceptions
Java allows programmers to create their own exceptions according to application requirements.
Custom exceptions are created by extending the Exception class.
Why Custom Exceptions?
Built-in exceptions cannot represent every business rule.
Examples
•	Invalid Age Exception 
•	Invalid Marks Exception 
•	Low Balance Exception 
•	Invalid Password Exception 

Creating a Custom Exception
class InvalidAgeException extends Exception
{
    InvalidAgeException(String message)
    {
        super(message);
    }
}

Using a Custom Exception
public class Demo
{
    static void checkAge(int age) throws InvalidAgeException
    {
        if(age < 18)
        {
            throw new InvalidAgeException("Age must be 18 or above.");
        }

        System.out.println("Eligible");
    }
    public static void main(String args[])
    {
        try
        {
            checkAge(16);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
Output: Age must be 18 or above.

Common Runtime Exceptions
Exception	Cause
ArithmeticException	Divide by zero
NullPointerException	Accessing null object
ArrayIndexOutOfBoundsException	Invalid array index
NumberFormatException	Invalid number conversion
StringIndexOutOfBoundsException	Invalid string index

5.Collection Frameworks
Modern software applications deal with large amounts of data. For example, an online shopping application stores thousands of products, a banking system manages millions of customer accounts, and a social media platform processes millions of user profiles and posts. Managing such data efficiently requires flexible and dynamic data structures.
In Java, arrays can store multiple elements, but they have several limitations. Arrays have a fixed size, provide limited built-in operations, and are not suitable for applications where the amount of data changes dynamically.
To overcome these limitations, Java provides the Collections Framework (JCF), a unified architecture for storing, organizing, retrieving, and manipulating groups of objects efficiently.
The Java Collections Framework offers ready-made classes and interfaces that simplify programming, improve performance, and reduce development time.

5.1 What is the Java Collections Framework (JCF)?
The Java Collections Framework (JCF) is a set of interfaces and classes that provide standardized methods to store, organize, manipulate, and retrieve collections of objects dynamically. Unlike arrays, collections can grow or shrink automatically as elements are added or removed.
Why Collections?
Arrays have several limitations:
•	Fixed size 
•	Difficult insertion and deletion 
•	No built-in searching or sorting methods 
•	Cannot efficiently handle dynamic data 
Collections overcome these problems by providing:
•	Dynamic resizing 
•	Efficient searching 
•	Easy insertion and deletion 
•	Built-in sorting 
•	Powerful utility methods 

Features of Collections
•	Dynamic memory allocation 
•	Automatic resizing 
•	Easy insertion and deletion 
•	Built-in searching and sorting 
•	High performance 
•	Generic programming support 
•	Reusable data structures 

Real-Life Analogy: Consider a library. Books are organized differently depending on the requirement.
•	Reading list - Ordered list 
•	Unique book IDs - Set 
•	Book ID - Book Details - Map 
Similarly, Java provides different collection types for different purposes.

Collection Hierarchy
                         Iterable
                             │
                        Collection
        ┌────────────────────┼───────────────────┐
        │                    │                   │
       List                 Set                Queue
        │                    │
 ┌──────┴──────┐         ┌────┴────┐
 │             │         │         │
ArrayList  LinkedList  HashSet  TreeSet

                    Map (Separate Interface)
                          │
                 ┌────────┴─────────┐
                 │                  │
              HashMap          TreeMap

Main Interfaces of Collections
Interface	Description
List	Ordered collection
Set	Collection of unique elements
Queue	Elements processed in FIFO order
Map	Stores key-value pairs

Generic Collections - Java collections use Generics for type safety.
Example: rrayList<String> names = new ArrayList<>(); Only String objects can be stored.
Benefits
•	Compile-time type checking 
•	No explicit type casting 
•	Improved readability 

5.2 List Interface
A List is an ordered collection that allows duplicate elements and maintains insertion order.
List elements can be accessed using indexes.

Characteristics of List
•	Ordered 
•	Allows duplicates 
•	Indexed 
•	Dynamic size 
•	Supports null values 

Common List Implementations
•	ArrayList 
•	LinkedList 
•	Vector 
•	Stack 

5.3 ArrayList
An ArrayList is a resizable array implementation of the List interface. It automatically increases or decreases its size as elements are added or removed.

Features of ArrayList
•	Dynamic array 
•	Fast random access 
•	Maintains insertion order 
•	Allows duplicate elements 
•	Allows null values 
•	Slower insertion/deletion in the middle 
Syntax: ArrayList<String> list = new ArrayList<>();

Example
import java.util.*;
public class Demo
{
    public static void main(String args[])
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits);
        System.out.println(fruits.get(1));
    }
}
Output
[Apple, Mango, Orange]
Mango

Common ArrayList Methods
Method	Description
add()	Adds an element
get()	Retrieves an element
set()	Updates an element
remove()	Removes an element
size()	Returns number of elements
contains()	Checks if an element exists
clear()	Removes all elements

Applications of ArrayList
•	Student records 
•	Shopping carts 
•	Product catalogs 
•	Customer lists 
•	Employee records 

5.4 LinkedList
A LinkedList is a collection that stores elements as a sequence of nodes, where each node contains data and a reference to the next node. Unlike ArrayList, elements are not stored in contiguous memory locations.
Features of LinkedList
•	Dynamic memory allocation 
•	Fast insertion and deletion 
•	Maintains insertion order 
•	Allows duplicates 
•	Indexed access 
•	Slower random access compared to ArrayList 

Example
import java.util.*;
public class Demo
{
    public static void main(String args[])
    {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        System.out.println(cities);
        cities.removeFirst();
        System.out.println(cities);
    }
}
Output
[Delhi, Mumbai, Bangalore]
[Mumbai, Bangalore]

ArrayList vs LinkedList
Feature	ArrayList	LinkedList
Internal Structure	Dynamic Array	Doubly Linked List
Access Speed	Fast	Slower
Insertion/Deletion	Slower in middle	Faster
Memory Usage	Lower	Higher
Best For	Frequent searching	Frequent insertion/deletion

5.5 Set Interface
A Set is a collection that stores unique elements and does not allow duplicates.
Characteristics of Set
•	No duplicate elements 
•	Unordered (HashSet) 
•	Dynamic size 
•	Allows one null value (HashSet) 
•	Fast searching 

5.6 HashSet
A HashSet is an implementation of the Set interface that stores unique elements using a hash table.
Features of HashSet
•	No duplicates 
•	Unordered 
•	Fast insertion 
•	Fast searching 
•	Allows one null value 

Syntax: HashSet<String> set = new HashSet<>();
Example
import java.util.*;
public class Demo
{
    public static void main(String args[])
    {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        System.out.println(colors);
    }
}
Output
[Red, Blue, Green]
The duplicate "Red" is ignored.

Common HashSet Methods
Method	Description
add()	Adds an element
remove()	Removes an element
contains()	Checks for an element
size()	Returns number of elements
clear()	Removes all elements

5.7 Map Interface
A Map stores data as key-value pairs, where each key is unique and maps to a corresponding value. Unlike Collection, Map is a separate interface.
Characteristics of Map
•	Stores key-value pairs 
•	Keys are unique 
•	Values may be duplicated 
•	Fast searching using keys 
•	Dynamic size 

5.8 HashMap
A HashMap is an implementation of the Map interface that stores data using a hash table.
Features of HashMap
•	Unique keys 
•	Duplicate values allowed 
•	Unordered 
•	Fast retrieval 
•	Allows one null key 
•	Allows multiple null values 
Syntax:HashMap<Integer,String> map = new HashMap<>();

Example
import java.util.*;
public class Demo
{
    public static void main(String args[])
    {
        HashMap<Integer,String> students = new HashMap<>();
        students.put(101,"Rahul");
        students.put(102,"Anita");
        students.put(103,"Vikram");
        System.out.println(students);
        System.out.println(students.get(102));
    }
}
Output
{101=Rahul, 102=Anita, 103=Vikram}
Anita

Common HashMap Methods
Method	Description
put()	Inserts key-value pair
get()	Retrieves value using key
remove()	Removes an entry
containsKey()	Checks for a key
containsValue()	Checks for a value
keySet()	Returns all keys
values()	Returns all values
size()	Number of entries
clear()	Removes all entries

Real-Life Applications
Collection	Applications
ArrayList	Shopping carts, playlists, student lists
LinkedList	Browser history, music playlist navigation, task queues
HashSet	Usernames, email IDs, unique product codes
HashMap	Employee ID → Employee Details, Roll Number → Student Name, Product ID → Price
5.8 What is Iteration?
Iteration is the process of repeatedly accessing each element of a collection, array, or group of objects to perform specific operations. Iteration allows programmers to:
•	Display data 
•	Search elements 
•	Modify values 
•	Calculate totals 
•	Apply conditions 

Why Iteration?
Suppose an ArrayList contains 10,000 student names. Without iteration: Each element must be accessed individually. With iteration: A loop automatically visits every element. Iteration reduces code duplication and simplifies data processing.
1. Traditional for Loop - The traditional for loop is commonly used with arrays and indexed collections such as ArrayList.
Syntax
for(int i=0; i<list.size(); i++)
{
    System.out.println(list.get(i));
}

Example
import java.util.*;
public class Demo
{
    public static void main(String args[])
    {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        for(int i=0;i<cities.size();i++)
        {
            System.out.println(cities.get(i));
        }
    }
}
Output
Delhi
Mumbai
Bangalore
2. Enhanced for Loop (For-Each Loop) - Used for arrays and collections.
Syntax
for(DataType variable : collection)
{
}

Example
import java.util.*;
public class Demo
{
    public static void main(String args[])
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}
Output
Apple
Orange
Mango
3. Iterator - An Iterator is an interface used to traverse collections one element at a time.
It works with:
•	ArrayList 
•	LinkedList 
•	HashSet 
Methods
Method	Description
hasNext()	Checks for next element
next()	Returns next element
remove()	Removes current element

Example
import java.util.*;
public class Demo
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
4. ListIterator - A ListIterator is used specifically with List implementations.
Additional features:
•	Forward traversal 
•	Backward traversal 
•	Add elements 
•	Update elements 

Example
ListIterator<String> itr = list.listIterator();
while(itr.hasNext())
{
    System.out.println(itr.next());
}

Comparison of Iteration Techniques
Technique	Works With	Index Available	Forward	Backward
for Loop	Arrays, ArrayList	Yes	Yes	No
Enhanced for	Arrays, Collections	No	Yes	No
Iterator	Collections	No	Yes	No
ListIterator	List	No	Yes	Yes

Applications
•	Student records 
•	Employee databases 
•	Product lists 
•	Customer management 
•	Banking systems 

5.9 Sorting in Java
Sorting is the process of arranging data in a particular order.
Usually:
•	Ascending 
•	Descending 

Real-Life Example
School results are arranged:
•	Highest marks 
•	Alphabetical names 
•	Roll numbers 
Collections.sort() - Java provides the Collections class. Collections.sort(collection);

Example
import java.util.*;
public class Demo
{
    public static void main(String args[])
    {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(45);
        marks.add(92);
        marks.add(60);
        Collections.sort(marks);
        System.out.println(marks);
    }
}
Output: [45, 60, 78, 92]

Descending Order - Collections.sort(list, Collections.reverseOrder());
Example: Collections.sort(marks, Collections.reverseOrder()); Output: [92,78,60,45]
Sorting Strings: 
ArrayList<String> names = new ArrayList<>();
names.add("Riya");
names.add("Ankit");
names.add("Rahul");
Collections.sort(names);
Output: [Ankit, Rahul, Riya]

5.10 Strings in Java
A String is a sequence of characters enclosed within double quotation marks. Example: String name = "Java";
Characteristics of Strings
•	Immutable 
•	Stored as objects 
•	Supports many built-in methods 
•	Unicode supported 

String Creation
Method 1 - String city = "Delhi";
Method 2 - String city = new String("Delhi");

String Pool - Java stores string literals inside a special memory area called the String Constant Pool (SCP). Advantages
•	Saves memory 
•	Improves performance 

5.11 Common String Operations
•	length() - Returns total characters.
String s="Programming";
System.out.println(s.length());
Output: 11
•	charAt() - Returns a character.
String s="Java";
System.out.println(s.charAt(2));
Output: v
•	toUpperCase()
String s="java";
System.out.println(s.toUpperCase());
Output
JAVA
•	toLowerCase() 
String s="JAVA";
System.out.println(s.toLowerCase());
Output: java
•	equals() - Checks content equality.
String s1="Java";
String s2="Java";
System.out.println(s1.equals(s2));
Output: true
•	equalsIgnoreCase() - Ignores case.
System.out.println("JAVA".equalsIgnoreCase("java"));
Output: true
•	compareTo() - Compares alphabetically.
System.out.println("Apple".compareTo("Banana"));
Returns:
Negative 
Positive 
Zero 
•	contains() - String s="Programming";
System.out.println(s.contains("gram"));
Output: true
•	substring() - Extracts part of a string.
String s="Programming";
System.out.println(s.substring(3,7));
Output: gram
•	replace() - String s="Java";
System.out.println(s.replace('a','o'));
Output: Jovo
•	trim() - Removes extra spaces.
String s=" Java ";
System.out.println(s.trim());
Output: Java
•	startsWith() - System.out.println("Programming".startsWith("Pro"));
Output: true
•	endsWith() - System.out.println("Programming".endsWith("ing"));
Output: true
•	indexOf() - Returns position.
String s="Programming";
System.out.println(s.indexOf("g"));
Output: 3
•	split() - Splits text.
String s="Java,Python,C++";
String arr[]=s.split(",");
•	isEmpty() - Checks empty string.
String s="";
System.out.println(s.isEmpty());
Output: true

•	String Concatenation - Using +
String first="Java";
String second="Programming";
System.out.println(first+" "+second);
Output
Java Programming
Using concat()
String s1="Java";
String s2=" Programming";
System.out.println(s1.concat(s2));
•	StringBuilder - StringBuilder is a mutable class used for modifying strings efficiently.
Example: 
StringBuilder sb = new StringBuilder("Java");
sb.append(" Programming");
System.out.println(sb);
Output: Java Programming

String vs StringBuilder
String	StringBuilder
Immutable	Mutable
Slower for modifications	Faster
Thread-safe	Not thread-safe
More memory usage	Less memory usage

Commonly Used String Methods
Method	Purpose
length()	Length
charAt()	Character
substring()	Extract
contains()	Search
replace()	Replace
trim()	Remove spaces
equals()	Compare
compareTo()	Alphabetical comparison
split()	Divide string
toUpperCase()	Uppercase
toLowerCase()	Lowercase



Conclusion
Built a strong foundation in Java programming by learning Java fundamentals, program structure, data types, operators, input/output, and the Java execution process. Developed problem-solving skills through the effective use of control flow statements, loops, conditional statements, and functions to implement logical solutions. Applied Object-Oriented Programming (OOP) principles such as encapsulation, inheritance, polymorphism, and abstraction to design modular, reusable, and scalable applications. Enhanced application reliability by implementing exception handling techniques and writing robust programs capable of managing runtime errors efficiently. Learned to manage and process data efficiently using the Java Collections Framework, including Lists, Sets, Maps, iteration techniques, sorting, and string manipulation, providing a strong foundation for advanced Java and enterprise application development.



References
•	https://docs.oracle.com/javase/tutorial/
•	https://www.w3schools.com/java/
•	https://docs.oracle.com/javase/tutorial/java/nutsandbolts/
•	https://www.geeksforgeeks.org/java/java/
•	https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html
•	https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flowsummary.html
•	https://www.w3schools.com/java/java_methods.asp
•	https://www.geeksforgeeks.org/java-decision-making-javaif-else-switch-break-continue-jump/
•	https://docs.oracle.com/javase/tutorial/java/
•	https://www.coursera.org/learn/oracle-java-foundations
•	https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/
•	https://www.w3schools.com/java/java_oop.asp
•	https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
•	https://docs.oracle.com/javase/tutorial/essential/exceptions/handling.html
•	https://dev.java/learn/exceptions/
•	https://docs.oracle.com/en/java/javase/23/core/java-collections-framework.html
•	https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html




