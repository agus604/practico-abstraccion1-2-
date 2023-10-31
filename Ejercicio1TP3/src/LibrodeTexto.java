public class LibrodeTexto extends Libro{
    //Atributos
    private String facultad;
    private int curso;
//Constructores:
    //Vacio
    public LibrodeTexto() {
    }
    //Dos atributos
    public LibrodeTexto(String facultad, int curso) {
        this.facultad = facultad;
        this.curso = curso;
    }
    //Cuatro atributos
    public LibrodeTexto(String titulo, String autor, double precio, int curso) {
        super(titulo, autor, precio);
    }
    //Cinco atributos
    public LibrodeTexto(String titulo, String autor, double precio, String facultad, int curso) {
        super(titulo, autor, precio);
        this.facultad = facultad;
        this.curso = curso;
    }
//Métodos Getter y Setter
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
//Metodos Especial
    //Se llama mostrarinformación
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Facultad: " + facultad);
        System.out.println("curso: " + curso);
    }
}
