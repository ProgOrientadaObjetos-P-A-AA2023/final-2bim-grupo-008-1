/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;


/**
 *
 * @author luisa
 */
public class PlanPostPagoMegas extends PlanCelular{
    // Atributos específicos para PlanPostPagoMegas
    private double megasEnGigas;
    private double costoPorGiga;
    private double tarifaBase;

   public PlanPostPagoMegas(String nomPropietario, String apPropietario,
                             String pasPropietario, String ciuPropietario,
                             String barPropietario, String mCelular,
                             String moCelular, String numCelular,double meEnGigas,
                             double cPorGiga,double tariBase) {
        super(nomPropietario, apPropietario, pasPropietario, ciuPropietario,
              barPropietario, mCelular, moCelular, numCelular);
        megasEnGigas=meEnGigas;
        costoPorGiga=cPorGiga;
        tarifaBase=tariBase;
    }

    // Métodos getters y setters para los atributos específicos
    public double obtenerMegasEnGigas() {
        return megasEnGigas;
    }

    public void establecerMegasEnGigas(double mEnGigas) {
        megasEnGigas = mEnGigas;
    }

    public double obtenerCostoPorGiga() {
        return costoPorGiga;
    }

    public void establecerCostoPorGiga(double cPorGiga) {
        costoPorGiga = cPorGiga;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public void establecerTarifaBase(double tBase) {
        tarifaBase = tBase;
    }

    @Override
    public String toString() {
        // Implementar la representación en texto del plan PlanPostPagoMegas
        String cadena = String.format(super.toString()+"Tipo de Plan: PostPagoMegas\n" +
               "Megas en Gigas: %.2f\n"+
               "Costo por Giga: $%.2f\n" +
               "Tarifa Base: $%.2f\n" + 
               "Pago Mensual: $%.2f\n",megasEnGigas,costoPorGiga,tarifaBase,pagoMensual);

        return  cadena;
    }

    @Override
    public void calcularPagoMensualTotal() {
       pagoMensual=megasEnGigas * costoPorGiga + tarifaBase;
    }
}