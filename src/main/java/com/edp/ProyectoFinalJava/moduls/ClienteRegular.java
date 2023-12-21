package com.edp.ProyectoFinalJava.moduls;

public class ClienteRegular implements Cliente{
    private String nombre;

    public ClienteRegular(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void realizarCompra(Vendible producto) {
        // Implementación de compra para un cliente regular
    }
}
