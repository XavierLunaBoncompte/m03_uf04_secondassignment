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
 * Producte que volem comprar
 *
 * precio, descripcion, nombre, id
 *
 * Se recomienda extender esta clase
 *
 */
public abstract class Item {

    private double precio;
    private String descripcion;
    private String nombre;
    private int id;

    public Item(double precio, String descripcion, String nombre, int id) {
        this.precio = precio;
        this.descripcion = descripcion;

        if (nombre == " ") {
            throw new NullPointerException("La variable nombre no puede estar vacia");
        }
        this.nombre = nombre;

        if (id == 0) {
            throw new NullPointerException("La variable nombre no puede estar vacia");
        }
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" + "precio=" + precio + ", descripcion=" + descripcion + ", nombre=" + nombre + ", id=" + id + '}';
    }

}
