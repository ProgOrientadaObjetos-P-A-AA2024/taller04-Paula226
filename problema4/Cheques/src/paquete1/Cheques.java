/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;


public class Cheques {
        private String nombreCliente;
        private String nombreBanco;
        private double valorCheque;
        private double comisionBanco;
    public Cheques (String nom , String nomban, double valor) {
    nombreCliente = nom;
    nombreBanco = nomban;
    valorCheque = valor;
    
    }
    public void establecerNombreCliente(String c) {
        nombreCliente = c;
    }
    public void establecerNombreBanco(String c) {
       nombreBanco = c;
    }
    public void establecerValorCheque(double c) {
        valorCheque = c;
    }
    public void establecerComisionBanco() {
        comisionBanco = 0.003 * valorCheque;
    }
    public String obtenerNombreCliente(){
        return nombreCliente;
    }
    public String obtenerNombreBanco () {
        return nombreBanco;
    }
    public double obtenerValorCheque() {
       return valorCheque;
    }
    public double obtenerComisionBanco(){
        return comisionBanco;
    }
     @Override
    public String toString() {
    String cadena = String.format("Comisiones de Bancos:\n" +
            "Nombre del Cliente: %s\n" +
            "Nombre del Banco: %s\n" +
            "Valor del Cheque: %s\n" +
            "Comision del Banco: %.2f\n",
            nombreCliente, nombreBanco, valorCheque, comisionBanco);
    return cadena;
}
}
