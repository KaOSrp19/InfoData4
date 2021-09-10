import java.util.Date;

public abstract class Productos {
    private String nombre;
    private String codigo;
    private String modelo;

    private String paisOrigen;
    private Date fecha_de_fabricacion;

    public Productos(String nombre,String codigo, String modelo, String paisOrigen, Date fecha_de_fabricacion) {
        this.setNombre(nombre);
        this.setCodigo(codigo);
        this.setModelo(modelo);
        this.setPaisOrigen(paisOrigen);
        this.setFecha_de_fabricacion(fecha_de_fabricacion);
    }

    @Override
    public String toString() {
        return "Productos" +"| " + "Nombre='" + nombre + '\'' + ", Codigo='" + codigo + '\'' + ", Modelo='" + modelo + '\'' + ", Pais Origen='" + paisOrigen + '\'' + ", Fecha de fabricacion=" + fecha_de_fabricacion+", " ;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Date getFecha_de_fabricacion() {
        return fecha_de_fabricacion;
    }

    public void setFecha_de_fabricacion(Date fecha_de_fabricacion) {
        this.fecha_de_fabricacion = fecha_de_fabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //abstracto
    public abstract void estado();
}
