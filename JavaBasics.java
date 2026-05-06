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