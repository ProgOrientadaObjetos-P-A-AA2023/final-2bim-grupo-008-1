/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete3.PlanCelular;
import paquete3.PlanPostPagoMegas;
import paquete3.PlanPostPagoMinutos;
import paquete3.PlanPostPagoMinutosMegas;
import paquete3.PlanPostPagoMinutosMegasEconomico;

/**
 *
 * @author reroes
 */
public class Enlace {
    
    private Connection conn;
    private ArrayList<PlanCelular> lista;
    
    public void establecerConexion() {
        
        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public Connection obtenerConexion() {
        return conn;
    }
    
    public void insertarPlanPostPagoMegas(PlanPostPagoMegas me) {
        
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO pagoMegas (nombrePropietario,"
                    + "apellidosPropietario,pasaportePropietario,ciudadPropietario,"
                    + "barrioPropietario,marcaCelular,modeloCelular,numeroCelular,"
                    + "pagoMensual,megasEnGigas,costoPorGiga,tarifaBase) "
                    + "values ('%s','%s','%s','%s','%s','%s','%s','%s',%s,%s,%s,%s);",
                    me.obtenerNombrePropietario(), me.obtenerApellidosPropietario(),
                    me.obtenerPasaportePropietario(), me.obtenerCiudadPropietario(),
                    me.obtenerBarrioPropietario(), me.obtenerMarcaCelular(),
                    me.obtenerModeloCelular(), me.obtenerNumeroCelular(), me.obtenerPagoMensual(),
                    me.obtenerMegasEnGigas(), me.obtenerCostoPorGiga(), me.obtenerTarifaBase());
            
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());
            
        }
    }
    
    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos me) {
        
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutos (nomPropietario,"
                    + "apPropietario,pasPropietario,ciuPropietario,"
                    + "barPropietario,mCelular,moCelular,numCelular,"
                    + "pagoMensual,mNacionales,cMinutosNaciones,mInternacionales,cMinutosInternacionales) "
                    + "values ('%s','%s','%s','%s','%s','%s','%s','%s',%s,%s,%s,%s,%s);",
                    me.obtenerNombrePropietario(), me.obtenerApellidosPropietario(),
                    me.obtenerPasaportePropietario(), me.obtenerCiudadPropietario(),
                    me.obtenerBarrioPropietario(), me.obtenerMarcaCelular(),
                    me.obtenerModeloCelular(), me.obtenerNumeroCelular(), me.obtenerPagoMensual(),
                    me.obtenerMinutosNacionales(), me.obtenerCostoMinutoNacional(), me.obtenerMinutosInternacionales(),
                    me.obtenerCostoMinutoInternacional());
            
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());
            
        }
    }
    
    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas me) {
        
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegas (nomPropietario,"
                    + "apPropietario,pasPropietario,ciuPropietario,"
                    + "barPropietario,mCelular,moCelular,numCelular,"
                    + "pagoMensual,minutos,costoMinuto,megasEnGigas,costoPorGiga) "
                    + "values ('%s','%s','%s','%s','%s','%s','%s','%s',%s,%s,%s,%s,%s);",
                    me.obtenerNombrePropietario(), me.obtenerApellidosPropietario(),
                    me.obtenerPasaportePropietario(), me.obtenerCiudadPropietario(),
                    me.obtenerBarrioPropietario(), me.obtenerMarcaCelular(),
                    me.obtenerModeloCelular(), me.obtenerNumeroCelular(), me.obtenerPagoMensual(),
                    me.obtenerMinutos(), me.obtenerCostoMinuto(), me.obtenerMegasEnGigas(),
                    me.obtenerCostoPorGiga());
            
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());
            
        }
    }
    
    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico me) {
        
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegasEconomico (nomPropietario,"
                    + "apPropietario,pasPropietario,ciuPropietario,"
                    + "barPropietario,mCelular,moCelular,numCelular,"
                    + "pagoMensual,minutos,costoMinuto,megasEnGigas,costoPorGiga,porcentajeDescuento) "
                    + "values ('%s','%s','%s','%s','%s','%s','%s','%s',%s,%s,%s,%s,%s,%s);",
                    me.obtenerNombrePropietario(), me.obtenerApellidosPropietario(),
                    me.obtenerPasaportePropietario(), me.obtenerCiudadPropietario(),
                    me.obtenerBarrioPropietario(), me.obtenerMarcaCelular(),
                    me.obtenerModeloCelular(), me.obtenerNumeroCelular(), me.obtenerPagoMensual(),
                    me.obtenerMinutos(), me.obtenerCostoMinuto(), me.obtenerMegasEnGigas(),
                    me.obtenerCostoPorGiga(), me.obtenerPorcentajeDescuento());
            
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());
            
        }
    }
    
    public ArrayList<PlanCelular> obtenerDataAuto() {
        return lista;
    }
    
    public void establecerLista() {
        lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from pagoMegas;";
            ResultSet rs = statement.executeQuery(data);
            agregarPlanPostPagoMegas(rs);
            
            String data2 = "Select * from PlanPostPagoMinutos;";
            ResultSet rs2 = statement.executeQuery(data2);
            agregarPlanPostPagoMinutos(rs2);
            
            String data3 = "Select * from PlanPostPagoMinutosMegas;";
            ResultSet rs3 = statement.executeQuery(data3);
            agregarPlanPostPagoMinutosMegas(rs3);
            
            String data4 = "Select * from PlanPostPagoMinutosMegasEconomico;";
            ResultSet rs4 = statement.executeQuery(data4);
            agregarPlanPostPagoMinutosMegasEconomico(rs4);
            
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarCiudad");
            System.out.println(e.getMessage());
            
        }
    }
    
    public void agregarPlanPostPagoMegas(ResultSet rs) {
        try {
            while (rs.next()) {
                PlanPostPagoMegas me = new PlanPostPagoMegas(rs.getString("nombrePropietario"),
                        rs.getString("apellidosPropietario"), rs.getString("pasaportePropietario"), rs.getString("ciudadPropietario"),
                        rs.getString("barrioPropietario"), rs.getString("marcaCelular"), rs.getString("modeloCelular"), rs.getString("numeroCelular"),
                        rs.getDouble("megasEnGigas"), rs.getDouble("costoPorGiga"), rs.getDouble("tarifaBase"));
                me.establecerPagoMensual(rs.getDouble("pagoMensual"));
                lista.add(me);
            }
            
        } catch (SQLException e) {
            System.out.println("Exception: insertarCiudad");
            System.out.println(e.getMessage());
        }
    }
    
    public void agregarPlanPostPagoMinutos(ResultSet rs) {
        try {
            while (rs.next()) {
                PlanPostPagoMinutos me = new PlanPostPagoMinutos(rs.getString("nomPropietario"), rs.getString("apPropietario"), rs.getString("pasPropietario"),
                        rs.getString("ciuPropietario"), rs.getString("barPropietario"), rs.getString("mCelular"),
                        rs.getString("moCelular"), rs.getString("numCelular"), rs.getInt("mNacionales"),
                        rs.getDouble("cMinutosNaciones"), rs.getInt("mInternacionales"), rs.getDouble("cMinutosInternacionales"));
                me.establecerPagoMensual(rs.getDouble("pagoMensual"));
                lista.add(me);
            }
            
        } catch (SQLException e) {
            System.out.println("Exception: insertarCiudad");
            System.out.println(e.getMessage());
        }
    }
    
    public void agregarPlanPostPagoMinutosMegas(ResultSet rs) {
        try {
            while (rs.next()) {
                PlanPostPagoMinutosMegas me = new PlanPostPagoMinutosMegas(rs.getInt("minutos"), rs.getDouble("costoMinuto"),
                        rs.getDouble("megasEnGigas"), rs.getDouble("costoPorGiga"),
                        rs.getString("nomPropietario"), rs.getString("apPropietario"), rs.getString("pasPropietario"),
                        rs.getString("ciuPropietario"), rs.getString("barPropietario"), rs.getString("mCelular"),
                        rs.getString("moCelular"), rs.getString("numCelular")
                );
                me.establecerPagoMensual(rs.getDouble("pagoMensual"));
                lista.add(me);
            }
            
        } catch (SQLException e) {
            System.out.println("Exception: insertarCiudad");
            System.out.println(e.getMessage());
        }
    }
    
    public void agregarPlanPostPagoMinutosMegasEconomico(ResultSet rs) {
        try {
            while (rs.next()) {
                PlanPostPagoMinutosMegasEconomico me = new PlanPostPagoMinutosMegasEconomico(
                        rs.getString("nomPropietario"), rs.getString("apPropietario"), rs.getString("pasPropietario"),
                        rs.getString("ciuPropietario"), rs.getString("barPropietario"), rs.getString("mCelular"),
                        rs.getString("moCelular"), rs.getString("numCelular"),
                        rs.getInt("minutos"), rs.getDouble("costoMinuto"),
                        rs.getDouble("megasEnGigas"), rs.getDouble("costoPorGiga"), 
                        rs.getDouble("porcentajeDescuento"));
                me.establecerPagoMensual(rs.getDouble("pagoMensual"));
                lista.add(me);
            }
            
        } catch (SQLException e) {
            System.out.println("Exception: insertarCiudad");
            System.out.println(e.getMessage());
        }
    }
}
