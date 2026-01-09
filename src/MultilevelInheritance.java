import java.util.Scanner;

class Plate {
    int length, width;

    Plate(int l, int w) {
        length = l;
        width = w;
    }
}

class Box extends Plate {
    int height;

    Box(int l, int w, int h) {
        super(l, w);
        height = h;
    }
}

class WoodBox extends Box {
    int thick;

    WoodBox(int l, int w, int h, int t) {
        super(l, w, h);
        thick = t;
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Thickness: " + thick);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length, width, height, thickness: ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();

        WoodBox wb = new WoodBox(l, w, h, t);
        wb.display();
    }
}

