import Interfaces.IReseteable;

import java.util.Date;

public class Impresoras extends Productos implements IReseteable {
    private int velocidad;

    public Impresoras(int velocidad, String nombre,String codigo, String modelo,String paisOrigen, Date fecha_de_fabricacion) {
        super(nombre,codigo,modelo,paisOrigen,fecha_de_fabricacion);
        this.setVelocidad(velocidad);
    }


    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void reset() {
        System.out.println("Reseteando Impresora...");
    }

    @Override
    public void estado() {
        System.out.println("Paginas Impresea: " + 152400);
    }
}
