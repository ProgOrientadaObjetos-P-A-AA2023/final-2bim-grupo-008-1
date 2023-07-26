/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

import paquete3.PlanPostPagoMinutosMegasEconomico;
import paquete3.PlanPostPagoMinutosMegas;
import paquete3.PlanPostPagoMinutos;
import paquete3.PlanPostPagoMegas;
import paquete3.PlanCelular;
import paquete2.Enlace;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Enlace enlace = new Enlace();
        ArrayList<PlanCelular> planesCreados = new ArrayList<>();

        int opcion;
        boolean continuar = true;
        System.out.println("Seleccione el tipo de plan que desea crear:");
        System.out.println("1. Plan PostPago Minutos");
        System.out.println("2. Plan PostPago Megas");
        System.out.println("3. Plan PostPago Minutos y Megas");
        System.out.println("4. Plan PostPago Minutos, Megas y Descuento");

        opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        while (continuar) {

            System.out.print("Nombre del propietario: ");
            String nombrePropietario = scanner.nextLine();
            System.out.print("Apellidos del propietario: ");
            String apellidosPropietario = scanner.nextLine();
            System.out.print("Pasaporte del propietario: ");
            String pasaportePropietario = scanner.nextLine();
            System.out.print("Ciudad del propietario: ");
            String ciudadPropietario = scanner.nextLine();
            System.out.print("Barrio del propietario: ");
            String barrioPropietario = scanner.nextLine();
            System.out.print("Marca del celular: ");
            String marcaCelular = scanner.nextLine();
            System.out.print("Modelo del celular: ");
            String modeloCelular = scanner.nextLine();
            System.out.print("Número del celular: ");
            String numeroCelular = scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del Plan PostPago Minutos:");

                    System.out.print("Minutos Nacionales: ");
                    int minutosNacionales = scanner.nextInt();
                    System.out.print("Costo Minuto Nacional: ");
                    double costoMinutoNacional = scanner.nextDouble();
                    System.out.print("Minutos Internacionales: ");
                    int minutosInternacionales = scanner.nextInt();
                    System.out.print("Costo Minuto Internacional: ");
                    double costoMinutoInternacional = scanner.nextDouble();

                    PlanPostPagoMinutos planPostPagoMinutos = new PlanPostPagoMinutos(
                            nombrePropietario, apellidosPropietario, pasaportePropietario,
                             ciudadPropietario, barrioPropietario, marcaCelular, modeloCelular,
                             numeroCelular, minutosNacionales,
                            costoMinutoNacional, minutosInternacionales, costoMinutoInternacional);

                    planesCreados.add(planPostPagoMinutos);
                    break;

                case 2:
                    // Código similar para el Plan PostPago Megas
                    System.out.print("Megas en Gigas: ");
                    double megasEnGigasMegas = scanner.nextDouble();
                    System.out.print("Costo por Giga: ");
                    double costoPorGigaMegas = scanner.nextDouble();
                    System.out.print("Tarifa Base: ");
                    double tarifaBaseMegas = scanner.nextDouble();

                    PlanPostPagoMegas planPostPagoMegas = new PlanPostPagoMegas(
                            nombrePropietario, apellidosPropietario, pasaportePropietario,
                             ciudadPropietario, barrioPropietario, marcaCelular, modeloCelular,
                             numeroCelular, megasEnGigasMegas,
                            costoPorGigaMegas, tarifaBaseMegas);

                    planesCreados.add(planPostPagoMegas);
                    break;

                case 3:
                    // Código similar para el Plan PostPago Minutos y Megas
                    System.out.print("Minutos: ");
                    int minutosMinutosMegas = scanner.nextInt();
                    System.out.print("Costo por Minuto: ");
                    double costoMinutoMinutosMegas = scanner.nextDouble();
                    System.out.print("Megas en Gigas: ");
                    double megasEnGigasMinutosMegas = scanner.nextDouble();
                    System.out.print("Costo por Giga: ");
                    double costoPorGigaMinutosMegas = scanner.nextDouble();

                    PlanPostPagoMinutosMegas planPostPagoMinutosMegas = new PlanPostPagoMinutosMegas(
                            minutosMinutosMegas, costoMinutoMinutosMegas, megasEnGigasMinutosMegas,
                            costoPorGigaMinutosMegas, nombrePropietario, apellidosPropietario, pasaportePropietario,
                             ciudadPropietario, barrioPropietario, marcaCelular, modeloCelular,
                             numeroCelular);

                    planesCreados.add(planPostPagoMinutosMegas);
                    break;

                case 4:
                    // Código similar para el Plan PostPago Minutos, Megas y Descuento
                    System.out.print("Minutos: ");
                    int minutosMinutosMegasEconomico = scanner.nextInt();
                    System.out.print("Costo por Minuto: ");
                    double costoMinutoMinutosMegasEconomico = scanner.nextDouble();
                    System.out.print("Megas en Gigas: ");
                    double megasEnGigasMinutosMegasEconomico = scanner.nextDouble();
                    System.out.print("Costo por Giga: ");
                    double costoPorGigaMinutosMegasEconomico = scanner.nextDouble();
                    System.out.print("Porcentaje de Descuento: ");
                    double porcentajeDescuentoMinutosMegasEconomico = scanner.nextDouble();

                    PlanPostPagoMinutosMegasEconomico planPostPagoMinutosMegasEconomico = new PlanPostPagoMinutosMegasEconomico(
                            nombrePropietario, apellidosPropietario, pasaportePropietario,
                             ciudadPropietario, barrioPropietario, marcaCelular, modeloCelular,
                             numeroCelular, minutosMinutosMegasEconomico, costoMinutoMinutosMegasEconomico,
                            megasEnGigasMinutosMegasEconomico, costoPorGigaMinutosMegasEconomico,
                            porcentajeDescuentoMinutosMegasEconomico);

                    planesCreados.add(planPostPagoMinutosMegasEconomico);
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
            System.out.println(
                    "¿Desea crear otro plan? (1: Sí, 0: No)");
            continuar = scanner.nextInt() == 1;

            scanner.nextLine(); // Limpiar el buffer de entrada
        } // Guardar los planes creados en la base de datos
        for (PlanCelular plan : planesCreados) {
            if (plan instanceof PlanPostPagoMinutos) {
                enlace.insertarPlanPostPagoMinutos((PlanPostPagoMinutos) plan);
            } else if (plan instanceof PlanPostPagoMegas) {
                enlace.insertarPlanPostPagoMegas((PlanPostPagoMegas) plan);
            } else if (plan instanceof PlanPostPagoMinutosMegas) {
                enlace.insertarPlanPostPagoMinutosMegas((PlanPostPagoMinutosMegas) plan);
            } else if (plan instanceof PlanPostPagoMinutosMegasEconomico) {
                enlace.insertarPlanPostPagoMinutosMegasEconomico((PlanPostPagoMinutosMegasEconomico) plan);
            }
        }

        // Mostrar todos los objetos guardados en la base de datos
        ArrayList<PlanCelular> planesGuardados = enlace.obtenerDataPlanes();
        for (PlanCelular plan : planesGuardados) {
            System.out.println(plan);
        }

    }

}
