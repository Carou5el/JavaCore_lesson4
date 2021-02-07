package kuklov.JavaCore.Lesson4;

public class Employee {
    public String name;
    public String name2;
    public String surname;
    public int age;
    public String title;
    public int phoneNumber;
    public String email;
    public double salary;

    Employee(String name, String name2, String surname, int age, String title, int phoneNumber, String email, double salary )  {
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
        System.out.printf("Name, age: \s \s \s \f \n", name, name2, surname, age);
        System.out.printf("Title: \s\n", title);
        System.out.printf("Email, phone: \s\t \f \n", email, phoneNumber);
        System.out.printf("Salary: \f\n", salary);
    }
}
