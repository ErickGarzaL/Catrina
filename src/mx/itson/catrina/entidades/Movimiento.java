
package mx.itson.catrina.entidades;

import java.util.Date;
import mx.itson.catrina.enumeradores.Tipo;


public class Movimiento {
    private Tipo tipo;
    private Date fecha;
    private String descripcion;
    private double cantidad ;
            
    
    

    public Tipo getTipo() {
        return tipo;
    }
    /**
     * 
     * @param tipo Muestra el enumerador correspondiente.
     */

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }
    /**
     * 
     * @param fecha Nos representa la fecha de una lista.
     */

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
        
    }
    /**
     * 
     * @param descripcion Describre los movimientos de una cuenta bancaria.
     */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }
    /**
     * 
     * @param cantidad Nos representa las cantidades de una lista.
     */

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

   
}
