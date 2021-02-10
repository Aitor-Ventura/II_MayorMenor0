import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {

    public static void main(String[] args) {
        mayorMenor();
    }
    
    /**
     * Método mayorMenor a modificar. Debe hacer las modificaciones 
     * necesarias para indicar correctamente si el número tecleado
     * es mayor, menor o igual a cero
     */   
        public static void mayorMenor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Dame un número entero: ");
        int num = input.nextInt();

        if (num > 0){
            System.out.print(num + " es mayor que cero");
        } else {
            if (num < 0) {
                System.out.print(num + " es menor que cero");
            } else {
                System.out.print(num + " es igual a cero");
            }
        }
    }
}