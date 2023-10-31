// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Fraccion fracción1 = new Fraccion(1, 2);
        Fraccion fracción2 = new Fraccion(1, 4);
        System.out.println("Fracción 1: " + fracción1);
        System.out.println("Fracción 2: " + fracción2);
        // Suma de fracciones
        Numerica suma = fracción1.sumar(fracción2);
        System.out.println("Suma: " + suma);
        // Resta de fracciones
        Numerica resta = fracción1.restar(fracción2);
        System.out.println("Resta: " + resta);
        // Multiplicación de fracciones
        Numerica multiplicación = fracción1.multiplicar(fracción2);
        System.out.println("Multiplicación: " + multiplicación);
        // División de fracciones
        Numerica división = fracción1.dividir(fracción2);
        System.out.println("División: " + división);

    }
}