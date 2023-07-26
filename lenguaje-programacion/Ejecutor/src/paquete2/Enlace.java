/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;
import paquete3.PlanCelular;
import paquete3.PlanPostPagoMegas;
import paquete3.PlanPostPagoMinutos;
import paquete3.PlanPostPagoMinutosMegas;
import paquete3.PlanPostPagoMinutosMegasEconomico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Enlace {
    private Connection conn;

    public void establecerConexion() {
        try {
            String url = "jdbc:sqlite:bd/base001.bd";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos plan) {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutos(nombres,"
                    + "pasaporte, ciudad, barrio, marca, modelo, numero, minutosNacionales,"
                    + "costoNacional, minutosInternacionales, costoInternacional, pago)"
                    + "values ('%s', '%s','%s', '%s', '%s', '%s', '%s', %d, %.2f, %d, %.2f, %.2f)",
                    plan.obtenerNombrePropietario(), 
                    plan.obtenerApellidosPropietario(), 
                    plan.obtenerPasaportePropietario(),
                    plan.obtenerCiudadPropietario(),
                    plan.obtenerBarrioPropietario(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumeroCelular(),
                    plan.obtenerCiudadPropietario(),
                    plan.obtenerMinutosNacionales(),
                    plan.obtenerCostoMinutoNacional(),
                    plan.obtenerMinutosInternacionales(),
                    plan.obtenerCostoMinutoInternacional(),
                    plan.obtenerPagoMensual());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());
        }
    }

    public void insertarPlanPostPagoMegas(PlanPostPagoMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMegas(nombres,"
                    + "pasaporte, ciudad, barrio, marca, modelo, numero, gigas,"
                    + "costoGiga, tarifa, pago)"
                    + "values ('%s', '%s','%s', '%s', '%s', '%s', '%s', %.2f, "
                    + "%.2f, %.2f, %.2f)",
                    plan.obtenerNombrePropietario(),
                    plan.obtenerApellidosPropietario(),
                    plan.obtenerPasaportePropietario(),
                    plan.obtenerCiudadPropietario(),
                    plan.obtenerBarrioPropietario(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumeroCelular(),
                    plan.obtenerMegasEnGigas(),
                    plan.obtenerCostoPorGiga(),
                    plan.obtenerTarifaBase(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegas(nombres,"
                    + "pasaporte, ciudad, barrio, marca, modelo, numero, minutos,"
                    + "costoMinutos, gigas, costoGiga, pago)"
                    + "values ('%s','%s','%s','%s', '%s', '%s', '%s', '%s', %d,"
                    + "%.2f, %.2f, %.2f, %.2f)",
                    plan.obtenerNombrePropietario(),
                    plan.obtenerApellidosPropietario(),
                    plan.obtenerPasaportePropietario(),
                    plan.obtenerCiudadPropietario(),
                    plan.obtenerBarrioPropietario(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumeroCelular(),
                    plan.obtenerMinutos(),
                    plan.obtenerCostoMinuto(),
                    plan.obtenerMegasEnGigas(),
                    plan.obtenerCostoPorGiga(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegasEconomico"
                    + "(nombres, pasaporte, ciudad, barrio, marca, modelo, "
                    + "numero, minutos, costoMinutos, gigas, costoGiga, "
                    + "descuento, pago)"
                    + "values ('%s','%s','%s','%s', '%s', '%s', '%s', '%s',"
                    + "%d, %.2f, %.2f, %.2f, %.2f, %.2f)",
                    plan.obtenerNombrePropietario(),
                    plan.obtenerApellidosPropietario(),
                    plan.obtenerPasaportePropietario(),
                    plan.obtenerCiudadPropietario(),
                    plan.obtenerBarrioPropietario(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumeroCelular(),
                    plan.obtenerMinutos(),
                    plan.obtenerCostoMinuto(),
                    plan.obtenerMegasEnGigas(),
                    plan.obtenerCostoPorGiga(),
                    plan.obtenerPorcentajeDescuento(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

      public ArrayList<PlanCelular> obtenerDataPlanes() {
        ArrayList<PlanCelular> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = "Select * from PlanPostPagoMinutos;";
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                PlanPostPagoMinutos plan1 = new PlanPostPagoMinutos(
                        rs.getString("nombres"),
                        rs.getString("apellido"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("numeroCelular"),
                        rs.getInt("minutosNacionales"),
                        rs.getDouble("costoNacional"),
                        rs.getInt("minutosInternacionales"),
                        rs.getDouble("costoInternacional"));
                plan1.calcularPagoMensualTotal();
                lista.add(plan1);
            }

            String data2 = "Select * from PlanPostPagoMegas;";
            rs = statement.executeQuery(data2);
            while (rs.next()) {

                PlanPostPagoMegas plan2 = new PlanPostPagoMegas(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("numeroCelular"),
                        rs.getDouble("gigas"),
                        rs.getDouble("costoGiga"),
                        rs.getDouble("tarifa"));
                plan2.calcularPagoMensualTotal();

                lista.add(plan2);
            }

            String data3 = "Select * from PlanPostPagoMinutosMegas;";
            rs = statement.executeQuery(data3);
            while (rs.next()) {

                PlanPostPagoMinutos plan = new PlanPostPagoMinutos(
                        rs.getString("nombres"),
                        rs.getString("apellido"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("numeroCelular"),
                        rs.getInt("minutos"),
                        rs.getDouble("costoMinutos"),
                        rs.getInt("gigas"),
                        rs.getDouble("costoGiga"));
                plan.calcularPagoMensualTotal();
                lista.add(plan);
            }

            String data4 = "Select * from PlanPostPagoMinutosMegasEconomico;";
            rs = statement.executeQuery(data4);
            while (rs.next()) {

                PlanPostPagoMinutosMegasEconomico plan = new PlanPostPagoMinutosMegasEconomico(
                        rs.getString("nombres"),
                        rs.getString("apellido"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("numeroCelular"),
                        rs.getInt("minutos"),
                        rs.getDouble("costoMinutos"),
                        rs.getInt("gigas"),
                        rs.getDouble("costoGiga"),
                        rs.getDouble("descuento"));
                plan.calcularPagoMensualTotal();
                lista.add(plan);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}
