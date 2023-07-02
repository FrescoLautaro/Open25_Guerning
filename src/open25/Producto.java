/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package open25;

public class Producto {

    private String nom;
    private int costo;
    private int cantidad;

    public Producto(String nom, int costo, int cantidad) {
        this.nom = nom;
        this.costo = costo;
        this.cantidad = cantidad;

    }

    @Override
    public String toString() {
        return "Producto{" + "nom=" + nom + ", costo=" + costo + ", cantidad=" + cantidad + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
