import Tienda.Perro;
import Tienda.Gato;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //creamos array para setear la informacion de nuevos perros y gatos
        Perro perros[] = {
                new Perro("fufi", 10, "blanco", "grande", 15, true, true, "pichichu"),
                new Perro("roli", 20, "negro", "mediano", 10, true, true, "boxer"),
                new Perro("titan", 5, "gris", "pequeño", 5, true, true, "chiguagua")
        };

        Gato gatos[] = {
                new Gato("michi", 5, "marmolado", "largo", 1.5, 2.0, "callejero", true),
                new Gato("michi", 3, "gris", "corto", 0.5, 1, "atrigado", true),
                new Gato("michi", 8, "azul", "sin pelo", 1, 1.5, "bicolor", true)
        };

        System.out.println("Estas son nuestras mascotas:");
        System.out.println("Perros:");
        // hacemos un for para recorrer los valores que armamos con el array
        for (Perro perro : perros) {
            System.out.println(perroInformacion(perro));
        }

        System.out.println("Gatos:");
        for (Gato gato : gatos) {
            System.out.println(gatoInformacion(gato));
        }
    }
// aca creamos un metodo para mostrar la informacion de los perros tomando a perro como argumento
    // el signo de pregunta se coloca para para evaluar a condicion
    public static String perroInformacion(Perro perro) {
        String ladraOMaulla = perro.isSonidoP() ? "Ladra" : "Maulla y ronronea";
        String muerdeString = perro.isMuerde() ? "Sí" : "No";
        return "Nombre: " + perro.getNombre() + ", Edad: " + perro.getEdad() + " años, Color: " + perro.getColor() +
                ", Tamaño: " + perro.getTamaño() + ", Peso: " + perro.getPeso() + " kg, Muerde: " + muerdeString +
                ", Sonido: " + ladraOMaulla + ", Raza: " + perro.getRazaPerro();
    }
    // aca creamos un metodo para mostrar la informacion de los gatos tomando a gato como argumento
    public static String gatoInformacion(Gato gato) {
        String ladraOMaulla = gato.isSonidoG() ? "Maulla y ronronea" : "Ladra";
        return "Nombre: " + gato.getNombre() + ", Edad: " + gato.getEdad() + " años, Color: " + gato.getColor() +
                ", Pelo: " + gato.getPelo() + ", Altura de salto: " + gato.getAltSalto() + " mts, " +
                "Longitud de salto: " + gato.getLongSalto() + " mts, Sonido: " + ladraOMaulla + ", Raza: " + gato.getRazaGato();
    }
}