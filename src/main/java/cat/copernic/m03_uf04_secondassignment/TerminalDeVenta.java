/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

import cat.copernic.m03_uf04_secondassignment.DispositivosDeSobremesa;

/**
 *
 * @author lubo1
 */
public class TerminalDeVenta extends DispositivosDeSobremesa {

    private String tipoVenta;

    public TerminalDeVenta(String tipoVenta, String tipoDeMesa, String nombre, String descripcion, double precio) {
        super(tipoDeMesa, nombre, descripcion, precio);
        this.tipoVenta = tipoVenta;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    @Override
    public String toString() {
        return "TerminalDeVenta{" + "tipoVenta=" + tipoVenta + '}';
    }

    @Override
    public void desconecta() {
        System.out.println("Desconectando el terminal de venta");
    }

    @Override
    public void conecta() {
        System.out.println("Conectando el terminal de venta");
    }

}
