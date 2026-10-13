package parcial01;

import java.util.Scanner;
import java.util.ArrayList;

public class Parcial01 {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        int opcion = 0;
        

        String patente = "";
        String marca = "";
        int capacidadPasajeros = 0;
        int anioFabricacion = 0;
        int cantidadPisos = 0;
        boolean aireAcondicionado;
        String tipoMotor = "";
        int tipoVehiculo = 0;
        int opcionAireAcondicionado = 0;
        int opcionTipoMotor = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("-------------------- MENU --------------------");
            System.out.println("1. Ingresar vehiculo");
            System.out.println("2. Mostrar todos los vehiculos");
            System.out.println("3. Realizar servicios turisticos");
            System.out.println("4. Buscar vehiculo por patente");
            System.out.println("5. Mostrar vehiculos con capacidad mayor a un valor ingresado");
            System.out.println("6. Mostrar vehiculos ordenados por anio de fabricacion descendente");
            System.out.println("7. Mostrar vehiculos ordenados por capacidad de pasajeros descendente");
            System.out.println("8. Salir");

            System.out.println("Seleccione una opcion: ");
            opcion = leerEnteros(input);

            switch (opcion) {
                case 1:
                    System.out.println("Complete los datos.");

                    System.out.println("- Ingrese la patente: ");
                    patente = input.next();
                    while (patente.isBlank() || patenteExistente(vehiculos, patente)) {
                        System.out.println("ERROR. La patente esta vacia o ya existe");
                        System.out.println("- Ingrese la patente: ");
                        patente = input.next();
                    }

                    System.out.println("- Ingrese la marca: ");
                    marca = input.next();
                    while (marca.isBlank()) {
                        System.out.println("ERROR. La marca es invalida");
                        System.out.println("- Ingrese la marca: ");
                        marca = input.next();
                    }

                    System.out.println("- Ingrese capacidad de pasajeros: ");
                    capacidadPasajeros = leerEnteros(input);
                    while (capacidadPasajeros <= 0) {
                        System.out.println("ERROR. La capacidad debe ser mayor a 0");
                        System.out.println("- Ingrese capacidad de pasajeros: ");
                        capacidadPasajeros = leerEnteros(input);
                    }

                    System.out.println("- Ingrese el anio de fabricacion: ");
                    anioFabricacion = leerEnteros(input);
                    while (anioFabricacion < 1990 || anioFabricacion > 2026) {
                        System.out.println("ERROR. Anio de fabricacion invalido");
                        System.out.println("- Ingrese el anio de fabricacion: ");
                        anioFabricacion = leerEnteros(input);
                    }

                    System.out.println("Elija el tipo de vehiculo: ");
                    System.out.println("1- Colectivos turisticos");
                    System.out.println("2- Van ejecutivas");
                    System.out.println("3- Lanchas turisticas");
                    tipoVehiculo = leerEnteros(input);

                    while (tipoVehiculo < 1 || tipoVehiculo > 3) {
                        System.out.println("ERROR. Tipo de vehiculo incorrecto.");
                        System.out.println("Ingrese un tipo de vehiculo valido.");
                        System.out.println("1- Colectivos turisticos");
                        System.out.println("2- Van ejecutivas");
                        System.out.println("3- Lanchas turisticas");
                        tipoVehiculo = leerEnteros(input);
                    }
                    switch (tipoVehiculo) {
                        case 1:
                            System.out.println("----------------------------------------------");
                            System.out.println("COLECTIVOS TURISTICOS");
                            System.out.println("----------------------------------------------");
                            System.out.println("Ingrese la cantidad de pisos(1 o 2): ");
                            cantidadPisos = leerEnteros(input);

                            while (cantidadPisos != 1 && cantidadPisos != 2) {
                                System.out.println("ERROR. Ingrese una cantidad de pisos valida");
                                System.out.println("Ingrese la cantidad de pisos(1 o 2): ");
                                cantidadPisos = leerEnteros(input);
                            }

                            ColectivoTuristico colectivo = new ColectivoTuristico(patente, marca, capacidadPasajeros, anioFabricacion, cantidadPisos);
                            vehiculos.add(colectivo);
                            System.out.println("Se ingreso correctamente el colectivo!");

                            break;
                        case 2:
                            System.out.println("----------------------------------------------");
                            System.out.println("VAN EJECUTIVAS ");
                            System.out.println("----------------------------------------------");
                            System.out.println("Indique si la van tiene aire acondicionado: ");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            opcionAireAcondicionado = leerEnteros(input);

                            while (opcionAireAcondicionado != 1 && opcionAireAcondicionado != 2) {
                                System.out.println("ERROR. Ingrese una opcion correcta");
                                System.out.println("Indique si la van tiene aire acondicionado: ");
                                System.out.println("1. Si");
                                System.out.println("2. No");
                                opcionAireAcondicionado = leerEnteros(input);
                            }
                            if (opcionAireAcondicionado == 1) {
                                aireAcondicionado = true;
                            } else {
                                aireAcondicionado = false;
                            }

                            VanEjecutiva van = new VanEjecutiva(patente, marca, capacidadPasajeros, anioFabricacion, aireAcondicionado);
                            vehiculos.add(van);
                            System.out.println("Se ingreso correctamente la Van ejecutiva!");

                            break;
                        case 3:
                            System.out.println("----------------------------------------------");
                            System.out.println("LANCHAS TURISTICAS");
                            System.out.println("----------------------------------------------");
                            System.out.println("Indique que tipo de motor tiene:");
                            System.out.println("1. Nafta");
                            System.out.println("2. Diesel");
                            System.out.println("3. Electrico");
                            opcionTipoMotor = leerEnteros(input);

                            while (opcionTipoMotor < 1 || opcionTipoMotor > 3) {
                                System.out.println("ERROR.Ingrese un tipo de motor valido");
                                opcionTipoMotor = leerEnteros(input);
                            }
                            if (opcionTipoMotor == 1) {
                                tipoMotor = "NAFTA";
                            } else if (opcionTipoMotor == 2) {
                                tipoMotor = "DIESEL";
                            } else {
                                tipoMotor = "ELECTRICO";
                            }

                            LanchaTuristica lancha = new LanchaTuristica(patente, marca, capacidadPasajeros, anioFabricacion, tipoMotor);
                            vehiculos.add(lancha);
                            System.out.println("Se ingreso correctamente la Lancha turistica");

                            break;
                    }
                    break;
                case 2:
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehiculos registrados");
                    } else {
                        for (Vehiculo vehiculo : vehiculos) {
                            vehiculo.mostrarDatos();
                        }
                    }
                    break;
                case 3:
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay ningun vehiculo registrado para realizar servicio");
                    } else {
                        for (Vehiculo vehiculo : vehiculos) {
                            vehiculo.realizarServicio();
                        }
                    }
                    break;
                case 4:
                    buscarVehiculo(input, vehiculos);
                    break;
                case 5:
                    mostrarVehiculos(input, vehiculos);
                    break;
                case 8:
                    System.out.println("Saliendo del programa ...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }
        } while (opcion != 8);
    }

    public static boolean patenteExistente(ArrayList<Vehiculo> vehiculos, String patente) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                return true;
            }
        }
        return false;
    }

    public static int leerEnteros(Scanner input) {
        int numero = 0;
        boolean valido = false;

        while (valido == false) {
            try {
                numero = Integer.parseInt(input.next());
                valido = true;
            } catch (NumberFormatException error) {
                System.out.println("ERROR. Debe ingresar un numero");
            }
        }
        return numero;
    }

    public static void buscarVehiculo(Scanner input, ArrayList<Vehiculo> vehiculos) {
        String patente = "";
        boolean patenteEncontrada = false;

        if (vehiculos.isEmpty()) {
            System.out.println("No se registro ningin vehiculo");
        } else {
            System.out.println("Ingrese la patente que busca: ");
            patente = input.next();
            patenteEncontrada = false;
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getPatente().equals(patente)) {
                    vehiculo.mostrarDatos();
                    patenteEncontrada = true;
                }
            }
            if (patenteEncontrada == false) {
                System.out.println("No se encontro la patente");
            }
        }
    }

    public static void mostrarVehiculos(Scanner input, ArrayList<Vehiculo> vehiculos) {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos registrados.");
        } else {
            int capacidad = 0;
            System.out.println("Ingrese una capacidad:");
            capacidad = leerEnteros(input);
            boolean encontrado = false;

            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getCapacidadPasajeros() > capacidad) {
                    vehiculo.mostrarDatos();
                    encontrado = true;
                }
            }
            if (encontrado == false) {
                System.out.println("No hay vehiculos con capacidad mayor a la ingresada.");
            }
        }
    }
}
