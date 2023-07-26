/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import paquete3.PlanCelular;

/**
 *
 * @author luisa
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular{
    // Atributos específicos para PlanPostPagoMinutosMegasEconomico
    private int minutos;
    private double costoMinuto;
    private double megasEnGigas;
    private double costoPorGiga;
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico(String nomPropietario, String apPropietario,
                                             String pasPropietario, String ciuPropietario,
                                             String barPropietario, String mCelular,
                                             String moCelular, String numCelular,int minuto,
                                             double cMinutos,double mEnGigas,double cPGigas,
                                             double porDescuento) {
        super(nomPropietario, apPropietario, pasPropietario, ciuPropietario,
              barPropietario, mCelular, moCelular, numCelular);
        minutos=minuto;
        costoMinuto=cMinutos;
        megasEnGigas=mEnGigas;
        costoPorGiga=cPGigas;
        porcentajeDescuento=porDescuento;
    }

    // Métodos getters y setters para los atributos específicos
    public int obtenerMinutos() {
        return minutos;
    }

    public void establecerMinutos(int minutos) {
        this.minutos = minutos;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

    public void establecerCostoMinuto(double costoMinuto) {
        this.costoMinuto = costoMinuto;
    }

    public double obtenerMegasEnGigas() {
        return megasEnGigas;
    }

    public void establecerMegasEnGigas(double megasEnGigas) {
        this.megasEnGigas = megasEnGigas;
    }

    public double obtenerCostoPorGiga() {
        return costoPorGiga;
    }

    public void establecerCostoPorGiga(double costoPorGiga) {
        this.costoPorGiga = costoPorGiga;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void establecerPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento/100;
    }

    @Override
    public String toString() {
        // Implementar la representación en texto del plan PlanPostPagoMinutosMegasEconomico
        return super.toString() + "\nTipo de Plan: PostPagoMinutosMegasEconomico\n" +
               "Minutos: %d\n" + minutos +
               "Costo por Minuto: $%.2f\n" + costoMinuto +
               "Megas en Gigas: %.2f1\n" + megasEnGigas +
               "Costo por Giga: $%.2f\n" + costoPorGiga +
               "Porcentaje de Descuento: %.2f\n" + porcentajeDescuento + "%" +
               "Pago Mensual: $%.2f\n" + obtenerPagoMensual();
    }

    @Override
    public void calcularPagoMensualTotal() {
       pagoMensual=((minutos*costoMinuto)+(megasEnGigas*costoPorGiga))*porcentajeDescuento;
    }
}


