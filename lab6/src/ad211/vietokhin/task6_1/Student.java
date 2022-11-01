package ad211.vietokhin.task6_1;

public class Student extends Person {
    int groupNumber;
    int ticketNumber;

    public Student( int groupNumber, String name, int age, int ticketNumber) {
        super(name, age);
        this.groupNumber = groupNumber;
        this.ticketNumber = ticketNumber;
    }
    /*
    public int getGroupNumber() {
        return groupNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    */

    @Override
    public void printInfo() {
        System.out.println("Student of group: " + groupNumber + "; Name: " + name + "; Age: " + age + "; Student ticket number: " + ticketNumber);
    }
}
