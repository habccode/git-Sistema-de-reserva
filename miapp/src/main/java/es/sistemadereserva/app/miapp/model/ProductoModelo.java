package es.sistemadereserva.app.miapp.model;

public class ProductoModelo {
    String codigo;
    String nombreCliente;

    /**
     * Contructor del codigo "ID"
     */
    public ProductoModelo (String codigo) {
        this.codigo = codigo;
    }
    /**
     * Constructor con elementos
     * @param nombreCliente
     * @param codigo
     */
    public ProductoModelo (String nombreCliente, String codigo) { 
        this.codigo = codigo;
        this.nombreCliente = nombreCliente;
    }
    /**
     * only getters
     */

    public String getCodigo() {
        return this.codigo;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

}
