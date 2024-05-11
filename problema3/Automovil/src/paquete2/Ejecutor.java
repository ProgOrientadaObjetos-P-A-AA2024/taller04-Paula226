
package paquete2;
import paquete1.Automovil;

public class Ejecutor {
    public static void main(String[] args) {
        // Crear objeto Automovil
        Automovil automovil1 = new Automovil("987654321", "Honda", 2015, 180000);
        automovil1.establecerValorMatricula();
        Automovil automovil2 = new Automovil("123456789", "Toyota", 2018, 250000);
        automovil2.establecerValorMatricula();
        System.out.printf("%s\n", automovil1);
        System.out.printf("%s\n", automovil2);
    }
}
