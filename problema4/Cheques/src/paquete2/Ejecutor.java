
package paquete2;

import paquete1.Cheques;
public class Ejecutor {
      public static void main(String[] args) {
        Cheques cheque1 = new Cheques("Juan Pérez", "Banco XYZ", 50000);
        cheque1.establecerComisionBanco();
        Cheques cheque2 = new Cheques("Carlos Martínez", "Banco DEF", 80000);
        cheque2.establecerComisionBanco();
        System.out.printf("%s\n", cheque1);
        System.out.printf("%s\n", cheque2);
}
}
