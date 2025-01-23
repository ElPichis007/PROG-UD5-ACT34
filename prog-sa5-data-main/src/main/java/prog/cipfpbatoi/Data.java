/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cipfpbatoi;


import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.StringTokenizer;


/**
 *
 * @author batoi
 */
public class Data {
    
    private int dia;
    private int mes;
    private int any;


    // Inicializamos el objeto Calendar

    /**
     *  Constructor por defecto
     *  Inicializa una fecha a la fecha del sistema
     */
    public Data() {
        Calendar calendar = Calendar.getInstance();

        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.mes = calendar.get(Calendar.MONTH) + 1 ;
        this.any = calendar.get(Calendar.YEAR);
    }



    /**
     *  Inicializa la fecha a partir de los parámetros recibidos
     * @param dia
     * @param mes
     * @param any
     */
    public Data(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any= any;
    }

    /**
     * Inicializa la fecha a partir de otra pasada en formato String dd/mm/yyyy
     *
     * Deberemos trocearlas de forma que asignemos el día més y año a cada uno de los atributoe
     * @param fecha
     */
    public Data(String fecha) {

        StringTokenizer st = new StringTokenizer(fecha, "/");

        if (st.hasMoreTokens()) {
            this.dia = Integer.parseInt(st.nextToken());
        }
        if (st.hasMoreTokens()) {
            this.mes = Integer.parseInt(st.nextToken());
        }
        if (st.hasMoreTokens()) {
            this.any = Integer.parseInt(st.nextToken());
        }
    }

