import java.util.Scanner;

public class Parking {

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

    public void introducirVehiculo(String tipo, int pos){

        switch (tipo) {

            case "Coche":
                Vehiculo vehiculo = new Vehiculo(tipo);

                plazas[pos] = vehiculo;
                System.out.println(plazas[pos].getTipo());
                System.out.println("Es un coche");
                break;

            case "Camión":
                if (plazas[pos+1] == null) {
                    Vehiculo vehiculo2 = new Vehiculo(tipo);
                    plazas[pos]= vehiculo2;
                    plazas[pos+1]= vehiculo2;
                }else{
                    System.out.println("Se requieren 2 plazas contiguas libres");
                }
        }
    }

    public void comprobarVehiculos(){
        for (int i = 0; i<plazas.length; i++){
            if (plazas[i] == null){
                System.out.println("Vacío");
            } else{
                System.out.println(plazas[i].getTipo()+" "+plazas[i].getMatricula());
            }
        }
    }

    public void comprobarPosicion(int pos){
        if (plazas[pos] == null){

            System.out.println("Plaza "+pos+" Vacío");
        } else{
            System.out.println(plazas[pos].getMatricula());
        }
    }

    public void eliminarVehiculo(int pos){
        if(plazas[pos].getTipo().equals("Camión")){
            plazas[pos]=null;
            plazas[pos+1]=null;
        }else{
            plazas[pos] = null;
        }
    }
}