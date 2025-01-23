package prog.cipfpbatoi;

import java.util.Scanner;

public class GestorIO {
    private static final Scanner scanner = new Scanner(System.in);

    public static int llegirEnter(String missatge) {
        int valor = 0;
        boolean valid = false;
        do {
            System.out.print(missatge);
            if (scanner.hasNextInt()) {
                valor = scanner.nextInt();
                valid = true;
            } else {
                System.out.println("Valor no vàlid. Introdueix un número enter.");
                scanner.next(); // Limpiar el buffer
            }
        } while (!valid);
        return valor;
    }

    public static String llegirText(String missatge) {
        System.out.print(missatge);
        return scanner.nextLine();
    }

    public static boolean solicitarConfirmacio(String missatge) {
        String resposta;
        do {
            System.out.print(missatge + " (s/n): ");
            resposta = scanner.nextLine().toLowerCase();
        } while (!resposta.equals("s") && !resposta.equals("n"));
        return resposta.equals("s");
    }

    public static void tancar() {
        scanner.close();
    }
}