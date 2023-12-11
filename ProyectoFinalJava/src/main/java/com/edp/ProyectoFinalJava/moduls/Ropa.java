package com.edp.ProyectoFinalJava.moduls;

public class Ropa extends Producto {
    private String talla;
    private String img;
    public Ropa(String nombre, double precioBase,int id, String talla, String img) {
        super(nombre, precioBase, id);
        this.talla = talla;
        this.img = img;
    }

    public String getTalla() {
        return talla;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
