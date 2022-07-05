package Part_3;

public class People {


        String name = "Den";
        int age = 32;

        public void move() {
            System.out.println("Sound");
        }

        public void talk(){
            System.out.println("Cloud");
        }

        public People() {
        }

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public static void main(String[] args) {
            People person1 = new People();
            People person2 = new People("Den", 35);
            person1.move();
            person2.talk();
        }
    }