    /**
     * Modifica la fecha actual a partir de los datos pasados como argumento
     * @param dia
     * @param mes
     * @param any
     */
    public void set(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    /**
     * Creará y devolverá un nuevo objeto de la clase Data iniciado
     * con los valores que representa el objeto actual, es decir creará un clon exacto del objeto
     * actual.
     * @return
     */
    public Data copy() {
        return new Data(this.dia,this.mes,this.any);
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
    public void mostrarEnFormatES() {
        String fecha = String.format("%02d/%02d/%04d", this.dia, this.mes, this.any);
        System.out.println(fecha);
    }

    public void mostrarEnFormatGB() {
        String fecha = String.format("%04d-%02d-%02d", this.any, this.mes, this.dia);
        System.out.println(fecha);
    }

    /**
     * Muestra por pantalla la fecha en formato texto dd-mmmmm-yyyy
     */
    public void mostrarEnFormatText() {
        int dia = this.dia;
        int mes = this.mes;
        int any = this.any;

        String mesTexto = "";

        switch (mes) {
            case 1:
                mesTexto = "Gener";
                break;
            case 2:
                mesTexto = "Febrer";
                break;
            case 3:
                mesTexto = "Març";
                break;
            case 4:
                mesTexto = "Abril";
                break;
            case 5:
                mesTexto = "Maig";
                break;
            case 6:
                mesTexto = "Juny";
                break;
            case 7:
                mesTexto = "Juliol";
                break;
            case 8:
                mesTexto = "Agost";
                break;
            case 9:
                mesTexto = "Setembre";
                break;
            case 10:
                mesTexto = "Octubre";
                break;
            case 11:
                mesTexto = "Novembre";
                break;
            case 12:
                mesTexto = "Desembre";
                break;
            default:
                mesTexto = "Mes invàlid";
                break;
        }

        String fecha = String.format("%02d-%s-%04d", dia,mesTexto,any);
        System.out.println(fecha);
    }

    /**
     * Retorna un booleano indicando si la fecha del objeto es igual a la fecha pasada como
     * argumento
     *
     * @param fecha
     * @return boolean
     */
    public boolean isIgual(Data fecha) {
        return this.dia == fecha.dia && this.mes == fecha.mes && this.any == fecha.any;
    }

    /**
     * Retorna el dia correspondiente de la semana en formato String
     * @return String
     */
    public String getDiaSetmana() {
        int diesAny = getDiesTrascorregutsOrigen();
        int diaSemana = diesAny % 7;
        String nombreDia = "";

        switch (diaSemana){
            case 0 : nombreDia = "dilluns";
            break;
            case 1 : nombreDia = "dimarts";
            break;
            case 2: nombreDia = "dimercres";
            break;
            case 3 : nombreDia = "dijous";
            break;
            case 4 : nombreDia = "divendres";
            break;
            case 5 : nombreDia = "dissabte";
            break;
            case 6 : nombreDia = "diumenge";
            break;
            default:
                System.out.println("Escriba un dia de la semana del 1 al 7");
        }

        return nombreDia;
    }

    /**
     * Obtiene el número de la semana del año de la fecha actual
     * @return
     */
    public int getNumeroSetmana() {
        Data primerDiaAno = new Data(1, 1, any);
        String diaSemanaPrimerDia = primerDiaAno.getDiaSetmana();

        int diasDesdePrincipioAno = getDiesTrascorregutsAny();

        int numeroSemana = (diasDesdePrincipioAno + 7 - primerDiaAno.getDia()) / 7;

        if (diaSemanaPrimerDia.equals("diumenge") && numeroSemana == 0) {
            numeroSemana = 1;
        }

        return numeroSemana;

    }

    /**
     * Solo Festivo sábado o domingo
     * @return boolean
     */
    public boolean isFestiu() {
        String dia = getDiaSetmana();

        return dia.equalsIgnoreCase("diumenge") || dia.equalsIgnoreCase("dissabte");
    }

    /**
     * Crea una nueva fecha con un número de días adicionales a la fecha actual
     *
     * @param numDias
     * @return
     */
    public Data afegir(int numDias) {
        Data novaData = this.copy();
        novaData.dia += numDias;
        while (novaData.dia > getDiesMes(novaData.mes, novaData.any)) {
            novaData.dia -= getDiesMes(novaData.mes, novaData.any);
            novaData.mes++;
            if (novaData.mes > 12) {
                novaData.mes = 1;
                novaData.any++;
            }
        }
        return novaData;

    }

    /**
     * Crea una nueva fecha con un número de días anteriores a la fecha actual
     * @param numDias
     * @return 
     */
    public Data restar(int numDias){
        Data novaData = this.copy();
        novaData.dia -= numDias;
        while (novaData.dia <= 0) {
            novaData.mes--;
            if (novaData.mes <= 0) {
                novaData.mes = 12;
                novaData.any--;
            }
            novaData.dia += getDiesMes(novaData.mes, novaData.any);
        }
        return novaData;

    }
    
    /**
     * Determina si una fecha está compuesta por datos correctos
     * @return 
     */

    public boolean isCorrecta(){
        if (mes < 1 || mes > 12) {
            return false;
        }
        int diesMes = getDiesMes(mes, any);
        return dia >= 1 && dia <= diesMes;
    }

    
    /** Devuelve el valor absoluto de la diferencia de dias entre la fecha actual y la proporcionada
     * 
     * @param data
     * @return 
     */
    public long getDiesDeDiferencia(Data data) {
        int dias1 = data.getDiesTrascorregutsOrigen();
        int dias2 = getDiesTrascorregutsOrigen();

        return Math.abs(dias1 - dias2);

    }
    
    /**
     * Determina si una fecha es posterior a la fecha proporcionada
     * @param data
     * @return 
     */
    public boolean esPosteriorA(Data data) {
        int dias1 = data.getDiesTrascorregutsOrigen();
        int dias2 = getDiesTrascorregutsOrigen();

        if(dias2 > dias1){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Indica si el año pasado como argumento es bisiesto
     * Un año es bisiesto si es divisible por 4 a su vez 100 por 400
     *
     * @param any
     * @return boolean
     */
    public static boolean isBisiesto(int any){
        return any % 4 == 0 && any % 100 != 0 || any % 4 == 0 && any % 100 == 0 && any % 400 == 0;
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
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; // Meses con 31 días
            case 2:
                return (isBisiesto(any)) ? 29 : 28; // Febrero: 29 días si es bisiesto, 28 si no
            case 4: case 6: case 9: case 11:
                return 30; // Meses con 30 días
            default:
                System.out.println("Slecciona un mes del 1 al 12");
                return -1;
        }
    }

    /**
     * Calcula el número total de dias que tiene el año pasado como argumento
     *
     * @param any
     * @return int total dias any en curso
     */
    public static int getDiesAny(int any){

        if(isBisiesto(any)){
            return 366;
        } else {
            return 365;
        }
    }


    private int getDiesTrascorregutsOrigen() {
        int contadorDias = 0;

        for (int i = 1; i < this.any; i++) {
            contadorDias += getDiesAny(i);
        }

        return contadorDias + getDiesTrascorregutsAny();
    }

    private int getDiesTrascorregutsAny(){
        int contadorDias = 0;

        for (int j = 1; j < this.mes; j++) {
            contadorDias += getDiesMes(j, this.any);
        }

        contadorDias += this.dia - 1;

        return contadorDias;
    }





}
