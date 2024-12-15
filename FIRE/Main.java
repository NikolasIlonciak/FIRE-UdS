import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean validInput = false;
        
        int velkostX = 0;
        System.out.println("VelkostX:");
        do {
            System.out.println("VelkostX:");
            try {
                velkostX = scanner.nextInt();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.next(); 
            }
        } while (!validInput);
        
        validInput = false;
        
        int velkostY = 0;
        do {
            System.out.println("VelkostY:");
            try {
                velkostY = scanner.nextInt();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.next(); 
            }
        } while (!validInput);
        
        validInput = false;
        
        int hustota = 0;
        do {
            System.out.println("Hustota:");
            try {
                hustota = scanner.nextInt();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.next(); 
            }
        } while (!validInput);

        Celok celok = new Celok(velkostX, velkostY, hustota);

        String ukonci;
        do {
            System.out.println("Napis 'ukonci' na ukoncenie programu:");
            ukonci = scanner.next();
            if (ukonci.equals("ukonci")) {
                celok.ukonci();
            } else {
                System.out.println("Nespravny prikaz. Try again.");
            }
        } while (!ukonci.equals("ukonci"));

        scanner.close();
    }
}
