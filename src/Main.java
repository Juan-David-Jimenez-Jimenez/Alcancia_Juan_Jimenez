// ESTUDIANTE: Juan David Jimenez Jimenez - ID: 932024

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int moneda20 = 0;
        int moneda50 = 0;
        int moneda100 = 0;
        int moneda200 = 0;
        int moneda500 = 0;

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("+------------------------------------------------------+");
            System.out.println("|        SELECCIONE QUE DESEA HACER                    |");
            System.out.println("+------------------------------------------------------+");
            System.out.println("| 1. Agregar una moneda                                |");
            System.out.println("| 2. Contar cuántas monedas tiene de cada denominación |");
            System.out.println("| 3. Calcular el total del dinero ahorrado             |");
            System.out.println("| 4. Romper la alcancía                                |");
            System.out.println("| 5. Salir                                             |");
            System.out.println("+------------------------------------------------------+");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor de la moneda ($20, $50, $100, $200, $500): ");
                    int moneda = scanner.nextInt();

                    switch (moneda) {
                        case 20:
                            moneda20++;
                            break;
                        case 50:
                            moneda50++;
                            break;
                        case 100:
                            moneda100++;
                            break;
                        case 200:
                            moneda200++;
                            break;
                        case 500:
                            moneda500++;
                            break;
                        default:
                            System.out.println("Denominación no válida. Solo se aceptan monedas de $20, $50, $100, $200 y $500.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Cantidad de Monedas por Denominación ---");
                    System.out.println("$20: " + moneda20);
                    System.out.println("$50: " + moneda50);
                    System.out.println("$100: " + moneda100);
                    System.out.println("$200: " + moneda200);
                    System.out.println("$500: " + moneda500);
                    break;

                case 3:
                    int total = moneda20 * 20 + moneda50 * 50 + moneda100 * 100 + moneda200 * 200 + moneda500 * 500;
                    System.out.println("\nTotal ahorrado en la alcancía: $" + total);
                    break;

                case 4:
                    System.out.println("\nRompiendo la alcancía...");
                    moneda20 = moneda50 = moneda100 = moneda200 = moneda500 = 0;
                    System.out.println("La alcancía está vacía.");
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
                    break;
            }

        } while (opcion != 5);
    }
}

