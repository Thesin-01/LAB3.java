import java.util.Scanner;

class Plastic {
    double cost;

    void calculate2D(double area) {
        cost = area * 40;
        System.out.println("Cost of 2D plastic sheet: Rs " + cost);
    }

    void calculate3D(double volume) {
        cost = volume * 60;
        System.out.println("Cost of 3D plastic box: Rs " + cost);
    }
}

class PlasticDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plastic p = new Plastic();

        System.out.print("Enter length and breadth for 2D sheet: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        p.calculate2D(l * b);

        System.out.print("Enter length, breadth and height for 3D box: ");
        double h = sc.nextDouble();
        p.calculate3D(l * b * h);
    }
}

