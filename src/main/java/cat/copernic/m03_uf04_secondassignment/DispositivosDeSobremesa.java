/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

import cat.copernic.m03_uf04_secondassignment.Conectable;

/**
 *
 * @author lubo1
 */
public abstract class DispositivosDeSobremesa extends Dispositivos implements Conectable {

    private String tipoDeMesa;

    public DispositivosDeSobremesa(String tipoDeMesa, String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
        this.tipoDeMesa = tipoDeMesa;
    }

    public String getTipoDeMesa() {
        return tipoDeMesa;
    }

    public void setTipoDeMesa(String tipoDeMesa) {
        this.tipoDeMesa = tipoDeMesa;
    }

    @Override
    public String toString() {
        return "DispositivosDeSobremesa{" + "tipoDeMesa=" + tipoDeMesa + '}';
    }

    @Override
    public void conecta() {
        System.out.println("Conectandose al dispositivo");
    }

    @Override
    public void desconecta() {
        System.out.println("Desconectandose al dispositivo");
    }

}
