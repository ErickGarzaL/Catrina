/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import java.util.List;



/**
 *
 * @author franc
 */
public class Cuenta {
   private String producto ;
   private String cuenta ;
   private String clabe;
   private String moneda;
   private Cliente cliente;
    private List<Movimiento> movimientos;
     
     
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

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}
