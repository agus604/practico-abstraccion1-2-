//Definir una clase Libro para manejar la información asociada a un libro.
// La información de interés para un libro es: el título, el autor y el precio.
// Los métodos de interés son:
//- Un constructor para crear un objeto libro, con título y autor como parámetros.
//- Imprimir en pantalla el título, los autores y el precio del libro.
// ○ Métodos get y set para cada atributo de un libro.
//Se debe extender la clase Libro definiendo las siguientes clases:
//•	Libros de texto: subclase de la clase anterior.
// Esta subclase tiene un atributo que especifica cuál facultad lo publicó.
// Con un nuevo atributo que especifica el curso al cual está asociado el libro.
//•	Novelas: pueden ser de diferente tipo, histórica, romántica, policíaca,
// realista, ciencia ficción o aventuras.
//Para cada una de las clases anteriores se debe definir su constructor
// y redefinir adecuadamente el método para visualizar del objeto.
public class Main {
    public static void main(String[] args) {
        Libro libro1 =new Libro("El gato negro", "Edgar Allan Poe", 2000);
        libro1.mostrarInformacion();

        System.out.println("_________________________");

        LibrodeTexto libro2= new LibrodeTexto("Anatomía", "J.P. Gomez", 5000, "Uncuyo", 5);
        libro2.mostrarInformacion();
        System.out.println("______________________________");

        Novelas libro3=new Novelas("La tercera Palabra", "Alejandro Casona", 5000,"Romance" );
        libro3.mostrarInformacion();
        System.out.println("__________________________");
    }

}