package com.edp.ProyectoFinalJava.moduls;

public class ClientePremium implements Cliente{
    private String nombre;

    public ClientePremium(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void realizarCompra(Vendible producto) {
        // Implementación de compra para un cliente premium
    }
}
