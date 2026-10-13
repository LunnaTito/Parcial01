package parcial01;

/**
 *
 * @author Luna
 */
public class VanEjecutiva extends Vehiculo{
    private boolean aireAcondicionado;
    
    public VanEjecutiva(String patente, String marca, int capacidadPasajeros, int anioFabricacion, boolean aireAcondicionado){
        
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.aireAcondicionado = aireAcondicionado;
    }
    public boolean getAireAcondicionado(){
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado){
        this.aireAcondicionado = aireAcondicionado;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("------------------------------------");
        System.out.println("Van Ejecutiva");
        System.out.println("Patente: " + getPatente());
        System.out.println("Marca: " + getMarca());
        System.out.println("Capacidad de pasajeros: " + getCapacidadPasajeros());
        System.out.println("Anio de fabricacion: "+ getAnioFabricacion());
        System.out.println("Aire acondicionado: " + aireAcondicionado);
    }
    @Override
    public void realizarServicio(){
        System.out.println("Realizando servicio turistico con Van ejecutiva");
    }
}
