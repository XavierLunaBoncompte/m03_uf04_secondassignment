/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author pep
 */
public class M03_UF04_SecondAssignment {

    public static void main(String[] args) {
        Dispositivos o1 = new Ordenador(true, "Marmol", "hp-12345", "Potente", 500.99);
        o1.conecta();

        Dispositivos t2 = new Tablet(true, "Acer", "Tablet de 15 pulgadas", 299.99);
        t2.conecta();

        Tablet t3 = new Tablet(true, "Acer", "Tablet de 15 pulgadas", 299.99);
        t3.reset();

        Dispositivos tdv4 = new TerminalDeVenta("ITV", "Madera", "TerminalDeVenta1", "Para ventas de la ITV", 487.56);
        tdv4.conecta();

        Dispositivos p5 = new Portatil(false, "HP-Portatil", "Con SSD", 399.99);
        p5.conecta();

        // Dispositivo sin nombre, el programa da el error pasado por la excepcion.
        Dispositivos p6 = new Portatil(false, " ", "Con SSD y 8gb de RAM", 399.99); 
        p6.conecta();

    }

}
