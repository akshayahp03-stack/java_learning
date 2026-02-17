import java.util.Scanner;

class type_casting{
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int a= sc.nextInt();
        float b=a;
        System.out.println("the value of a is: "+a);
        System.out.println("the value of b is: "+b);
        sc.close();
    }
  
}

class type_casting2{
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        float a= sc.nextFloat();
        int b=(int)a;
        System.out.println("the value of a is: "+a);
        System.out.println("the value of b is: "+b);
        sc.close();
    }
  
}