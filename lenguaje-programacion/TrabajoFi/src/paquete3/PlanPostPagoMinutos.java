/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;


/**
 *
 * @author luisa
 */
public class PlanPostPagoMinutos extends PlanCelular{
    private int minutosNacionales;
    private double costoMinutoNacional;
    private int minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos(String nomPropietario, String apPropietario,
                               String pasPropietario, String ciuPropietario, String barPropietario,
                               String mCelular, String moCelular, String numCelular,int mNacionales,
                               double cMinutosNaciones,int mInternacionales,double cMinutosInternacionales) {
        super(nomPropietario, apPropietario, pasPropietario, ciuPropietario,
              barPropietario, mCelular, moCelular, numCelular);
        minutosNacionales=mNacionales;
        costoMinutoNacional=cMinutosNaciones;
        minutosInternacionales=mInternacionales;
        costoMinutoInternacional=cMinutosInternacionales;
    }

    // Métodos getters y setters para los atributos específicos
    public int obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public void establecerMinutosNacionales(int mNacionales) {
        minutosNacionales = mNacionales;
    }

    public double obtenerCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public void establecerCostoMinutoNacional(double cMinutoNacional) {
        costoMinutoNacional = cMinutoNacional;
    }

    public int obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void establecerMinutosInternacionales(int mInternacionales) {
       minutosInternacionales = mInternacionales;
    }

    public double obtenerCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    public void establecerCostoMinutoInternacional(double cMinutoInternacional) {
        costoMinutoInternacional = cMinutoInternacional;
    }
    @Override
    public String toString() {
        // Implementar la representación en texto del plan PlanPostPagoMinutos
          String cadena = String.format(super.toString()+"Tipo de Plan: PostPagoMinutos\n" +
               "Minutos Nacionales: %d\n"+
               "Costo por Minuto Nacional: $%.2f\n" + 
               "Minutos Internacionales: %d\n" + 
               "Costo por Minuto Internacional: $%.2f\n" +
               "Pago Mensual: $%.2f\n" , minutosNacionales,costoMinutoNacional,
               minutosInternacionales,costoMinutoInternacional,obtenerPagoMensual());
        return cadena;
    }

    @Override
    public void calcularPagoMensualTotal() {
       pagoMensual= (minutosNacionales* costoMinutoNacional)+(minutosInternacionales*costoMinutoInternacional);
    }
}
