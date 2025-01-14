/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cipfpbatoi;


/**
 *
 * @author batoi
 */
public class Data {
    
    private int dia;
    private int mes;
    private int any;

    /**
     *  Constructor por defecto
     *  Inicializa una fecha a la fecha del sistema
     */
    public Data() {
    }

    /**
     *  Inicializa la fecha a partir de los parámetros recibidos
     * @param dia
     * @param mes
     * @param any
     */
    public Data(int dia, int mes, int any) {
    }

    /**
     * Inicializa la fecha a partir de otra pasada en formato String dd/mm/yyyy
     *
     * Deberemos trocearlas de forma que asignemos el día més y año a cada uno de los atributoe
     * @param fecha
     */
    public Data(String fecha) {
    }

    /**
     * Modifica la fecha actual a partir de los datos pasados como argumento
     * @param dia
     * @param mes
     * @param any
     */
    public void set(int dia, int mes, int any) {
        
    }

    /**
     * Creará y devolverá un nuevo objeto de la clase Data iniciado
     * con los valores que representa el objeto actual, es decir creará un clon exacto del objeto
     * actual.
     * @return
     */
    public Data copy() {
        return null;
    }

    /**
     * (Ya implementado) Devuelve el día de la semana que representa por la Data actual
     * @return @dia
     */
    public int getDia() {
        return this.dia;
    }

    /**
     * (Ya implementado) Devuelve el mes que representa la Data actual
     * @return @mes
     */
    public int getMes(){
        return this.mes;
    }

    /**
     * (Ya implementado) Devuelve el año que representa la Data actual
     * @return @mes
     */
    public int getAny(){
        return this.any;
    }

    /**
     * Muestra por pantalla la fecha en formato español dd-mm-yyyy
     */
    public void mostrarEnFormatES()  {
        
    }

    /**
     * Muestra por pantalla la fecha en formato inglés yyyy-mm-dd
     */
    public void mostrarEnFormatGB() {
        
    }

    /**
     * Muestra por pantalla la fecha en formato texto dd-mmmmm-yyyy
     */
    public void mostrarEnFormatText() {
        
    }

    /**
     * Retorna un booleano indicando si la fecha del objeto es igual a la fecha pasada como
     * argumento
     *
     * @param fecha
     * @return boolean
     */
    public boolean isIgual(Data fecha) {
        return false;
    }

    /**
     * Retorna el dia correspondiente de la semana en formato String
     * @return String
     */
    public String getDiaSetmana() {
        return null;
    }
    
    /**
     * Solo Festivo sábado o domingo
     * @return boolean
     */
    public boolean isFestiu() {
        return false;
    }

    /**
     * Obtiene el número de la semana del año de la fecha actual
     * @return 
     */
    public int getNumeroSetmana() {
        return -1;

    }

    /**
     * Crea una nueva fecha con un número de días adicionales a la fecha actual
     *
     * @param numDias
     * @return
     */
    public Data afegir(long numDias) {

        return null;
    }

    /**
     * Crea una nueva fecha con un número de días anteriores a la fecha actual
     * @param numDias
     * @return 
     */
    public Data restar(long numDias){
        return null;
    }
    
    /**
     * Determina si una fecha está compuesta por datos correctos
     * @return 
     */

    public boolean isCorrecta(){
        return false;
    }

    
    /** Devuelve el valor absoluto de la diferencia de dias entre la fecha actual y la proporcionada
     * 
     * @param data
     * @return 
     */
    public long getDiesDeDiferencia(Data data) {
        return -1L;
    }
    
    /**
     * Determina si una fecha es posterior a la fecha proporcionada
     * @param data
     * @return 
     */
    public boolean esPosteriorA(Data data) {
        return false;
    }

    /**
     * Indica si el año pasado como argumento es bisiesto
     * Un año es bisiesto si es divisible por 4 a su vez 100 por 400
     *
     * @param any
     * @return boolean
     */
    public static boolean isBisiesto(int any){
        return false;
    }

    /**
     *  Calcula el número de días que tiene el mes representado por la fecha actual
     *
     * @param mes
     * @param any
     *  @return int total dias mes en curso
     *
     */
    public static int getDiesMes(int mes, int any) {

        return -1;
    }

    /**
     * Calcula el número total de dias que tiene el año pasado como argumento
     *
     * @param any
     * @return int total dias any en curso
     */
    public static int getDiesAny(int any){
        return -1;
    }
}
