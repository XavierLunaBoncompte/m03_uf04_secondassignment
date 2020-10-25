/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.excercicilliure;

/**
 *
 * @author lubo1
 */
public class ManzanaGolden extends Detalle {

    private double peso;

    public ManzanaGolden(double peso, int idDetalle, int cantidadDetalle, double precio, String descripcion, String nombre, int id) {
        super(idDetalle, cantidadDetalle, precio, descripcion, nombre, id);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "ManzanaGolden{" + "peso=" + peso + '}';
    }

}
