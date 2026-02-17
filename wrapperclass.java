import java.util.Scanner;

class wrapperclass{
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int a= sc.nextInt();
        Integer b=a;//autoboxing
        Integer c=10;//unboxing
        int d=c;
        System.out.println("the value of a is: "+a);
        System.out.println("the value of b is wrapper class: "+b);
        System.out.println("the value of c is wrapper class: "+c);
        System.out.println("the value of d is: "+d);
        sc.close();
    }
}

class wrapperclass2{
    public static void main(String[] args) {
        String a= "10";
        int b=Integer.parseInt(a);
        System.out.println("the value of a is: "+a);
        System.out.println("the value of b is: "+b);
        System.out.println(a+b);
    }
}


