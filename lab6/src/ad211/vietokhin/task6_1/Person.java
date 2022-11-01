package ad211.vietokhin.task6_1;

import ad211.vietokhin.task6_2.Interface;

public abstract class Person{
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

    public abstract void printInfo();

}