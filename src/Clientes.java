import javax.xml.crypto.Data;
import java.util.Date;

public class Clientes {
    private int dni;
    private int telefono;
    private String domicilio;
    private Date fechaCompra;

    private Alquiler alquiler;
    private Productos productos;

    public Clientes(int dni, int telefono, String domicilio, Date fechaCompra, Alquiler alquiler, Productos productos) {
        this.setDni(dni);
        this.setTelefono(telefono);
        this.setDomicilio(domicilio);
        this.setFechaCompra(fechaCompra);
        this.setAlquiler(alquiler);
        this.setProductos(productos);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }
}
