/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package open25;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vendedor extends Usuario {

    public Vendedor(String nombreR, String contraseñaR) {
        super(nombreR, contraseñaR);
    }

    public boolean VerificarVendedor(String nombre, String contraseña) {
        if (nombre.equals("Julian") && contraseña.equals("123")) {

            return true;
        }
        return false;
    }

    public double AperturaCaja() {
        double montoCajaA = Double.parseDouble(JOptionPane.showInputDialog("Introduce Con cuanto arranca el dia la caja: "));
        return montoCajaA;
    }

    public double CierreCaja() {
        double montoCajaC = Double.parseDouble(JOptionPane.showInputDialog("Introduce Con cuanto cierra el dia la caja: "));

        return montoCajaC;
    }

    public static ArrayList<Producto> Vender(ArrayList<Producto> listaVender, ArrayList<Producto> listaStock) {

        int opc = 0;
        opc = JOptionPane.showOptionDialog(
                null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, // null para icono por defecto.
                new Object[]{"Comprar", "Terminar compra"},
                "opcion 1");

        while (opc != 1) {

            String nombre = JOptionPane.showInputDialog("Introduce nombre del producto");
            boolean encontrado = false;

            while (!encontrado) {
                for (Producto p : listaStock) {
                    if (p.getNom().equals(nombre)) {
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Ese nombre no corresponde a ningún producto");
                    nombre = JOptionPane.showInputDialog("Introduzca el nombre del producto");
                }

            }
            int unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad del producto"));
            for (Producto p : listaStock) {
                if (nombre.equals(p.getNom())) {
                    int costo = (int) (p.getCosto() * unidades);
                    listaVender.add(new Producto(nombre, costo, unidades));
                }
            }

            for (Producto p : listaStock) {
                if (nombre.equals(p.getNom())) {
                    p.setCantidad((int) (p.getCantidad() - unidades));
                    if (p.getCantidad() < 0) {
                        System.out.println("Ya no hay mas de ese producto");
                        listaStock.remove(p);
                    }
                }
            }
            opc = JOptionPane.showOptionDialog(
                    null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, // null para icono por defecto.
                    new Object[]{"Comprar", "Terminar compra"},
                    "opcion 1");

        }

        return listaVender;
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
