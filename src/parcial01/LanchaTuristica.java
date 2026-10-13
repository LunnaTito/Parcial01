package parcial01;

/**
 *
 * @author Luna
 */
public class LanchaTuristica extends Vehiculo{
    
    private String tipoMotor;
    
    public LanchaTuristica(String patente, String marca, int capacidadPasajeros, int anioFabricacion, String tipoMotor){
        
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.tipoMotor = tipoMotor;
    }
    
    public String getTipoMotor(){
        return tipoMotor;
    }
    
    public void setTipoMotor(String tipoMotor){
        if(tipoMotor != null){
            if(tipoMotor.equals("NAFTA") || tipoMotor.equals("DIESEL") || tipoMotor.equals("ELECTRICO")){
                this.tipoMotor = tipoMotor;    
            }else{
                System.out.println("ERROR. Tipo de motor invalido");
            }                        
        }else{
            System.out.println("ERROR. Tipo de motor invalido");
        }       
    }
    @Override
    public void mostrarDatos(){
        System.out.println("------------------------------------");
        System.out.println("Lancha turistica");
        System.out.println("Patente: " + getPatente());
        System.out.println("Marca: " + getMarca());
        System.out.println("Capacidad de pasajeros: " + getCapacidadPasajeros());
        System.out.println("Anio de fabricacion: "+ getAnioFabricacion());
        System.out.println("Tipo de motor: " + tipoMotor);
    }
    @Override
    public void realizarServicio(){
        System.out.println("Realizando servicio turistico con Lancha");
    }
}
