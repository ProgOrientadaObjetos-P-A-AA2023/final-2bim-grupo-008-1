/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofi;

import java.util.Scanner;
import paquete2.Enlace;
import paquete3.PlanPostPagoMegas;
import paquete3.PlanPostPagoMinutos;
import paquete3.PlanPostPagoMinutosMegas;
import paquete3.PlanPostPagoMinutosMegasEconomico;

/**
 *
 * @author omerb
 */
public class TrabajoFi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Enlace en = new Enlace();
        Scanner scanner = new Scanner(System.in);
        String operador, opc;
        boolean ban = true, ban2 = true, ban3 = true;
        do {
            do {
                System.out.println("------------------------Menu--------------------------");
                System.out.println("Seleccione el tipo de plan que desea crear:");
                System.out.println("1. Plan PostPago Minutos");
                System.out.println("2. Plan PostPago Megas");
                System.out.println("3. Plan PostPago Minutos y Megas");
                System.out.println("4. Plan PostPago Minutos, Megas y Descuento");
                System.out.println("------------------------------------------------------");
                System.out.print("Opc: ");
                operador = scanner.nextLine();
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
                switch (operador) {
                    case "1" -> {
                        ban3 = false;
                        System.out.println("Ingrese los datos del Plan PostPago Minutos:");
                        System.out.print("Minutos Nacionales: ");
                        int minutosNacionales = scanner.nextInt();
                        System.out.print("Costo Minuto Nacional: ");
                        double costoMinutoNacional = scanner.nextDouble();
                        System.out.print("Minutos Internacionales: ");
                        int minutosInternacionales = scanner.nextInt();
                        System.out.print("Costo Minuto Internacional: ");
                        double costoMinutoInternacional = scanner.nextDouble();
                        scanner.nextLine();
                        PlanPostPagoMinutos pagoMinu = new PlanPostPagoMinutos(nombrePropietario, apellidosPropietario,
                                pasaportePropietario, ciudadPropietario, barrioPropietario, marcaCelular, modeloCelular,
                                numeroCelular, minutosNacionales, costoMinutoNacional,
                                minutosInternacionales, costoMinutoInternacional);
                        pagoMinu.calcularPagoMensualTotal();
                        en.insertarPlanPostPagoMinutos(pagoMinu);
                    }
                    case "2" -> {
                        ban3 = false;
                        System.out.println("Ingrese los datos del Plan PostPago Megas:");
                        System.out.print("Megas en Gigas: ");
                        double megasEnGigasMegas = scanner.nextDouble();
                        System.out.print("Costo por Giga: ");
                        double costoPorGigaMegas = scanner.nextDouble();
                        System.out.print("Tarifa Base: ");
                        double tarifaBaseMegas = scanner.nextDouble();
                        scanner.nextLine();
                        PlanPostPagoMegas pagoMe = new PlanPostPagoMegas(nombrePropietario, apellidosPropietario,
                                pasaportePropietario, ciudadPropietario,
                                barrioPropietario, marcaCelular, modeloCelular,
                                numeroCelular, megasEnGigasMegas, costoPorGigaMegas, tarifaBaseMegas);
                        pagoMe.calcularPagoMensualTotal();
                        en.insertarPlanPostPagoMegas(pagoMe);
                    }
                    case "3" -> {
                        ban3 = false;
                        System.out.print("Minutos: ");
                        int minutosMinutosMegas = scanner.nextInt();
                        System.out.print("Costo por Minuto: ");
                        double costoMinutoMinutosMegas = scanner.nextDouble();
                        System.out.print("Megas en Gigas: ");
                        double megasEnGigasMinutosMegas = scanner.nextDouble();
                        System.out.print("Costo por Giga: ");
                        double costoPorGigaMinutosMegas = scanner.nextDouble();
                        scanner.nextLine();
                        PlanPostPagoMinutosMegas pagoMinuMeGA = new PlanPostPagoMinutosMegas(minutosMinutosMegas,
                                costoMinutoMinutosMegas, megasEnGigasMinutosMegas,
                                costoPorGigaMinutosMegas, nombrePropietario, apellidosPropietario,
                                pasaportePropietario, ciudadPropietario, barrioPropietario, marcaCelular, modeloCelular,
                                numeroCelular);
                        pagoMinuMeGA.calcularPagoMensualTotal();
                        en.insertarPlanPostPagoMinutosMegas(pagoMinuMeGA);
                    }
                    case "4" -> {
                        ban3 = false;
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
                        scanner.nextLine();
                        PlanPostPagoMinutosMegasEconomico ec = new PlanPostPagoMinutosMegasEconomico(nombrePropietario, apellidosPropietario,
                                pasaportePropietario, ciudadPropietario,
                                barrioPropietario, marcaCelular, modeloCelular,
                                numeroCelular, minutosMinutosMegasEconomico, costoMinutoMinutosMegasEconomico,
                                megasEnGigasMinutosMegasEconomico, costoPorGigaMinutosMegasEconomico, porcentajeDescuentoMinutosMegasEconomico);
                        ec.calcularPagoMensualTotal();
                        en.insertarPlanPostPagoMinutosMegasEconomico(ec);
                    }

                    case "13" -> {
                        ban3 = false;
                        ban = false;
                    }
                    default -> {
                        System.out.println("Resultado no valido");
                        ban3 = true;
                    }
                }
            } while (ban3);

            if (ban == true) {
                do {
                    System.out.print("Desea realizar otra opción (Si/No): ");
                    opc = scanner.nextLine();
                    switch (opc) {
                        case "Si", "si" -> {
                            ban2 = false;
                            ban = true;
                        }
                        case "No", "no" -> {
                            ban2 = false;
                            ban = false;
                        }
                        default -> System.out.println("Error......");
                    }
                } while (ban2);
            }

        } while (ban);
        en.establecerLista();
        for (int i = 0; i < en.obtenerDataAuto().size(); i++) {
            System.out.printf("%s\n", en.obtenerDataAuto().get(i));
        }
    }
}
