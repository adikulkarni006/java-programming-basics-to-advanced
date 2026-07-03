// ========================================
// *BOILERPLATE CODE IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out .println("DEAR god!!");           //*ln = new line*
//         System.out .println("DEAR adi!!");           //*ln = new line*
//     }
// }

// ========================================
// *PRINT A PATTERN IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out .println("****");
//         System.out .println("***");
//         System.out .println("**");
//         System.out .println("*");
//     }
// }

// ========================================
// *VARIABLES IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 20;
//         int sum = a + b;
//         System.out.println("Sum: " + sum);
//     }
// }

// ========================================
// *PRIMITIVE DATA TYPES IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void main(String args[]) {
//         byte b = 8;
//         system.out.println(b);
//         char ch = 'a';
//         system.out.println(ch);
//         boolean var = true;
//         system.out.println(var);
//         float price = 10.5;
//         system.out.println(price);
//         int number = 100;
//         system.out.println(number);
//         //long
//         //double
//         short n = 1000;
//         system.out.println(n);
//     }
// }

// ========================================
// *INPUT IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // String input = sc.next();
//         // System.out.println(input);

//         // int number = sc.nextInt();
//         // System.out.println(number);

//         // String name = sc.nextLine();
//         // System.out.println(name);

//         float price = sc.nextFloat();
//         System.out.println(price);

//     }
// }

// ========================================
// *OUTPUT IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         // int sum = a + b;
//         int product = a * b;
//         System.out.println(product);
//     }
// }

// ========================================
// *AREA OF CIRCLE IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         float radius = sc.nextFloat();
//         float area = 3.14f * radius * radius;
//         System.out.println(area);
//     }
// }

// ========================================
// *BINARY OPERATORS IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 20;
//         System.out.println("SUM = " + (a + b));
//         System.out.println("DIFFERENCE = " + (a - b));
//         System.out.println("PRODUCT = " + (a * b));
//         System.out.println("QUOTIENT = " + (a / b));
//         System.out.println("REMAINDER = " + (a % b));
//     }
// }

// ========================================
// *UNARY OPERATORS IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         // int a = 10;
//         // int b = ++a; // pre-increment
//         // System.out.println(a); // 11
//         // System.out.println(b); // 11

//         int a = 10;
//         int b = a++; // post-increment
//         System.out.println(a); // 11
//         System.out.println(b); // 10
//     }
// }

// ========================================
// *ASSIGNMENT OPERATORS IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int A = 10;
//         // A = A + 10;  //THIS STATEMENT ARE LITTLE BIT FASTER!
//         A += 10;

//         int B = 5;
//         // B = B - 5;
//         B -= 5;

//         int C  = 2;
//         // C = C * 2;
//         C *= 2;

//         int D = 20;
//         // D = D / 20;
//         D /= 20;

//         System.out.println(A);
//         System.out.println(B);
//         System.out.println(C);
//         System.out.println(D);
//     }
// }

// ========================================
// *IF ELSE STATEMENT IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int age = 14;
//         if (age >= 18) {
//             System.out.println("YOU ARE AN ADULT.");
//         }
//         if (age > 13 &&  age < 18) {
//             System.out.println("YOU ARE A TEENAGER.");
//         }
//         else {
//             System.out.println("YOU ARE NOT AN ADULT.");
//         }
//     }
// }

// ========================================
// *EVEN OR ODD NUMBER IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         if (number % 2 == 0) {
//             System.out.println("EVEN NUMBER.");
//         }
//         else {
//             System.out.println("ODD NUMBER.");
//         }
//     }
// }

// ========================================
// *ELSE IF STATEMENT IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int age = 14;
//         if (age >= 18) {
//             System.out.println("YOU ARE AN ADULT.");
//         }
//         else if (age > 13 &&  age < 18) {
//             System.out.println("YOU ARE A TEENAGER.");
//         }
//         else {
//             System.out.println("YOU ARE NOT AN ADULT.");
//         }
//     }
// }

// ========================================
// *INCOME TAX CALCULATOR IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;

