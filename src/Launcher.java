import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("bienvenu");
        Scanner scan = new Scanner(System.in);
        String commande = scan.nextLine();
        if (!commande.equals("quit")) {
            System.out.println("unknown commande");
        }
}}
