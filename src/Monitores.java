import Interfaces.IReseteable;

import javax.xml.crypto.Data;
import java.util.Date;

public class Monitores extends Productos implements IReseteable {
    private int definicion_maxima;

    public Monitores(int definicion_maxima, String nombre, String codigo, String modelo, String paisOrigen, Date fecha_de_fabricacion) {
        super(nombre,codigo,modelo,paisOrigen,fecha_de_fabricacion);
        this.setDefinicion_maxima(definicion_maxima);
    }

    public int getDefinicion_maxima() {
        return definicion_maxima;
    }

    public void setDefinicion_maxima(int definicion_maxima) {
        this.definicion_maxima = definicion_maxima;
    }

    @Override
    public void reset() {
        System.out.println("Reseteando Monitor...");
    }

    @Override
    public void estado() {
        System.out.println("Brillo: " + 75+ "%");
    }
}
