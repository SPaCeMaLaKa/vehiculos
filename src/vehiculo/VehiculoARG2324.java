
package vehiculo;
/**
 * 
 * @author Alejandro Román García
 * @since 28-04-2024
 * @version 1.0
 */
public class VehiculoARG2324 {

    
    /**
     * Atributo que indica el nombre del atributo
     */
    private String nombre;
    /**
     * Atributo que indica el nombre del precio
     */
    private double precio;
      /**
     * Atributo que indica el nombre del precio
     */
    private double precioIVA;
      /**
     * Atributo que indica el nombre del precioIVA
     */
    private int stock;
    /**
     * Atributo que indica el stock
     */

    /* Constructor vacío */
    public VehiculoARG2324 ()
    {
    }
    
    /**
     * Constructor con parámetro
     * 
     * @param nom Inidica el nombre del vehículo
     * @param precio Inidica el precio del vehículo
     * @param stock Inidica el stock del vehículo
     */
    public VehiculoARG2324 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
    /**
     *  Método para asignar el nombre del vehiculo
     * @param nom Indica el nombre
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método que me devuelve el nombre del vehiculo
     * @return 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return 
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
     
     /**
      * Método para comprar vehiculos
      * @param cantidad indica la cantidad de vehículos que compra
      * @throws Exception 
      */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }
/**
 * 
 * @param cantidad indica la cantidad de vehículos que vende
 * @throws Exception 
 */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
/**
 * Método para seleccionar el atributo nombre
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Método de acceso para el atributo nombre
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Método para seleccionar el atributo precio
 * @return 
 */
    public double getPrecio() {
        return precio;
    }
/**
 * Método de acceso para el atributo precio
 * @param nombre 
 */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
/**
 * Método para seleccionar el atributo precio IVA
 * @return 
 */
    public double getPrecioIVA() {
        return precioIVA;
    }
/**
 * Método de acceso para el atributo precioIVA
 * @param nombre 
 */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }
/**
 * Método para seleccionar el atributo stock
 * @return 
 */
    public int getStock() {
        return stock;
    }
/**
 * Método de acceso para el atributo stock
 * @param nombre 
 */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}  
   
    