//         if (income < 500000) {
//             tax = 0;
//         }
//         else if (income >= 500000 && income < 1000000) {
//             tax = (int)(0.2 * income);
//         }
//         else {
//             tax = (int)(0.3 * income);
//         }
//         System.out.println("YOUR TAX is = " + tax);
//     }
// }

// ========================================
// *TERNARY OPERATOR IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int number = 3;

//         String type = ((number%2) == 0) ? "even" : "odd";
//         System.out.println(type);
//     }
// }

// ========================================
// *STUDENT WILL PASS OR FAIL*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int marks = 33;

//         String markmemo = marks >= 33 ? "Pass" : "Fail";
//         System.out.println(markmemo);
//     }
// }

// ========================================
// *SWITCH STATEMENT IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         char ch = 'd';
//         switch (ch) {
//             case 'a':
//                 System.out.println("BMW");
//                 break;
//             case 'b':
//                 System.out.println("AUDI");
//                 break;
//             case 'c':
//                 System.out.println("MERCEDES");
//                 break;
//             case 'd':
//                 System.out.println("CRETA");
//                 break;

//         }
//     }
// }

// ========================================
// *CALCULATOR USING SWITCH STATEMENT IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a : ");
//         int a = sc.nextInt();
//         System.out.println("enter b : ");
//         int b = sc.nextInt();
//         System.out.println("enter operator : ");
//         char operator = sc.next().charAt(0);

//         switch(operator) {
//             case '+' : System.out.println(a + b);
//                         break;
//             case '-' : System.out.println(a - b);
//                         break;
//             case '*' : System.out.println(a * b);
//                         break;
//             case '/' : System.out.println(a / b);
//                         break;
//             case '%' : System.out.println(a % b);
//                         break;

//             default : System.out.println("INVALID OPERATOR.");
//         }
//     }
// }

// ========================================
// *THAT YEAR IS A LEAP YEAR OR NOT IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
// Scanner sc = new Scanner (System. in) ;
// System.out .print ("Input the year: ") ;
// int year = sc.nextInt () ;

// boolean x = (year % 4) == 0;

// boolean y = (year % 100) != 0;

// boolean z = ((year % 100 == 0) && (year % 400 == 0) );

// if (x && (y || z) ) {

// System.out .println (year + " is a leap year") ;            //*A LEAP YEAR OCCURS EVERY 4 YEARS.*

// } else {

// System.out .println (year + " is not a leap year") ;

//         }
//     }
// }

// ========================================
// *WHILE LOOP IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int counter = 0;
//         while (counter <= 100) {
//             System.out.print(counter);
//             counter++;
//         }
//         System.out.println("END");
//     }

// }

// ========================================
// *WHILE LOOP IN JAVA*
// *PRINT SQUARE PATTERN IN WHILE LOOP*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int line = 1;
//         while(line <=4) {
//             System.out.println("****");
//             line++;
//         }
//     }
// }

// ========================================
// *PRINT NUMBERS FROM 1 TO N IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int counter = 1;
//         while (counter <= n) {
//             System.out.print(counter + " ");
//             counter++;
//         }
//         System.out.println("");
//     }

// }

// ========================================
// *FOR LOOP IN JAVA*
// *PRINT SQUARE PATTERN IN FOR LOOP*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         for(int line=1; line<=4; line++) {
//             System.out.println("****");
//         }
//     }
// }

// ========================================
// *PRINT REVERSE OF A NUMBER IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int n =  16092006;

//         while (n > 0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit + " ");
//             n = n / 10;
//         }
//     }
// }

// ========================================
// *DO WHILE LOOP IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int i = 1;      //*i = counter*
//         do {
//             System.out.println("GOOD MORNING DEVELOPER!");
//             i++;
//         } while (i <= 5);
//     }
// }

// ========================================
// *BREAK KEYWORD*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.println("ENTER A NUMBER: ");
//             int number = sc.nextInt();

//             if (number % 10 == 0) {
//                 break;
//             }
//             System.out.println(number);
//         } while (true);
//     }
// }

