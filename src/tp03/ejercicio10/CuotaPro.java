/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio10;

/**
 *
 * @author Windows 10
 */
public class CuotaPro {
  private String Codproducto, Nomproducto;
    private double PrecioUnitario;

    public CuotaPro(String Codigo, String Nombre, double PrecioUnitario) {
        this.Codproducto = Codigo;
        this. Nomproducto = Nombre;
        this.PrecioUnitario = PrecioUnitario;
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codproducto;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codproducto = Codigo;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return  Nomproducto;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this. Nomproducto = Nombre;
    }

    /**
     * @return the PrecioUnitario
     */
    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    /**
     * @param PrecioUnitario the PrecioUnitario to set
     */
    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }
   
    public void obtenerCuota (){
        
        System.out.println("El Codigo del producto : " + getCodigo());
        System.out.println("El Nombre del producto : " + getNombre());
        System.out.println("El Precio Unitario del producto : " + getPrecioUnitario());
       
    }  
}
