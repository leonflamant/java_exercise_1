import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        boolean continu = true;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("enter command");
            String commande = scan.nextLine();
            if (!commande.equals("quit")) {
                System.out.println("unknown command");
            }
            else{
                continu = false;
            }
        }while(continu);
}}

