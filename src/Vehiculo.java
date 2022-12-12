/**
 * Almacena los atributos y métodos del objeto Vehiculo
 * @author Adrián
 * @version 1.0
 */
public class Vehiculo {

    /**
     * Crea el vehiculo otorgandole una matrícula y un tipo
     * @param tipo
     */
    Vehiculo(String tipo){
        this.matricula = crearMatricula();
        this.tipo = tipo;
    }

    private String tipo;

    private String matricula;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(){
        this.tipo = tipo;
    }

    public String getMatricula(){
        return matricula;
    }


    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    /**
     * Crea la secuencia de la matrícula
     * @return
     */
    public String crearMatricula() { //Crea la matrícula
        String[] letras = new String[]{"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "S", "T", "V", "W", "X", "Y", "Z"}; // Por qué no puedo hacerlo con Char
        String[] numeros = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String numero1 = numeros[(int) (Math.random() * 10 + 0)];
        String numero2 = numeros[(int) (Math.random() * 10 + 0)];
        String numero3 = numeros[(int) (Math.random() * 10 + 0)];
        String numero4 = numeros[(int) (Math.random() * 10 + 0)];

        String letra1 = letras[(int)(Math.random()*20+0)];
        String letra2 = letras[(int)(Math.random()*20+0)];
        String letra3 = letras[(int)(Math.random()*20+0)];

        String matricula= numero1 + numero2 + numero3 + numero4 + letra1 + letra2 + letra3;

        return matricula;
    }
}
