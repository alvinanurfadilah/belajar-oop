package programmer.application;

public class EqualsApp {
    public static void main(String[] args) {
        
        String first = "Alvina";
        first = first + " " + "Nurfadilah";

        System.out.println(first);

        String second = "Alvina Nurfadilah";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Alvina Nurfadilah";

        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
