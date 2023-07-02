/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package open25;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Open25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stock stock = new Stock();
        ArrayList<Producto> listaStock = stock.getListaStock();
        listaStock.add(new Producto("cocacola", 450, 10));
        listaStock.add(new Producto("oreo", 200, 15));
        listaStock.add(new Producto("fideos", 300, 20));
        listaStock.add(new Producto("arroz", 400, 6));
        listaStock.add(new Producto("pepitos", 300, 3));
        listaStock.add(new Producto("pepsi", 400, 30));
        listaStock.add(new Producto("servilletas", 500, 13));
        listaStock.add(new Producto("aceite", 300, 3));
        listaStock.add(new Producto("nesquik", 600, 10));
        listaStock.add(new Producto("guaymallen", 100, 20));
        Vendedor ven = new Vendedor("Julian", "123");
        Dueño due = new Dueño("Pepe", "321");

        boolean cambiarUsuario = true;

        while (cambiarUsuario) {
            String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
            String contraseña = JOptionPane.showInputDialog("Introduce tu Contraseña");
            if (ven.VerificarVendedor(nombre, contraseña)) {
                JOptionPane.showMessageDialog(null, "Sos vendedor");
                Venta venta = new Venta();
                ArrayList<Producto> listaVender = venta.getListaVender();
                ven.AperturaCaja();
                ven.Vender(listaVender, listaStock);
                venta.CalcularTotal();
                venta.CalcularVuelto();
                venta.emitirTicket();

            } else if (due.VerificarDueño(nombre, contraseña)) {
                JOptionPane.showMessageDialog(null, "Sos dueño");
                int seleccion = JOptionPane.showOptionDialog(
                        null, "Seleccione opción", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Modificar Precio", "Añadir Producto", "Ver Stock"},
                        "opcion 1"
                );

                if (seleccion == 0) {
                    due.ModificarPrecio(listaStock);
                    due.VerStock(listaStock);
                } else if (seleccion == 1) {
                    due.AñadirProducto(listaStock);
                    due.VerStock(listaStock);
                } else if (seleccion == 2) {
                    due.VerStock(listaStock);

                }
            }

            int respuesta = JOptionPane.showConfirmDialog(null, "Ingrese nuevamente", "Cambiar Usuario", JOptionPane.YES_NO_OPTION);
            cambiarUsuario = (respuesta == JOptionPane.YES_OPTION);
        }

    }

}
