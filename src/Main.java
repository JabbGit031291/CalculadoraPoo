import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int num1;
        int num2;
        int operador;
        int resultado = 0;

        do {

            System.out.println("Ingrese el primer numero: ");
            num1 = scanner.nextInt();

            System.out.println("Ingrese el segundo numero: ");
            num2 = scanner.nextInt();

            System.out.println("Ingrese la operacion a realizar: \n 1: Suma '+'. \n 2: Resta '-'. \n 3: Multiplicacion '*'. \n 4 Division '/'. \n 5: Salir ");
            operador = scanner.nextInt();


            do {


                switch (operador) {

                    case 1:
                        resultado = calculadora.suma(num1, num2);
                        break;

                    case 2:
                        resultado = calculadora.resta(num1, num1);
                        break;

                    case 3:
                        resultado = calculadora.multi(num1, num2);
                        break;

                    case 4:
                        resultado = calculadora.divi(num1, num2);
                        break;
                    default:
                        System.out.println("Operación no válida.");
                        return;

                }
                System.out.println("El resultado de la " + operador + " Es : " + resultado);
                System.out.println("Desea realizar otra operación \n Si es así presione enter para continuar: ");
                scanner.nextLine(); // Captura el salto de línea restante
                scanner.nextLine(); // Espera a que el usuario presione Enter
                break;


            } while (operador != 4); // salir del menu
            System.out.println("Volviendo al menu anterior...");


        }while (operador != 5);
        System.out.println(" \uD83D\uDE0E Saliendo...\uD83D\uDDB1\uFE0F  ");
        scanner.close();
    }
}