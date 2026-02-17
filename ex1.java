public class ex1 {
    void hello() {
        System.out.println("Hello");
    }

    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        ex1 obj = new ex1();
        obj.hello();
        obj.add(10, 20);
    }
}

class ex3 {
    int getnumber() {
        return 10;
    }

    public static void main(String[] args) {
        ex3 obj = new ex3();
        int result = obj.getnumber();
        System.out.println("The number is: " + result);
    }
}

class ex5 {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }
    public static void main(String[] args) {

        ex5.staticMethod();

        ex5 obj = new ex5();
        obj.instanceMethod();
    }
}



