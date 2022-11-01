package ad211.vietokhin.task6_2;

public class Person implements Interface {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*
    public String getName() {return name;}

    public int getAge() {return age;}

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}
    */

    @Override
    public void printInfo() {System.out.println("Name: " + name + "; Age: " + age);}

}