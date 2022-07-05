package Part_3;

public class ReplaceAll {

    public static void main(String[] args) {
        String test = "Audi & Ferrari";
        System.out.println(test.replaceAll("[ ]", ""));
        System.out.println(test.replaceAll("[ Apple ]", ""));
        System.out.println(test.replaceAll("[Your]", ""));
    }
}
