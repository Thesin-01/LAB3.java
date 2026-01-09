class Apple {
    void show() {
        System.out.println("This is Apple class");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Apple a;

        a = new Apple();
        a.show();

        a = new Banana();
        a.show();

        a = new Cherry();
        a.show();
    }
}

