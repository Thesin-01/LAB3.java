import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter account number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    void input(Scanner sc) {
        super.input(sc);
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhaar number: ");
        aadhar_no = sc.nextLine();
    }

    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhaar No: " + aadhar_no);
        System.out.println("----------------------");
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of person " + (i + 1));
            p[i] = new Person();
            p[i].input(sc);
        }

        System.out.println("\n--- Details of Persons ---");
        for (int i = 0; i < 3; i++) {
            p[i].disp();
        }
    }
}

