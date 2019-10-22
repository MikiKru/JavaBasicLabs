import java.util.Scanner;

import static java.lang.Math.pow;

// psvm - public static void main(String[] args) {}
// sout - System.out.println();
public class Ex2 {
    public static void main(String[] args) {
        int a,b,c;
        // Wprowadzanie danych z standardowejgo wejścia CL
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = scanner.nextInt();
        System.out.println("Podaj b: ");
        b = scanner.nextInt();
        System.out.println("Podaj c: ");
        c = scanner.nextInt();
        double delta = pow(b,2) - (4*a*c);
        System.out.println("delta = " + delta);
        // instrukcja jeżeli -> warunek
        if(delta > 0){
            // działanie
        } else if (delta == 0){
            // działanie
        } else {
            // działanie
        }

    }
}