// ========================================
// *CONTINUE STATEMENT IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         for (int i = 0; i <= 5; i++) {
//             if (i == 3) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// ========================================
// *CONTINUE KEYWORD IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.println("ENTER A NUMBER: ");
//             int number = sc.nextInt();

//             if (number % 10 == 0) {
//                 continue;
//             }
//             System.out.println("number was : " + number);
//         } while (true);
//     }
// }

// ========================================
// *CHECK IF A NUMBER IS PRIME OR NOT*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if(n == 2) {
//             System.out.println("PRIME NUMBER.");
//         }
//         else {
//             boolean isPrime = true;
//             for (int i=2; i<=Math.sqrt(n); i++) {
//                 if (n % i == 0) {       //*N IS MULTIPLE OF I (I IS EQUAL TO 1 OR N)*
//                     isPrime = false;
//                 }
//             }
//             if (isPrime == true) {
//                 System.out.println("PRIME NUMBER.");
//             }
//             else {
//                 System.out.println("NOT A PRIME NUMBER.");
//             }
//         }

//         }
//     }

// ========================================
// *STAR PATTERN IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {

//         for (int line=1; line<=7; line++) {
//             for (int star=1; star<=line; star++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

// ========================================
// *INVERTED STAR PATTERN IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int n = 7;
//         for (int line=1; line<=n; line++) {
//             for (int star=1; star<=n-line+1; star++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

// ========================================
// *HALF PYRAMID PATTERN IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int n = 7;
//         for (int line=1; line<=n; line++) {
//             for (int number=1; number<=line; number++) {
//                 System.out.print(number);
//             }
//             System.out.println("");
//         }
//     }
// }

// ========================================
// *CHARACTER PATTERN IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int n = 7;
//         char ch = 'A';

//         for (int line=1; line<=n; line++) {
//             for (int chars=1; chars<=line; chars++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println("");
//         }
//     }
// }

// ========================================
// *FUNCTIONS / METHODS IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void printHelloWorld() {
//         System.out.println("HELLO WORLD!!");
//         System.out.println("WELCOME TO JAVA PROGRAMMING!!");
//         System.out.println("HAVE A NICE DAY!!");
//     }

//     public static void main(String args[]) {
//         printHelloWorld();      //*function call*

//     }
// }

// ========================================
// *PRODUCT OF A & B IN JAVA*
// ========================================

// public class JavaBasics {
//     public static int product(int a, int b) {
//         int product = a * b;
//         return product;
//     }

//     public static void main(String args[]) {
//         int a = 10;
//         int b = 20;
//         int result = product(a, b);
//         System.out.println("PRODUCT = " + result);
//     }
// }

// ========================================
// *FUNCTION TO CALC SUM OF TWO & THREE NUMBERS IN JAVA*
// ========================================

// public static int sum(int a, int b) {
//     return a + b;
// }

// public static int sum(int a, int b, int c) {
//     return a + b + c;
// }
//     public static void main(String args[]) {
//         int result1 = sum(10, 20);
//         int result2 = sum(10, 20, 30);
//         System.out.println("SUM OF TWO NUMBERS = " + result1);
//         System.out.println("SUM OF THREE NUMBERS = " + result2);
//     }

// ========================================
// *BINARY TO DECIMAL CONVERSIONIN JAVA*
// ========================================

// public static void binaryToDecimal(int binNum) {
//     int myNum = binNum;
//     int pow = 0;
//     int decNum = 1;

//     while (binNum > 0) {
//         int lastDigit = binNum % 10;
//         decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

//         pow++;
//         binNum = binNum /10;
//     }

//     System.out.println("DECIMAL OF " +  myNum +" = " + decNum);
// }

// public static void main(String args[]) {
//     binaryToDecimal(10100);
// }

// ========================================
// *DECIMAL TO BINARY CONVERSION IN JAVA*
// ========================================

// public static void decimalToBinary(int decNum) {
//     int myNum = decNum;
//     int pow = 0;
//     int binNum = 0;

