package servicios;

public class Dispensador10Mil extends DispensadorBase {
    @Override
    public void dispensar(int monto) {
        if (monto >= 10000) {
            int cantidad = monto / 10000;
            int resto = monto % 10000;
            System.out.println("Dispensando " + cantidad + " billetes de $10.000");
            if (resto != 0) {
                super.dispensar(resto);
            }
        } else {
            super.dispensar(monto);
        }
    }
}
