/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

import cat.copernic.m03_uf04_secondassignment.DispositivosMobiles;

/**
 *
 * @author lubo1
 */
public class Portatil extends DispositivosMobiles {

    public Portatil(boolean pantallaTactil, String nombre, String descripcion, double precio) {
        super(pantallaTactil, nombre, descripcion, precio);
    }

    @Override
    void reset() {
        System.out.println("Reseteando el portatil");
    }

}
