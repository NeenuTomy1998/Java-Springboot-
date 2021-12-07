public class Rectangle {
    public double area(double length, double breadth) {

        if (length <= 0 || breadth <= 0 ) {
            throw new ArithmeticException("Length and Breadth can't be negative number");

        }
        return  length * breadth;


    }
    public double perimeter(double length,double breadth) {
        if (length <= 0 || breadth <= 0 ) {
            throw new ArithmeticException("Length and Breadth can't be negative number");

        }
        return 2*(length + breadth);
    }


    }



