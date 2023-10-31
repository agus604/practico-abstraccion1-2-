package Tienda;

public class Perro extends Mascotas {
    private String tamaño;
    private double peso;
    private boolean muerde;
    private boolean sonidoP = true;
    private String razaPerro;

    public Perro() {
    }

    public Perro(String nombre, int edad, String color, String tamaño, double peso, boolean muerde, boolean sonidoP, String razaPerro) {
        super(nombre, edad, color);
        this.tamaño = tamaño;
        this.peso = peso;
        this.muerde = muerde;
        this.sonidoP = sonidoP;
        this.razaPerro = razaPerro;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    public boolean isSonidoP() {
        return sonidoP;
    }

    public void setSonidoP(boolean sonidoP) {
        this.sonidoP = sonidoP;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public void sonido() {
        if (sonidoP) {
            System.out.println("Ladra");
        } else {
            System.out.println("Maulla y ronronea");
        }
    }
}
