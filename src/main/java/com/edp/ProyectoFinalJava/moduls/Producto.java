package com.edp.ProyectoFinalJava.moduls;

public class Producto implements Vendible{
    private int id;
    private String nombre;
    private double precioBase;

    public Producto(String nombre, double precioBase, int id) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
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

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecio() {
        return precioBase;
    }
}
