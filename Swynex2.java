import java.util.ArrayList;
import java.util.Scanner;

public class Swynex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Details> members = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Student");
            System.out.println("3. Add Staff");
            System.out.println("4. View Books");
            System.out.println("5. View Members");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    books.add(new Book(id, name, author));
                    System.out.println("Book added.");
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String studentName = sc.nextLine();
                    members.add(new Student(studentId, studentName));
                    System.out.println("Student added.");
                    break;

                case 3:
                    System.out.print("Enter Staff ID: ");
                    int staffId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Staff Name: ");
                    String staffName = sc.nextLine();
                    members.add(new Staff(staffId, staffName));
                    System.out.println("Staff added.");
                    break;

                case 4:
                    for (Book b : books)
                        b.information();
                    break;

                case 5:
                    for (Details d : members)
                        d.displayDetails();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}
class Book {
    private int id;
    private String name;
    private String author;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    void information() {
        System.out.println("Book ID: " + id + ", Name: " + name + ", Author: " + author);
    }
}
abstract class Details {
    private int no;
    private String name;

    Details(int no, String name) {
        this.no = no;
        this.name = name;
    }

    protected int getNo() {
        return no;
    }

    protected String getName() {
        return name;
    }

    abstract void displayDetails();
}
class Student extends Details {
    Student(int no, String name) {
        super(no, name);
    }
    void displayDetails() {
        System.out.println("Student ID: " + getNo() + ", Name: " + getName());
    }
}
class Staff extends Details {
    Staff(int no, String name) {
        super(no, name);
    }
    void displayDetails() {
        System.out.println("Staff ID: " + getNo() + ", Name: " + getName());
    }
}
