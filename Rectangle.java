// Java Program to find Perimeter and Area of Rectangle using Class, Object, and Method
class Rectangle {
    int length;
    int breadth;

    void setDimensions(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }
}

public class Main{
    public static void main(String args[]) {
        Rectangle rect = new Rectangle();

        rect.setDimensions(10, 5);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Perimeter of Rectangle: " + rect.perimeter());
    }
}
