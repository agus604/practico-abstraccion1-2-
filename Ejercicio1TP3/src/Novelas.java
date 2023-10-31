
public class Novelas extends Libro {
    private String tipo;

    public Novelas() {
    }

    public Novelas(String tipo) {
        this.tipo = tipo;
    }

    public Novelas(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
    }
}
