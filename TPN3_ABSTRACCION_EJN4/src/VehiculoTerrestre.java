public abstract class VehiculoTerrestre extends Vehiculo implements Motor{
    private int cantidadLlantas;
    private String uso;

    public VehiculoTerrestre(int cantidadLlantas, String uso) {
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
    }

    public int getCantidadLlantas() {
        return cantidadLlantas;
    }

    public void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
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
}

