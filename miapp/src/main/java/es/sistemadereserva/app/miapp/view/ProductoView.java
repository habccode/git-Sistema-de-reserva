package es.sistemadereserva.app.miapp.view;
import java.util.Objects;

public class ProductoView {
    String codigo;
    String nombreCliente;

    /**
     * Constructor
     * @param codigo
     * @param nombreCliente
     */
    public ProductoView (String codigo, String nombreCliente) {
        this.codigo = codigo;
        this.nombreCliente = nombreCliente;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + codigo + "'" +
            ", nombreCliente='" + nombreCliente + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductoView)) {
            return false;
        }
        ProductoView productoView = (ProductoView) o;
        return Objects.equals(codigo, productoView.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
    
}
