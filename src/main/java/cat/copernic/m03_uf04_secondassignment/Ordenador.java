/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author lubo1
 */
public class Ordenador extends DispositivosDeSobremesa {

    private boolean tecladoDeSobremesa;

    public Ordenador(boolean tecladoDeSobremesa, String tipoDeMesa, String nombre, String descripcion, double precio) {
        super(tipoDeMesa, nombre, descripcion, precio);
        this.tecladoDeSobremesa = tecladoDeSobremesa;
    }

    public boolean isTecladoDeSobremesa() {
        return tecladoDeSobremesa;
    }

    public void setTecladoDeSobremesa(boolean tecladoDeSobremesa) {
        this.tecladoDeSobremesa = tecladoDeSobremesa;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "tecladoDeSobremesa=" + tecladoDeSobremesa + '}';
    }

}
