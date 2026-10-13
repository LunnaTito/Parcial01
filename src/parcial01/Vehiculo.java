package parcial01;

/**
 *
 * @author Luna
 */
public abstract class Vehiculo {
    
    private String patente;
    private String marca;
    private int capacidadPasajeros;
    private int anioFabricacion;
    
    
    public Vehiculo(String patente, String marca, int capacidadPasajeros, int anioFabricacion){
    this.patente = patente;
    this.marca = marca;
    this.capacidadPasajeros = capacidadPasajeros;
    this.anioFabricacion = anioFabricacion;
    }
    
    public String getPatente(){
        return patente;
    }
    public String getMarca(){
        return marca;
    }
    public int getCapacidadPasajeros(){
        return capacidadPasajeros;
    }
    public int getAnioFabricacion(){
        return anioFabricacion;
    }
    
    public void setPatente(String patente){
        if (patente != null && !patente.isBlank()){
            this.patente = patente;
        }else{
            System.out.println("ERROR. Patente invalida");
        }
        
    }
    public void setMarca(String marca){
        if (marca != null && !marca.isBlank()){
            this.marca = marca;
        }else{
            System.out.println("ERROR. Marca invalida");
        }
    }
    
    public void setCapacidadPasajeros(int capacidadPasajeros){
        
        if (capacidadPasajeros > 0){
            this.capacidadPasajeros = capacidadPasajeros;  
        }else {
            System.out.println("ERROR. Capacidad incorrecta, ingrese un numero mayor a 0.");
        }
    }
    public void setAnioFabricacion(int anioFabricacion){
        
        if (anioFabricacion >= 1990 && anioFabricacion <= 2026){
            this.anioFabricacion = anioFabricacion;
            
        }else {
            System.out.println("ERROR. Año invalido, ingrese un año dentro del rango.");
        }
    }
    public abstract void mostrarDatos();
    
    public abstract void realizarServicio();
    
}






