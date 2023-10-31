// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear un vehículo terrestre
        VehiculoTerrestre vehiculoTerrestre = new VehiculoTerrestre(4, "civil") {
            @Override
            public void calcularRevolucionesMotor(int fuerza, int radio) {

            }
        };
        vehiculoTerrestre.setVelocidadMaxima(120);

        // Acelerar y frenar el vehículo terrestre
        vehiculoTerrestre.acelerar(60);
        vehiculoTerrestre.frenar(20);

        // Imprimir información sobre el vehículo terrestre
        System.out.println("Vehículo Terrestre:");
        vehiculoTerrestre.imprimir();

        // Crear un vehículo acuático
        VehiculoAcuatico vehiculoAcuatico = new VehiculoAcuatico("superficie", 50);
        vehiculoAcuatico.setVelocidadMaxima(80);

        // Acelerar y frenar el vehículo acuático
        vehiculoAcuatico.acelerar(30);
        vehiculoAcuatico.frenar(15);

        // Imprimir información sobre el vehículo acuático
        System.out.println("\nVehículo Acuático:");
        vehiculoAcuatico.imprimir();
        
    }
}