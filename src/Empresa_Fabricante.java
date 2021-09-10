public class Empresa_Fabricante {
    private String nombre;
    private String direccion;
    private int numroEmpleados;
    private Double precioSoporteTecnico;

    private Productos productos;

    public Empresa_Fabricante(String nombre, String direccion, int numroEmpleados, Double precioSoporteTecnico,Productos productos) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setNumroEmpleados(numroEmpleados);
        this.setPrecioSoporteTecnico(precioSoporteTecnico);
        this.setProductos(productos);
    }

    @Override
    public String toString() {
        return "Empresa_Fabricante{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numroEmpleados=" + numroEmpleados +
                ", precioSoporteTecnico=" + precioSoporteTecnico +
                ", productos=" + productos +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumroEmpleados() {
        return numroEmpleados;
    }

    public void setNumroEmpleados(int numroEmpleados) {
        this.numroEmpleados = numroEmpleados;
    }

    public Double getPrecioSoporteTecnico() {
        return precioSoporteTecnico;
    }

    public void setPrecioSoporteTecnico(Double precioSoporteTecnico) {
        this.precioSoporteTecnico = precioSoporteTecnico;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }
}
