package servicios;

public class Dispensador20Mil extends DispensadorBase {
    @Override
    public void dispensar(int monto) {
        if (monto >= 20000) {
            int cantidad = monto / 20000;
            int resto = monto % 20000;
            System.out.println("Dispensando " + cantidad + " billetes de $20.000");
            if (resto != 0) {
                super.dispensar(resto);
            }
        } else {
            super.dispensar(monto);
        }
    }
}
