import java.util.Scanner;

class Cal{

    public static void main(String[] args) {

        System.out.println("Choisir un nombre!");
        Scanner num1 = new Scanner(System.in);
        int x = num1.nextInt();

        System.out.println("Choisir un deuxieme nombre!");
        Scanner num2 = new Scanner(System.in);
        int y = num2.nextInt();

        int rep = x + y;
        System.out.println("Le résultat est " + rep);

    }
}

