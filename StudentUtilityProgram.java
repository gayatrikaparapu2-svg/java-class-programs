package javathings;

import java.util.Scanner;

public class StudentUtilityProgram {

    // Method to find factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check prime number
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Method to find maximum of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Method to calculate area of circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Part A: Student Information
        System.out.println("===== STUDENT INFORMATION =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("\nStudent Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage);

        // part B,C & D     
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Check Even or Odd");
            System.out.println("2. Largest of Three Numbers");
            System.out.println("3. Display Grade");
            System.out.println("4. Display Day of Week");
            System.out.println("5. Multiplication Table");
            System.out.println("6. Numbers from 1 to N");
            System.out.println("7. Sum of First N Natural Numbers");
            System.out.println("8. Fibonacci Series");
            System.out.println("9. Methods Demo");
            System.out.println("10. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();

                    if (num % 2 == 0)
                        System.out.println("Even Number");
                    else
                        System.out.println("Odd Number");
                    break;

                case 2:
                    System.out.print("Enter three numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();

                    int largest = a;

                    if (b > largest)
                        largest = b;

                    if (c > largest)
                        largest = c;

                    System.out.println("Largest Number = " + largest);
                    break;

                case 3:
                    if (percentage >= 90)
                        System.out.println("Grade A");
                    else if (percentage >= 75)
                        System.out.println("Grade B");
                    else if (percentage >= 60)
                        System.out.println("Grade C");
                    else if (percentage >= 40)
                        System.out.println("Grade D");
                    else
                        System.out.println("Fail");
                    break;

                case 4:
                    System.out.print("Enter Day Number (1-7): ");
                    int day = sc.nextInt();

                    switch (day) {
                        case 1:
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                        case 7:
                            System.out.println("Sunday");
                            break;
                        default:
                            System.out.println("Invalid Day");
                    }
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    int table = sc.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(table + " x " + i + " = " + (table * i));
                    }
                    break;

                case 6:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();

                    for (int i = 1; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 7:
                    System.out.print("Enter N: ");
                    int numN = sc.nextInt();

                    int sum = 0;

                    for (int i = 1; i <= numN; i++) {
                        sum += i;
                    }

                    System.out.println("Sum = " + sum);
                    break;

                case 8:
                    System.out.print("Enter number of terms: ");
                    int terms = sc.nextInt();

                    int first = 0, second = 1;

                    System.out.print("Fibonacci Series: ");

                    for (int i = 1; i <= terms; i++) {
                        System.out.print(first + " ");

                        int next = first + second;
                        first = second;
                        second = next;
                    }
                    System.out.println();
                    break;

                case 9:

                    System.out.print("Enter number for factorial: ");
                    int factNum = sc.nextInt();
                    System.out.println("Factorial = " + factorial(factNum));

                    System.out.print("Enter number to check prime: ");
                    int primeNum = sc.nextInt();

                    if (isPrime(primeNum))
                        System.out.println("Prime Number");
                    else
                        System.out.println("Not Prime");

                    System.out.print("Enter two numbers: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    System.out.println("Maximum = " + max(x, y));

                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();

                    System.out.println("Area of Circle = " + areaOfCircle(radius));
                    break;

                case 10:
                    System.out.println("Program Exited Successfully.");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } while (choice != 10);

        sc.close();
    }
}