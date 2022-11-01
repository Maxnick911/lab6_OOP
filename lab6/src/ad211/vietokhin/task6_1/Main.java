package ad211.vietokhin.task6_1;

public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[4];
        people[0] = new Student(211, "Dmytro Vietokhin", 18, 228);
        people[1] = new Student(211, "Pavlo Voynikov", 18, 229);
        people[2] = new Lecturer("ICS", "Mykola Dmytrovych", 35, 10000);
        people[3] = new Lecturer("ICS", "Natalia Olegivna", 34, 12000);

        for (Person person : people) {
            printInfo(person);
        }
    }
    public static void printInfo(Person p) {
        p.printInfo();
    }
}