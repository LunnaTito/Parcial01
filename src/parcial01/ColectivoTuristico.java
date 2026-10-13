package parcial01;

public class ColectivoTuristico extends Vehiculo {

    private int cantidadPisos;

    public ColectivoTuristico(String patente, String marca, int capacidadPasajeros, int anioFabricacion, int cantidadPisos) {

        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.cantidadPisos = cantidadPisos;
    
    }
    
    public int getCantidadPisos(){
        return cantidadPisos;
    }
    public void setCantidadPisos(int cantidadPisos){
        if(cantidadPisos == 1 || cantidadPisos == 2){
            this.cantidadPisos = cantidadPisos;
        }else{
            System.out.println("ERROR. Cantidad incorrecta, debe ser 1 o 2.");
        }
    }
    @Override
    public void mostrarDatos(){
        System.out.println("------------------------------------");
        System.out.println("Colectivo turistico");
        System.out.println("Patente: " + getPatente());
        System.out.println("Marca: " + getMarca());
        System.out.println("Capacidad de pasajeros: " + getCapacidadPasajeros());
        System.out.println("Anio de fabricacion: "+ getAnioFabricacion());
        System.out.println("Cantidad de pisos: " + cantidadPisos);
    }
    @Override
    public void realizarServicio(){
        System.out.println("Realizando servivcio turistico con Colectivo");
    }
}
