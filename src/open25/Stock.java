/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package open25;

import java.util.ArrayList;

public class Stock {

    private ArrayList<Producto> listaStock = new ArrayList<>();
    private double montoCaja;

    public Stock(ArrayList<Producto> listaStock, double montoCaja) {
        this.montoCaja = montoCaja;

    }

    public Stock() {
    }

    public void addproducto(ArrayList<Producto> listaStock, String nombre, int costo, int cantidad) {
        listaStock.add(new Producto(nombre, costo, cantidad));

    }

    public ArrayList<Producto> getListaStock() {
        return listaStock;
    }

    public void setListaStock(ArrayList<Producto> listaStock) {
        this.listaStock = listaStock;
    }

    public double getMontoCaja() {
        return montoCaja;
    }

    public void setMontoCaja(double montoCaja) {
        this.montoCaja = montoCaja;
    }

}
