import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private String addr;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character from the buffer
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Address: ");
        addr = scanner.nextLine();
    }

    public void sayHello() {
        System.out.println("I am " + name + ". Hello everybody!!!");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.input();
        person2.input();

        person1.sayHello();
        person2.sayHello();
    }
}
