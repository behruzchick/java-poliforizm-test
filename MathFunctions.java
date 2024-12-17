public class MathFunctions {
    public void math(int a , int b){
        System.out.println(a + b);
    }
    public void math(short a , double b){
        System.out.println(a - b);
    }

    public void math(int a , double b){
        System.out.println(a * b);
    }

    public void math (double a , int b){
        System.out.println(a / b);
    }


    public void math(int a){
        System.out.println(a < 0 ? -a : a);
    }


    public void math(double b , double a){
        System.out.println(Math.pow(a,b));
    }

    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions();
        mathFunctions.math(2,4);
        mathFunctions.math((short) 2 ,2.4);
        mathFunctions.math(2,4.3);
        mathFunctions.math(2.3,4);
        mathFunctions.math(2);
        mathFunctions.math(2.2,4.3);
//        mathFunctions.math(2.3,4.4);
    }
}
