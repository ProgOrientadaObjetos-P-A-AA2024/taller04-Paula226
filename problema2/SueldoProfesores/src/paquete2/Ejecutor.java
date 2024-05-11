/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;
import paquete1.SueldoProfesores;
public class Ejecutor {
    public static void main(String[] args) {
        SueldoProfesores profesor1 = new SueldoProfesores("Juan", "Pérez", 25000, "1234567890" );
        profesor1.establecerSueldoTotal();
        SueldoProfesores profesor2 = new SueldoProfesores("Pedro", "García", 28000, "2345678901" );
        profesor2.establecerSueldoTotal();
        System.out.printf("%s\n", profesor1);
        System.out.printf("%s\n", profesor2);
    }
}