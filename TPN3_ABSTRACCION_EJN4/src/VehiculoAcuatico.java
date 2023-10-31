public class VehiculoAcuatico extends Vehiculo implements Vela {
    private String tipo;
    private int capacidadPasajeros;

    public VehiculoAcuatico(String tipo, int capacidadPasajeros) {
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar(double velocidad) {
        if (getVelocidadActual() + velocidad <= getVelocidadMaxima()) {
            setVelocidadActual(getVelocidadActual() + velocidad);
        } else {
            setVelocidadActual(getVelocidadMaxima());
        }
    }

    @Override
    public void frenar(double velocidad) {
        if (getVelocidadActual() - velocidad >= 0) {
            setVelocidadActual(getVelocidadActual() - velocidad);
        } else {
            setVelocidadActual(0);
        }
    }

    @Override
    public void recomendarVelocidad(double velocidadViento) {
        if (velocidadViento > 80) {
            setVelocidadActual(0);
        }
    }
}

