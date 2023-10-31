package Tienda;

public class Gato extends Mascotas {
    private String pelo;
    private double altSalto;
    private double longSalto;
    private String razaGato;
    private boolean sonidoG;


    public Gato() {
    }

    public Gato(String nombre, int edad, String color, String pelo, double altSalto, double longSalto, String razaGato, boolean sonidoG) {
        super(nombre, edad, color);
        this.pelo = pelo;
        this.altSalto = altSalto;
        this.longSalto = longSalto;
        this.razaGato = razaGato;
        this.sonidoG = sonidoG;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public double getAltSalto() {
        return altSalto;
    }

    public void setAltSalto(double altSalto) {
        this.altSalto = altSalto;
    }

    public double getLongSalto() {
        return longSalto;
    }

    public void setLongSalto(double longSalto) {
        this.longSalto = longSalto;
    }

    public String getRazaGato() {
        return razaGato;
    }

    public void setRazaGato(String razaGato) {
        this.razaGato = razaGato;
    }

    public boolean isSonidoG() {
        return sonidoG;
    }

    public void setSonidoG(boolean sonidoG) {
        this.sonidoG = sonidoG;
    }

    public void sonido() {
        if (sonidoG) {
            System.out.println("Maulla y ronronea");
        } else {
            System.out.println("Ladra");
        }
    }
}

