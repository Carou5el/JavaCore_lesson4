package kuklov.JavaCore.Lesson4;

public class Employee {
    public String name;
    public String name2;
    public String surname;
    public int age;
    public String title;
    public int phoneNumber;
    public String email;
    public int salary;

    Employee(String name, String name2, String surname, int age, String title, int phoneNumber, String email, int salary )  {
        this.name = name;
        this.name2 = name2;
        this.surname = surname;
        this.age = age;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
    }

    public void showInfo()  {
        System.out.printf("==========================================================\n");
        System.out.printf("Name, age: %s %s %s %d\n", name, name2, surname, age);
        System.out.printf("Title:\t%s\n", title);
        System.out.printf("Email, phone: %s\t %d \n", email, phoneNumber);
        System.out.printf("Salary: %d\n", salary);
    }
}
