package servicios;

public interface Dispensador {
    void setSiguiente(Dispensador siguiente);
    void dispensar(int monto);
}
