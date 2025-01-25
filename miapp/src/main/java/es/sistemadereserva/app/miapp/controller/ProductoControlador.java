package es.sistemadereserva.app.miapp.controller;

import es.sistemadereserva.app.miapp.model.ProductoFile;
import es.sistemadereserva.app.miapp.model.ProductoModelo;
import es.sistemadereserva.app.miapp.view.ProductoView;

public class ProductoControlador {
    ProductoFile productoFile;
    /**
     * inicializamos la clase de producto controlador
     */
    public ProductoControlador() { 
        productoFile = new ProductoFile();
    }

    /**
     * Metodo de agregar
     */
    public boolean add(ProductoView productoView){ 
        return false;
    }

    /**
     * metodo para obtener
     */
    public ProductoView getById(String codigo ) { 
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }
            ProductoModelo productoBuscar = new ProductoModelo(codigo);
            productoBuscar = productoFile.gProducto(productoBuscar);
            ProductoView productoView = new ProductoView(productoBuscar.getCodigo(),productoBuscar.getNombreCliente());
            return productoView;
    }
}
