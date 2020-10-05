package bracket;

import java.util.Scanner;
import java.util.Stack;

public class BRACKETS {

    static char[] apretura = {'(', '[', '{'};
    static char[] cerrar = {')', ']', '}'};

    static boolean apretura(char c) {
        for (int i = 0; i < apretura.length; i++) {
            if (apretura[i] == c) {
                return true;
            }

        }
        return false;
    }

    static char seleccion(char c) {
        for (int i = 0; i < apretura.length; i++) {
            if (apretura[i] == c) {
                return cerrar[i];
            }

        }
        for (int i = 0; i < cerrar.length; i++) {
            if (cerrar[i] == c) {
                return apretura[i];
            }
        }
        return ' ';

    }

    public static void main(String[] args) {
        Scanner inputp = new Scanner(System.in);
        String expresar = inputp.next();
        char[] expre = expresar.toCharArray();
        Stack<Character> p = new Stack<>();
        boolean correcto = true;
        for (int i = 0; i < expre.length; i++) {
            if (apretura(expre[i])) {
                p.push(expre[i]);
            } else {
                if (p.empty()) {
                    correcto = false;
                    break;
                } else if (p.empty()) {
                    correcto = false;
                    break;
                } else {
                    p.pop();
                }
            }
            if (p.empty()) {
                correcto = false;
            }

            if (correcto) {
                System.out.println(expresar + " correcta");
            } else {
                System.out.println(expresar + " incorrecto");
            }

        }
    }
}
