/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author Paula Lopez
 */
public class SueldoProfesores {
    private String nombre;
    private String apellido ;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    

public SueldoProfesores(String nom, String ape, double suelb,String ce){
    nombre = nom;
    apellido = ape;
    sueldoBasico = suelb;
    cedula = ce;
}
public void establecerNombre(String c) {
    nombre = c;
}
public void establecerApellido(String c) {
    apellido = c; 
}
public void establecerSueldoBasico(double c) {
    sueldoBasico = c; 
}
public void establecerSueldoTotal() {
    sueldoTotal = sueldoBasico + (0.20 * sueldoBasico);
}
public void establcerCedula(String c) {
    cedula = c;
}
public String obtenerNombre() {
    return nombre;
}
public String obtenerApellido() {
    return apellido;
}
public double obtenerSueldoBasico() {
    return sueldoBasico;
}
public double obtenerSueldoTotal() {
 return sueldoTotal;   
}
@Override
public String toString() {
    String cadena = String.format("Información del Profesor:\n" +
            "Nombre: %s\n" +
            "Apellido: %s\n" +
            "Cédula: %s\n" +
            "Sueldo Básico: %.2f\n" +
            "Sueldo Total: %.2f\n",
            nombre, apellido, cedula, sueldoBasico, sueldoTotal);
    return cadena;
}
}