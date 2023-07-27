/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author luisa
 */
public class PlanPostPagoMinutosMegas extends PlanCelular{
     // Atributos específicos para PlanPostPagoMinutosMegas
    private int minutos;
    private double costoMinuto; 
    private double megasEnGigas; 
    private double costoPorGiga; 

    public PlanPostPagoMinutosMegas(int m, double cMinuto, double mEnGigas, 
                                   double cPorGiga, String nomPropietario, String apPropietario, 
                                   String pasPropietario, String ciuPropietario, String barPropietario, 
                                   String mCelular, String moCelular, String numCelular) {
        super(nomPropietario, apPropietario, pasPropietario, ciuPropietario, 
                barPropietario, mCelular, moCelular, numCelular);
        minutos = m;
        costoMinuto = cMinuto;
        megasEnGigas = mEnGigas;
        costoPorGiga = cPorGiga;
    }

     

    // Métodos getters y setters para los atributos específicos
    public int obtenerMinutos() {
        return minutos;
    }

    public void establecerMinutos(int minuto) {
        minutos = minuto;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

    public void establecerCostoMinuto(double cMinuto) {
        costoMinuto = cMinuto;
    }

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


    @Override
    public String toString() {
        // Implementar la representación en texto del plan PlanPostPagoMinutosMegas
         String cadena = String.format(super.toString()+"Tipo de Plan: PostPagoMinutosMegas\n" +
               "Minutos: %d\n" +
               "Costo por Minuto: $%.2f\n" +
               "Megas en Gigas: %.2f\n" + 
               "Costo por Giga: $%.2f\n" + 
               "Pago Mensual: $%.2f\n",minutos,costoMinuto,megasEnGigas,costoPorGiga, obtenerPagoMensual());
        return cadena;
    }

    @Override
    public void calcularPagoMensualTotal() {
       pagoMensual=(minutos*costoMinuto)+(megasEnGigas*costoPorGiga);
    }

}