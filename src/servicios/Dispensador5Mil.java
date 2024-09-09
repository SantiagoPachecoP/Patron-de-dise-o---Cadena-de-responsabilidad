package servicios;

public class Dispensador5Mil extends DispensadorBase {
    @Override
    public void dispensar(int monto) {
        if (monto >= 5000) {
            int cantidad = monto / 5000;
            int resto = monto % 5000;
            System.out.println("Dispensando " + cantidad + " billetes de $5.000");
            if (resto != 0) {
                super.dispensar(resto);
            }
        } else {
            super.dispensar(monto);
        }
    }
}
