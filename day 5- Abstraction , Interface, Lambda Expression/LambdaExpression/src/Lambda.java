package Java;
interface Addition{
    int add(int num1,int num2);
}
interface Subtract{
    int sub(int num1,int num2);
}
interface Multiplication{
    int multiply(int num1,int num2);
}
//
class Main{
    public static void main(String[] args) {
        Addition addition=(int num1,int num2) ->{return (num1+num2);};
        Subtract subtract=(int num1,int num2) ->{return (num1-num2);};
        Multiplication multiplication=(int num1,int num2) ->{return (num1*num2);};
        System.out.print("Addition :  ");
        System.out.println(addition.add(10,2));
        System.out.print("Subtraction :  ");
        System.out.println(subtract.sub(250,50));
        System.out.print("Multiplication :  ");
        System.out.println(multiplication.multiply(10,10));


    }
}
