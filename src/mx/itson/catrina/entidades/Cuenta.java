
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import java.util.List;
import mx.itson.catrina.enumeradores.Tipo;



/**
 *
 * @author Erick Francisco Garza Lopez
 */
public class Cuenta {
   private String producto ;
   private String cuenta ;
   private String clabe;
   private String moneda;
   private Cliente cliente;
   private List<Movimiento> movimientos;
   private Tipo tipo;
   
   /**
    * Adjunta archivo json 
    * @param json  formato de texto sencillo
    * @return Un archivo json
    */
      
   
  
   
     
   public Cuenta deserializar(String json){
        Cuenta cuenta =  new Cuenta();
        try{
            cuenta = new Gson().fromJson(json,Cuenta.class);
    }catch(Exception ex){
        System.err.print("Ocurrio un error" +  ex.getMessage());
    }
        return cuenta;
    }
   
   
   
 

    public String getProducto() {
        return producto;
    }
    
    /**
     * 
     * @param producto Texto de presentacion de programa.
     */

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCuenta() {
        return cuenta;
    }
    /**
     * 
     * @param cuenta Texto representativo de el numero de cuenta.
     */

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClabe() {
        return clabe;
    }
    /**
     * 
     * @param clabe Refleja la clave de una cuenta de banco.
     */

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getMoneda() {
        return moneda;
    }
    /**
     * 
     * @param moneda Muestra el tipo de moneda.
     */

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Cliente getCliente() {
        return cliente;
    }
    /**
     * 
     * @param cliente Refleja todos los atributos de la clase cliente.
     */

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }
    /**
     * 
     * @param movimientos  Refleja todos los atributos en lista de la clase Movimiento.
     */

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public Tipo getTipo() {
        return tipo;
    }
    /**
     * 
     * @param tipo  Refleja los enumeradores de la clase Tipo.
     */

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    

     
}
        
     
     
     
        
        
     
     


