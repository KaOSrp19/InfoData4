public abstract class Alquiler {
    private String codigo;
    private double precio_por_hora;


    private Monitores monitores;
    private HDD hdd;

    public Alquiler(String codigo, double precio_por_hora, Monitores monitores, HDD hdd) {
        this.setCodigo(codigo);
        this.setPrecio_por_hora(precio_por_hora);
        this.setMonitores(monitores);
        this.setHdd(hdd);
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "codigo='" + codigo + '\'' +
                ", precio_por_hora=" + precio_por_hora +
                ", monitores=" + monitores +
                ", hdd=" + hdd +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio_por_hora() {
        return precio_por_hora;
    }

    public void setPrecio_por_hora(double precio_por_hora) {
        this.precio_por_hora = precio_por_hora;
    }

    public Monitores getMonitores() {
        return monitores;
    }

    public void setMonitores(Monitores monitores) {
        this.monitores = monitores;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }
}
