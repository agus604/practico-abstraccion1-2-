abstract class Numerica {
    // Métodos abstractos

    public abstract String toString(); // Convierte el número a String.
    public abstract boolean equals(Object ob); // Compara el objeto con el parámetro.
    public abstract Numerica sumar(Numerica número); // Retorna la suma de los dos números.
    public abstract Numerica restar(Numerica número); // Retorna la resta de los dos números.
    public abstract Numerica multiplicar(Numerica número); // Retorna la multiplicación de los dos números.
    public abstract Numerica dividir(Numerica número); // Retorna la división de los dos números.
}

