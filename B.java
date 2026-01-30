class Super1 {
    int a, b, c;

    Super1() {
        a = 10;
        b = 20;
    }

    void sum() {
        c = a + b;
        System.out.println("Sum (Super): " + c);
    }
}

class Sub extends Super1 {
    int a1, b1, c1;

    @Override
    void sum() {
        super.sum();   // call parent method first

        a1 = 10;
        b1 = 20;
        c1 = b1 - a;
        System.out.println("Subtraction (Sub): " + c1);
    }
}

public class B {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.sum();
    }
}
