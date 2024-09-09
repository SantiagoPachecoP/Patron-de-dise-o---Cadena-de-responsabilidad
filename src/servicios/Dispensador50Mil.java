package servicios;

public class Dispensador50Mil extends DispensadorBase {
    @Override
    public void dispensar(int monto) {
        if (monto >= 50000) {
            int cantidad = monto / 50000;
            int resto = monto % 50000;
            System.out.println("Dispensando " + cantidad + " billetes de $50.000");
            if (resto != 0) {
                super.dispensar(resto);
            }
        } else {
            super.dispensar(monto);
        }
    }
}
