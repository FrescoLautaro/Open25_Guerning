/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package open25;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Dueño extends Usuario {

    public Dueño(String nombreR, String contraseñaR) {
        super(nombreR, contraseñaR);
    }

    public boolean VerificarDueño(String nombre, String contraseña) {
        if (nombre.equals("Pepe") && contraseña.equals("321")) {

            return true;
        }
        return false;
    }

    public void ModificarPrecio(ArrayList<Producto> listaStock) {
        String nom = JOptionPane.showInputDialog("Introduzca el nombre del producto");
        for (Producto p : listaStock) {
            if (nom.equals(p.getNom())) {
                int costo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nuevo costo del producto"));
                p.setCosto(costo);

            }

        }

    }

    public void AñadirProducto(ArrayList<Producto> listaStock) {

        String nom = JOptionPane.showInputDialog("Introduzca el nombre del producto");
        int costo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el costo del producto"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad del producto"));
        listaStock.add(new Producto(nom, costo, cantidad));

    }

    public void VerStock(ArrayList<Producto> listaStock) {
        for (Producto p : listaStock) {
            System.out.println(p.toString());

        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
