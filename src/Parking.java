import java.util.Scanner;

/**
 * Almacena los atributos y métodos del objeto Parking
 * @author Adrián
 * @version 1.0
 */
public class Parking {
    /**
     * Crea el array que almacena los objetos vehiculo con un tamaño determinado por el usuario
     * @param tamano
     */
    Parking(int tamano){
        this.tamano = tamano;
        this.plazas= new Vehiculo[this.tamano];
    }
    private int tamano;

    public Vehiculo [] plazas;



    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano){
        this.tamano = tamano;
    }

    /**
     * Introduce vehiculos en el parking si cumple ciertos requisitos
     * @param tipo
     * @param pos
     */
    public void introducirVehiculo(String tipo, int pos){

        switch (tipo) {

            case "Coche": // Comprueba si la plaza existe y está ocupada o no, en caso de que no, aparca el vehiculo

                if(pos>=tamano){
                    System.out.println("Introduzca un número de plaza válido");
                    break;
                }
                if (plazas[pos] != null){
                    System.out.println("Esta plaza ya está ocupada");
                    break;
                }
                Vehiculo vehiculo = new Vehiculo(tipo);
                plazas[pos] = vehiculo;
                break;

            case "Camión": // Comprueba si tanto la plaza elegida como la siguiente existen y están ocupadas o no, en caso de que no, aparca el vehiculo
                if(pos>=tamano-1){
                    System.out.println("Se requieren 2 plazas contiguas libres y un número de plaza correcto");
                    break;
                }
                if (plazas[pos] != null | plazas[pos+1] != null){
                    System.out.println("Esta plaza ya está ocupada o no existe espacio suficiente");
                    break;
                }
                if (plazas[pos+1] == null) {
                    Vehiculo vehiculo2 = new Vehiculo(tipo);
                    plazas[pos]= vehiculo2;
                    plazas[pos+1]= vehiculo2;
                }else{
                    System.out.println("Se requieren 2 plazas contiguas libres");
                }
        }
    }

    /**
     * Comprueba todas las posiciones
     */
    public void comprobarVehiculos(){
        for (int i = 0; i<plazas.length; i++){
            if (plazas[i] == null){
                System.out.println("Vacío");
            } else{
                System.out.println(plazas[i].getTipo()+" "+plazas[i].getMatricula());
            }
        }
    }

    /**
     * Comprueba la posición elegida
     * @param pos
     */
    public void comprobarPosicion(int pos){
        if (plazas[pos] == null){

            System.out.println("Plaza "+pos+" Vacío");
        } else{
            System.out.println(plazas[pos].getMatricula());
        }
    }

    /**
     * Elimina el vehiculo ubicado en la posición
     * @param pos
     */
    public void eliminarVehiculo(int pos){
        if(plazas[pos].getTipo().equals("Camión")){
            plazas[pos]=null;
            plazas[pos+1]=null;
        }else{
            plazas[pos] = null;
        }
    }
}