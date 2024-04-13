import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public
class Main {

    public static void main(String[] args) {
        ArrayList<Person> employees = new ArrayList<>();

        Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
        Technology t = Technology.JAVA;
        dev.addTechnology(t);
        employees.add(dev);

        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", 2021);
        tester.addTest(Test.UI_UX);
        employees.add(tester);

        Manager manager = new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", "1122334455", 2019);
        Goal g=new Goal("JAKIS GOAL", new Date(2024, Calendar.MAY, 12), 900);
        manager.addGoal(g);
        employees.add(manager);

        int totalAmount = 0;
        for (Person employee : employees) {
            totalAmount += employee.salary();
        }
        System.out.println("Total amount to be paid this month: " + totalAmount + " USD");
    }

}