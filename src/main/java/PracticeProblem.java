import java.util.Scanner;
public class PracticeProblem {


   public static void main(String args[]) {
       q1();
       q2();
       q3();
       q4();
       q5();
   }


   public static void q1() {
       //Write question 1 code here
       Scanner input = new Scanner(System.in);


       String name;
       System.out.print("What is your name: ");
       name = input.nextLine();
       System.out.println(name);


   }


   public static void q2() {
       //Write question 2 code here
       Scanner input = new Scanner(System.in);
       int whole;
       System.out.print("Input a whole number: ");
       whole = input.nextInt();
       whole = ((whole * 2) + 2);
       System.out.println(whole);
   }


   public static void q3() {
       //Write question 3 code here
       double rad;
       double circ;
       double pi;
       Scanner input = new Scanner(System.in);
       System.out.print("Input a radius: ");
       rad = input.nextDouble();
       pi = 3.14 * rad * rad;
       circ = 2 * 3.14 * rad;
       System.out.println(circ);
       System.out.println(pi);
   }


   public static void q4() {
       //Write question 4 code here
       Scanner input = new Scanner(System.in);
      
       String fname;
       String lname;
       Integer age;
       System.out.print("Input a first name: ");
       fname = input.nextLine();
       System.out.print("Input a last name: ");
       lname = input.nextLine();
       System.out.print("Input an age: ");
       age = input.nextInt();


       System.out.println(lname + "," + " " + fname + " - " + age);
   }


   public static void q5() {
       //Write question 5 code here
       Scanner input = new Scanner(System.in);


       String name;
       Integer age;
       System.out.print("Input a name: ");
       name = input.nextLine();
       System.out.print("Input an age: ");
       age = input.nextInt();
       int iq = age;
       age = age + 3;
      
       System.out.print(name);
       System.out.print(age);
       System.out.println();
       System.out.println(iq);
   }
}