//     while (decNum > 0) {
//         int rem = decNum % 2;
//         binNum = binNum + (rem * (int)Math.pow(10, pow));

//         pow++;
//         decNum = decNum / 2;
//     }

//     System.out.println("BINARY OF " + myNum + " = " + binNum);
// }

// public static void main(String args[]) {
//     decimalToBinary(5);
// }

// ========================================
// *HOLLOW RECTANGLE PATTERN IN JAVA*
// ========================================

// public class JavaBasics {
// public static void hollow_rectangle(int toRows, int totCols) {
// //*OUTER LOOP FOR ROWS>>>>>*
//     for (int i = 1; i<= toRows; i++) {
// //*INNER LOOP FOR COLUMNS>>>>>*
//         for (int j = 1; j <= totCols; j++) {
// //*CELL (i, j)>>>>>>*
//             if (i == 1 || i == toRows || j == 1 || j == totCols) {
// //*BOUNDARY CELLS>>>>>>*
//                 System.out.print("*");
//             }
//             else {
//                 System.out.print(" ");
//             }
//         }
//         System.out.println("");
//     }
// }

// public static void main(String args[]) {
//     hollow_rectangle(4, 5);
// }
// }

// ========================================
// *INVERTED & ROATED HALF-PYRAMID PATTERN IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void inverted_half_pyramid(int n) {
// //*OUTER LOOP FOR LINES>>>>>*
//         for (int i = 1; i <= n; i++) {
// //*SPACES*
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
// //*STARS*
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }

//     public static void main(String args[]) {
//         inverted_half_pyramid(5);
//     }
// }

// ========================================
// *INVERTED HALF PYRAMID WITH NUMBERS IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void inverted_half_pyramid_with_numbers(int n) {
//         for(int i=1; i<=n; i++) {
// //*INNNER NUMBER LOOP*
//             for (int j=1; j<=n-i+1; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println("");
//         }
//     }

//         public static void main(String args[]) {
//             inverted_half_pyramid_with_numbers(5);
//         }
//     }

// ========================================
// *FLOYDS TRIANGLE PATTERN IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void floyds_triangle(int n) {
// //*OUTER*
//         int counter = 1;
//         for(int i=1; i<=n; i++) {
// //*INNER HOW MANY TIMES WILL COUNTER BE PRINTED*
//             for(int j=1; j<=i; j++) {
//             System.out.print(counter+" ");
//             counter++;
//         }
//         System.out.println();
//     }
// }

// public static void main(String args[]) {
//     floyds_triangle(10);
// }
// }

// ========================================
// *0 - 1 TRIANGLE PATTERN IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void zero_one_triangle(int n) {
//         for (int i=1; i<=n; i++) {
//             for (int j=1; j<=i; j++) {
//                 if ((i+j) % 2 == 0) {
//                     System.out.print("1 ");
//                 }
//                 else {
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         zero_one_triangle(5);
//     }
// }

// ========================================
// *BUTTERFLY PATTERN IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void butterfly_pattern(int n) {
// //*1ST HALF OF BUTTERFLY*
//         for (int i=1; i<=n; i++) {
// //*STARS - i*
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
// //*SPACES - 2*(n-i)*
//             for (int j=1; j<=2*(n-i); j++) {
//                 System.out.print(" ");
//             }
// //*STARS - i*
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// //*2ND HALF OF BUTTERFLY*
//         for (int i=n; i>=1; i--) {
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
// //*SPACES - 2*(n-i)*
//             for (int j=1; j<=2*(n-i); j++) {
//                 System.out.print(" ");
//             }
// //*STARS - i*
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         butterfly_pattern(4);
//     }
// }

// ========================================
// *SOLID RHOMBUS PATTERN IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void solid_rhombus(int n) {
//         for (int i=1; i<=n; i++) {
//             for (int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j=1; j<=n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         solid_rhombus(5);
//     }
// }

// ========================================
// *HOLLOW RHOMBUS PATTERN IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void hollow_rhombus(int n) {
//         for (int i=1; i<=n; i++) {
//             for (int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j=1; j<=n; j++) {
//                 if (i == 1 || i == n || j == 1 || j == n) {
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         hollow_rhombus(5);
//     }

