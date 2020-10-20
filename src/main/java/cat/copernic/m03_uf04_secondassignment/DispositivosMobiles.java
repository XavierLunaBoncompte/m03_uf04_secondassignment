/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

import cat.copernic.m03_uf04_secondassignment.Conectable;
import cat.copernic.m03_uf04_secondassignment.Conectable;

/**
 *
 * @author lubo1
 */
public abstract class DispositivosMobiles extends Dispositivos implements Conectable {

    private boolean pantallaTactil;

    public DispositivosMobiles(boolean pantallaTactil, String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
        this.pantallaTactil = pantallaTactil;
    }

    public boolean isPantallaTactil() {
        return pantallaTactil;
    }

    public void setPantallaTactil(boolean pantallaTactil) {
        this.pantallaTactil = pantallaTactil;
    }

    @Override
    public String toString() {
        return "DispositivosMobiles{" + "pantallaTactil=" + pantallaTactil + '}';
    }

    @Override
    public void conecta() {
        System.out.println("Conectandose al dispositivo");
    }

    @Override
    public void desconecta() {
        System.out.println("Desonectandose al dispositivo");
    }
    
    abstract void reset();

}
