import java.util.Scanner;

public class main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        lotto lotto = new lotto();
        System.out.println("**************************************************************");
        System.out.println("*                                                            *");
        System.out.println("*                    Aufgabe 9:                              *");
        System.out.println("*          \"Lotto, Pascal und ein Dreieck\"                   *");
        System.out.println("*      Berechnung der Gewinnchancen beim Lotto               *");
        System.out.println("*                                                            *");
        System.out.println("**************************************************************\n\n");

        System.out.println("Berechnung der Chancen bei x aus y:");
        int x, y;
        System.out.print("x: ");
        x = scan.nextInt();
        System.out.print("y: ");
        y = scan.nextInt();
        System.out.println("\nChancen bei " + x + " aus " + y + ": " + lotto.getChance(x, y));

        System.out.print("\n\nNochmal ausführen? (j/n) "); char again = scan.next().charAt(0);
        if (again == 'j')
        {
            System.out.print("\n\n\n\n");
            main(args);
        }
        else {}
    }

}
