public abstract class Vehiculo {

    private double velocidadActual;
    private double velocidadMaxima;

    public Vehiculo() {
        this.velocidadActual = 0;
        this.velocidadMaxima = 0;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void acelerar(double velocidad);

    public abstract void frenar(double velocidad);

    public void imprimir() {
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}
