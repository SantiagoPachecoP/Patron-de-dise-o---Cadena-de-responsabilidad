package servicios;

public class Dispensador100Mil extends DispensadorBase {
    @Override
    public void dispensar(int monto) {
        if (monto >= 100000) {
            int cantidad = monto / 100000;
            int resto = monto % 100000;
            System.out.println("Dispensando " + cantidad + " billetes de $100.000");
            if (resto != 0) {
                super.dispensar(resto);
            }
        } else {
            super.dispensar(monto);
        }
    }
}
