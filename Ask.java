import java.util.Scanner;

public class Ask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre prénom ");
        String name = scanner.nextLine();
        System.out.println("quel est votre age ?");
        int age = scanner.nextInt();
        System.out.println("Bonjour " + name + "!");
        if (age < 18) {
            System.out.println("Vous êtes mineur");
        } else {
            System.out.println("Vous êtes majeur");
        }
        scanner.close();
    }
}