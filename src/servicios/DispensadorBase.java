package servicios;

public abstract class DispensadorBase implements Dispensador {
    protected Dispensador siguiente;

    @Override
    public void setSiguiente(Dispensador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void dispensar(int monto) {
        if (this.siguiente != null) {
            this.siguiente.dispensar(monto);
        }
    }
}

