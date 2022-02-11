import java.util.Scanner;

public class Fibo {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n");
        int n = scan.nextInt();
        int nbr1=0, nbr2=1, nbr3=0, i;
        for(i=2; i<=n; ++i)
        {
            nbr3 = nbr1 + nbr2;
            nbr1 = nbr2;
            nbr2 = nbr3;

        }
        System.out.print(nbr3);
    }

}
