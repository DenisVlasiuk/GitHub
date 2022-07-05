package Part_3;

public class Persons {
    String name = "Grenor";
    int age = 32;

    public void move() {
        System.out.println("Person move");
    }

    public void talk(){
        System.out.println("Person talk");
    }

    public Persons() {
    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Persons person1 = new Persons();
        Persons person2 = new Persons ("Grenor", 35);
        person1.move();
        person2.talk();
    }
}