package com.edp.ProyectoFinalJava.moduls;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private Cliente cliente;
    private List<Vendible> productos = new ArrayList<>();

    public CarritoCompra(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Vendible producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Vendible producto : productos) {
            total += producto.calcularPrecio();
        }
        return total;
    }
}
