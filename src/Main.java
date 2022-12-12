import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);

        System.out.println("De qué tamaño será el parking?");
        int tamano= guardar.nextInt();

        Parking parking = new Parking(tamano);

        int menu=0;



        do{
            System.out.println("\n"+"Que desea hacer"+"\n"+"0. Salir"+"\n"+"1. Introducir vehiculo"+"\n"+"2. Consultar plazas"+"\n"+"3. Localizar por posición"+"\n"+"4. Eliminar por posición"); // Acciones a elegir
            menu = guardar.nextInt();

            switch (menu){

                case 1:
                    System.out.println("\n"+"Plazas actuales");
                    parking.comprobarVehiculos();
                    // Las dos primeras líneas son un prevew
                    System.out.println("Introduciendo vehiculo"+"\n"+"Qué tipo de vehiculo desea introducir?  "+"Coche"+"   "+"Camión");
                    String tipo = guardar.next();
                    System.out.println("\n"+"En qué posición desea introducirlo?");
                    int pos = guardar.nextInt();
                    parking.introducirVehiculo(tipo,pos);
                    break;
                case 2:
                    System.out.println("\n"+"Plazas actuales");
                    parking.comprobarVehiculos();
                    break;

                case 3:
                    System.out.println("\n"+"Localizando por posición"+"\n"+"Qué posicion desea consultar?");
                    pos= guardar.nextInt();
                    parking.comprobarPosicion(pos);
                    break;

                case 4:
                    System.out.println("Plazas actuales");
                    parking.comprobarVehiculos();
                    // Las dos primeras líneas son un prevew
                    System.out.println("\n"+"Que posición desea eliminar?"+"\n"+"Para eliminar vehiculos grandes seleccione su primera posición");
                    pos = guardar.nextInt();
                    parking.eliminarVehiculo(pos);
                    break;

                default:
                    menu=0;
            }

        } while (menu != 0);

    }

}
