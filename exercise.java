import java.lang.System;

class exercise {
    public static void main(String[] args) {
       String name = "Jeethendra";
       int age = 20;
       float height = 5.8f;
       double weight = 63.0;
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Height: " + height);
       System.out.println("Weight: " + weight);
    }
    
}

// 2 interger variables a=15 b=25 print their sum, difference, product, quotient & division
class exercise2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Division: " + (double)a / b);
    }
}