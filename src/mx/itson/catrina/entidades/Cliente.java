
package mx.itson.catrina.entidades;


public class Cliente {
    private String codigo;
    private String nombre;
    private String domicilio;
    private String ciudad;
    private String rfc;
    private String cp;
   
    
 

    public String getCodigo() {
        return codigo;
    }
    
    /**
     * 
     * @param codigo Almacena un numero codigo 
     */

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre Representacion del nombre de usuario
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }
    /**
     * 
     * @param domicilio Represeta el domicilio.
     */

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
   

    public String getCiudad() {
        return ciudad;
    }
    /**
     * 
     * @param ciudad  Represeta el ciudad.
     */

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRfc() {
        return rfc;
    }
    /**
     * 
     * @param rfc  Represeta el RFC.
     */

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCp() {
        return cp;
    }
     /**
      * 
      * @param cp  Represeta el codigo postal.
      */

    public void setCp(String cp) {
        this.cp = cp;
    }

 
    
    
}