// }

// ========================================
// *DIAMOND PATTERN IN JAVA*
// ========================================

// public class JavaBasics {
//     public static void diamond_pattern(int n) {
//         for (int i=1; i<=n; i++) {
//             for (int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j=1; j<=2*i-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i=n; i>=1; i--) {
//             for (int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j=1; j<=2*i-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         diamond_pattern(5);
//     }
// }

// ========================================
// *ARRAYS IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int marks[] = new int[100];

//         Scanner sc = new Scanner(System.in);

//             marks[0] = sc.nextInt();
//             marks[1] = sc.nextInt();
//             marks[2] = sc.nextInt();

//             System.out.println("phy : " + marks[0]);
//             System.out.println("chem : " + marks[1]);
//             System.out.println("maths : " + marks[2]);

//             int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//             System.out.println("percentage : " + percentage + "%");
//     }
// }

// ========================================
// *ARRAYS AS A FUNCTION ARGUMENTS IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void update(int marks[]) {
//         for (int i=0; i<marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }

//     public static void main(String args[]) {
//         int marks[] = {97, 98, 95, 100, 93};
//         update(marks);

//         //*PRINT UPDATED MARKS*
//         for (int i=0; i<marks.length; i++) {
//             System.out.print(marks[i] + " ");
//         }
//         System.out.println();
//     }

// }

// ========================================
// *LARGEST/SMALLEST NUMBER IN ARRAY IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {

//     public static int update(int number[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for (int i = 0; i < number.length; i++) {

//             if (largest < number[i]) {
//                 largest = number[i];
//             }

//             if (smallest > number[i]) {
//                 smallest = number[i];
//             }
//         }

//         System.out.println("Smallest NUMBER = " + smallest);

//         return largest;
//     }

//     public static void main(String args[]) {

//         int number[] = {10, 5, 20, 15, 8};

//         int largest = update(number);

//         System.out.println("Largest NUMBER = " + largest);
//     }
// }

// ========================================
// *PAIRS IN ARRAY IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void printPairs(int number[]) {
//         int totalPairs = 0;
//         for (int i=0; i<number.length; i++) {
//             int current = number[i];//*10, 20, 30, 40, 50*
//             for (int j=i+1; j<number.length; j++) {
//                 System.out.print("(" + current + ", " + number[j] + ") ");
//                 totalPairs++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total pairs: " + totalPairs);
//     }

//     public static void main(String args[]) {
//         int number[] = {10, 20, 30, 40, 50};
//         printPairs(number);
//     }
// }

// ========================================
// *MAX SUBARRAY SUM KADANE'S ALGORITHM IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static void kadane(int numbers[] ) {
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for (int i=0; i<numbers.length; i++) {
//             cs = cs + numbers[i];
//             if (cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(ms, cs);
//         }
//         System.out.println("our max subarray sum is: " + ms);
//     }

//     public static void main (String args[]) {
//         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         kadane(numbers);
//     }
// }

// ========================================
// *TRAPPING RAINWATER IN JAVA*
// ========================================

// import java.util.*;

// public class JavaBasics {
//     public static int trappedRainwater(int height[]) {
//         int n = height.length;
//         //*LEFT MAX BOUNDARY ARRAY*
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for (int i=1; i<n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//         }

//         //*RIGHT MAX BOUNDARY ARRAY*
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for (int i=n-2; i>=0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }

//         int trappedWater = 0;
//         //*LOOP*
//         for (int i=0; i<n; i++) {
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);
//             trappedWater += waterLevel - height[i];
//         }
//         return trappedWater;
//     }
//     public static void main(String args[]) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5};

//         System.out.println("Trapped Rainwater: " + trappedRainwater(height));
//     }
// }

// ========================================
// *BUY & SELL STOCK IN JAVA*
// ========================================

import java.util.*;

public class JavaBasics {
    public static int buyAndSellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit: " + buyAndSellStock(prices));
    }
}