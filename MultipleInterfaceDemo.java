interface InterfaceA {
    void eat();
}

interface InterfaceB {
    void dance();
}

// Class C implementing multiple interfaces
class C implements InterfaceA, InterfaceB {
    @Override
    public void eat() {
        System.out.println("C can eat");
    }

    @Override
    public void dance() {
        System.out.println("C can dance");
    }
}

public class MultipleInterfaceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.eat();
        obj.dance();
    }
}