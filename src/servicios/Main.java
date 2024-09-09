package servicios;

import servicios.*;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Dispensador dispensador100Mil = new Dispensador100Mil();
        Dispensador dispensador50Mil = new Dispensador50Mil();
        Dispensador dispensador20Mil = new Dispensador20Mil();
        Dispensador dispensador10Mil = new Dispensador10Mil();
        Dispensador dispensador5Mil = new Dispensador5Mil();

        dispensador100Mil.setSiguiente(dispensador50Mil);
        dispensador50Mil.setSiguiente(dispensador20Mil);
        dispensador20Mil.setSiguiente(dispensador10Mil);
        dispensador10Mil.setSiguiente(dispensador5Mil);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto a dispensar: ");
        int monto = scanner.nextInt();
        scanner.close();

        if (monto % 5000 != 0) {
            System.out.println("El monto debe ser un múltiplo de 5.000.");
        } else {
            dispensador100Mil.dispensar(monto);
        }
    }
}
