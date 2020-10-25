/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.excercicilliure;

/**
 *
 * @author lubo1
 *
 *
 * id, cantidad, Item
 *
 */
public abstract class Detalle extends Item {

    private int idDetalle;
    private int cantidadDetalle;

    public Detalle(int idDetalle, int cantidadDetalle, double precio, String descripcion, String nombre, int id) {
        super(precio, descripcion, nombre, id);

        if (idDetalle == 0) {
            throw new NullPointerException("La variable nombre no puede estar vacia");
        }
        this.idDetalle = idDetalle;

        this.cantidadDetalle = cantidadDetalle;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidadDetalle() {
        return cantidadDetalle;
    }

    public void setCantidadDetalle(int cantidadDetalle) {
        this.cantidadDetalle = cantidadDetalle;
    }

    @Override
    public String toString() {
        return "Detalle{" + "idDetalle=" + idDetalle + ", cantidadDetalle=" + cantidadDetalle + '}';
    }

}
