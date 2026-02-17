import java.lang.System;
import java.util.Scanner;

class user_input {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.println("the value of f is: " + f);
        sc.close();
    }

}

class user_input2 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("the value of i is: " + i);
        sc.close();
    }

}

class user_input3 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("the value of s is: " + s);
        sc.close();
    }

}

class addition {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum is: " + sum);
        sc.close();
    }

}
