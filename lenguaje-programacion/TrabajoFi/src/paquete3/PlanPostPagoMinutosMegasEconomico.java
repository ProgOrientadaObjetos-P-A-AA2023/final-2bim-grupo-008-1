/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author luisa
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    // Atributos específicos para PlanPostPagoMinutosMegasEconomico
    private int minutos;
    private double costoMinuto; 
    private double megasEnGigas;
    private double costoPorGiga;
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico(String nomPropietario, String apPropietario,
            String pasPropietario, String ciuPropietario,
            String barPropietario, String mCelular,
            String moCelular, String numCelular, int minuto,
            double cMinutos, double mEnGigas, double cPGigas,
            double porDescuento) {
        super(nomPropietario, apPropietario, pasPropietario, ciuPropietario,
                barPropietario, mCelular, moCelular, numCelular);
        minutos = minuto;
        costoMinuto = cMinutos;
        megasEnGigas = mEnGigas;
        costoPorGiga = cPGigas;
        porcentajeDescuento = porDescuento;
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

    public void establecerCostoMinuto(double costoMinut) {
        costoMinuto = costoMinut;
    }

    public double obtenerMegasEnGigas() {
        return megasEnGigas;
    }

    public void establecerMegasEnGigas(double megasEnGiga) {
        megasEnGigas = megasEnGiga;
    }

    public double obtenerCostoPorGiga() {
        return costoPorGiga;
    }

    public void establecerCostoPorGiga(double costoPorGig) {
        costoPorGiga = costoPorGig;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    } 

    public void establecerPorcentajeDescuento(double porcentajeDescuent) {
        porcentajeDescuento = porcentajeDescuent;
    }

    @Override
    public String toString() {
        // Implementar la representación en texto del plan PlanPostPagoMinutosMegas
        String cadena = String.format(super.toString() + "Tipo de Plan: PostPagoMinutosMegasEconomico\n"
                + "Minutos: %d\n"
                + "Costo por Minuto: $%.2f\n"
                + "Megas en Gigas: %.2f\n"
                + "Costo por Giga: $%.2f\n"
                + "Porcentaje de descuento: %.0f porciento\n"
                + "Pago Mensual: $%.2f\n", minutos, costoMinuto, megasEnGigas, costoPorGiga, porcentajeDescuento,obtenerPagoMensual());
        return cadena;
    }

    @Override
    public void calcularPagoMensualTotal() {
        double aux = ((minutos * costoMinuto) + (megasEnGigas * costoPorGiga)) * (porcentajeDescuento / 100);
        pagoMensual = ((minutos * costoMinuto) + (megasEnGigas * costoPorGiga)) - aux;
    }
}
