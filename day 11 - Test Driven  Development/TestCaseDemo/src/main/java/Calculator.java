public class Calculator {
    public double addition(double a,double b){
        return a+b;

    }

    public double substraction(double a,double b){
        return a-b;
    }

    public double division(double a, double b){
        if(b==0){throw new ArithmeticException("b value cant be 0 ");}
        return a/b;
    }
    public double mulitiplication(double a,double b){
        return a*b;
    }
}