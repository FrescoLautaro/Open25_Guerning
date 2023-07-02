/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package open25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Venta {

    private double importe;
    private double abonado;
    private ArrayList<Producto> listaVender = new ArrayList<>();
    private LocalDate Fecha;

    public Venta(double importe, double abonado, LocalDate Fecha) {
        this.importe = importe;
        this.abonado = abonado;
        this.Fecha = Fecha;
    }

    public Venta() {
    }

    public void emitirTicket() {
        System.out.println("----------------------------");
        System.out.println("Productos: ");

        for (Producto p : listaVender) {
            System.out.println(p.toString()); //Printeamos el to string de la clase prodcuto
        }
        System.out.println("Total .....$: " + this.CalcularTotal()); 
        String dateTime = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a").format(LocalDateTime.now());
        System.out.println(dateTime);
        System.out.println("----------------------------");
    }

    public double CalcularTotal() {
        double importe = 0.0;
        for (Producto p : listaVender) {
            importe += p.getCosto();
        }
        this.importe = importe;
        return importe;
    }

    public void CalcularVuelto() {
        int abonado = Integer.parseInt(JOptionPane.showInputDialog("Con cuanto paga"));
        while (abonado < importe) {
            JOptionPane.showMessageDialog(null, "No le alcanza");
            abonado = Integer.parseInt(JOptionPane.showInputDialog("Con cuanto paga"));
        }
        double vuelto = abonado - importe;
        System.out.println("----------------------------");
        System.out.println("El vuelto es de  " + vuelto);

    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getAbonado() {
        return abonado;
    }

    public void setAbonado(double abonado) {
        this.abonado = abonado;
    }

    public ArrayList<Producto> getListaVender() {
        return listaVender;
    }

    public void setListaVender(ArrayList<Producto> listaVender) {
        this.listaVender = listaVender;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

}
