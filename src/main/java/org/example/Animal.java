
package org.example;

public class Animal {

    private String nombre;
    private String genero;
    private double peso;
    public static Animal pareja;

    public Animal() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static Animal getPareja() {
        return pareja;
    }

    public static void setPareja(Animal pareja) {
        Animal.pareja = pareja;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
        this.peso = peso;
    }

    void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }






}
