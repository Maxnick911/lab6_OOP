package ad211.vietokhin.task6_2;

public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[6];
        people[0] = new Person("Nyashbox Bat`kovych", 18);
        people[1] = new Person("Mykyta Bat`kovych", 21);
        people[2] = new Student(211, "Dmytro Vietokhin", 18, 228);
        people[3] = new Student(211, "Pavlo Voynikov", 18, 229);
        people[4] = new Lecturer("ICS", "Mykola Dmytrovych", 35, 10000);
        people[5] = new Lecturer("ICS", "Natalia Olegivna", 34, 12000);

        for (Person person : people) {
            printInfo(person);
        }
    }
    public static void printInfo(Person p) {
        p.printInfo();
    }
}