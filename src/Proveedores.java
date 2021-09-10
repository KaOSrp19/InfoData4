
import java.util.Date;

public class Proveedores {
    private String nif;
    private String direccion;
    private int cantidadProductos;
    private Productos productos;
    private Date fecha_de_entrega;

    public Proveedores(String nif, String direccion, int cantidadProductos, Productos productos,Date fecha_de_entrega) {
        this.setNif(nif);
        this.setDireccion(direccion);
        this.setCantidadProductos(cantidadProductos);
        this.setProductos(productos);
        this.setFecha_de_entrega(fecha_de_entrega);
    }

    @Override
    public String toString() {
        return "Proveedores{" +
                "nif='" + nif + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cantidadProductos=" + cantidadProductos +
                ", productos=" + productos +
                ", fecha_de_entrega=" + fecha_de_entrega +
                '}';
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Date getFecha_de_entrega() {
        return fecha_de_entrega;
    }

    public void setFecha_de_entrega(Date fecha_de_entrega) {
        this.fecha_de_entrega = fecha_de_entrega;
    }
}
