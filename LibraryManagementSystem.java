package javathings;

//Interface
interface Printable {
 void print();
}

//Abstract Class
abstract class Shape {
 abstract void draw();
}

//Circle Class
class Circle extends Shape {
 public void draw() {
     System.out.println("Drawing Circle");
 }
}

//Rectangle Class
class Rectangle extends Shape {
 public void draw() {
     System.out.println("Drawing Rectangle");
 }
}

//Report Class implementing Interface
class Report implements Printable {
 public void print() {
     System.out.println("Printing Library Report");
 }
}

//Part A & B: Book Class
class Book {

 // Encapsulation
 private int bookId;
 private String bookName;
 private String author;
 private double price;

 // Default Constructor
 Book() {
     bookId = 0;
     bookName = "Unknown";
     author = "Unknown";
     price = 0.0;
 }

 // Parameterized Constructor
 Book(int bookId, String bookName, String author, double price) {
     this.bookId = bookId;
     this.bookName = bookName;
     this.author = author;
     this.price = price;
 }

 // Getters
 public int getBookId() {
     return bookId;
 }

 public String getBookName() {
     return bookName;
 }

 public String getAuthor() {
     return author;
 }

 public double getPrice() {
     return price;
 }

 // Setters
 public void setBookId(int bookId) {
     this.bookId = bookId;
 }

 public void setBookName(String bookName) {
     this.bookName = bookName;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 void displayBook() {
     System.out.println("Book ID    : " + bookId);
     System.out.println("Book Name  : " + bookName);
     System.out.println("Author     : " + author);
     System.out.println("Price      : " + price);
 }
}

//Part C: Inheritance
class Person {
 String name;
 int age;

 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
}

class Student extends Person {

 int rollNo;

 Student(String name, int age, int rollNo) {
     super(name, age);
     this.rollNo = rollNo;
 }

 void display() {
     System.out.println("Student Name : " + name);
     System.out.println("Age          : " + age);
     System.out.println("Roll No      : " + rollNo);
 }
}

class Faculty extends Person {

 String department;

 Faculty(String name, int age, String department) {
     super(name, age);
     this.department = department;
 }

 void display() {
     System.out.println("Faculty Name : " + name);
     System.out.println("Age          : " + age);
     System.out.println("Department   : " + department);
 }
}

//Part D: Method Overloading
class Area {

 double calculateArea(double radius) {
     return 3.14 * radius * radius;
 }

 double calculateArea(double length, double breadth) {
     return length * breadth;
 }
}

//Method Overriding
class Vehicle {
 void display() {
     System.out.println("This is a Vehicle");
 }
}

class Car extends Vehicle {
 void display() {
     System.out.println("This is a Car");
 }
}

class Bike extends Vehicle {
 void display() {
     System.out.println("This is a Bike");
 }
}

//Main Class
public class LibraryManagementSystem {

 public static void main(String[] args) {

     System.out.println("===== PART A & B =====");

     Book b1 = new Book();

     b1.setBookId(101);
     b1.setBookName("Java Programming");
     b1.setAuthor("James Gosling");
     b1.setPrice(550);

     b1.displayBook();

     System.out.println();

     Book b2 = new Book(102,
             "Data Structures",
             "Seymour Lipschutz",
             650);

     b2.displayBook();

     System.out.println("\n===== PART C =====");

     Student s1 = new Student(
             "Gayatri",
             18,
             25);

     Faculty f1 = new Faculty(
             "Ramesh",
             40,
             "Computer Science");

     s1.display();
     System.out.println();
     f1.display();

     System.out.println("\n===== PART D =====");

     Area obj = new Area();

     System.out.println("Area of Circle = "
             + obj.calculateArea(5));

     System.out.println("Area of Rectangle = "
             + obj.calculateArea(10, 20));

     Vehicle v;

     v = new Car();
     v.display();

     v = new Bike();
     v.display();

     System.out.println("\n===== PART E =====");

     Shape c = new Circle();
     Shape r = new Rectangle();

     c.draw();
     r.draw();

     Printable report = new Report();
     report.print();
 }
}
