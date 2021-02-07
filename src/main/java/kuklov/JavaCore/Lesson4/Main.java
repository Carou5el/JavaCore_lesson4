package kuklov.JavaCore.Lesson4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random generator = new Random();

        // Исходные данные для ген. случ.
        Employee[]  emps = new Employee[5];
        String[] names = { "Alex", "Mike", "Max", "Benny", "John" };
        String[] names2 = { "Alexandrovich", "Mikhaylovibch", "Junior", "James", "Ivanovich" };
        String[] surnames = { "Vazovsky", "Superman", "Batman", "Armstrong", "Bush" };
        String[] titles = { "Manager", "CEO", "Software engineer", "Postman", "Astronaut"};

        for (int i = 0; i < 5; i++) {

            String name     = names[generator.nextInt(5)];
            String name2    = names2[generator.nextInt(5)];
            String surname  = surnames[generator.nextInt(5)];
            int age         = generator.nextInt(50) + 18;
            int salary      = generator.nextInt(100000) + 12500;
            int phonenumber = generator.nextInt(999999) + 100000;
            String title    = titles[generator.nextInt(5)];
            String email    = name + "_the_" + title + "@company.com";

            emps[i] = new Employee(name, name2, surname, age, title, phonenumber, email, salary);
        }

        for (Employee ee : emps)    {
            if (ee.age >= 40)   {
                ee.showInfo();
            }
        }

    }

}
