class exceptionhandeling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("cant be divided by zero : \n" + e.getMessage());
        }
        System.out.println("Program continues after handling the exceptions \n");
    }
}

class exceptionhandeling2 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("String is empty : \n" + e.getMessage());
        }
        System.out.println("Program continues after handling the exceptions \n ");
    }
}

class exceptionhandeling3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of boundry : \n" + e.getMessage());
        }
        System.out.println("Program continues after handling the exceptions \n");
    }
}

class exceptionhandeling4 {
    public static void main(String[] args) {
        String str = "abc";

        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("can't convert string to number : \n" + e.getMessage());
        }
        System.out.println("Program continues after handling the exceptions \n");
    }
}

class exceptionhandeling5 {
    public static void main(String[] args) {
        
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program continues after handling the exceptions \n");
    }
}

class ExceptionThrow{
    public static void main(String[]args){
        int a=-1;
        if(a<0){
            throw new IllegalArgumentException("value cannot be negetive : "+a);
        }
        System.out.println("Value is :" +a);
    }
}

class exceptionthrow2{
    public static void main(String[]args){
        try{
            methodThatThrowsException();
        } catch (Exception e){
            System.out.println("caught an Exception :"+e.getMessage());
        }
    }

    public static void methodThatThrowsException() throws Exception{
        throw new Exception("This is a custom exception message.  ");
    }
}