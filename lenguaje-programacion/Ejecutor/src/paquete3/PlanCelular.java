
package paquete3;

public abstract class PlanCelular {

    protected String nombrePropietario;
    protected String apellidosPropietario;
    protected String pasaportePropietario;
    protected String ciudadPropietario;
    protected String barrioPropietario;
    protected String marcaCelular;
    protected String modeloCelular;
    protected String numeroCelular;
    protected double pagoMensual;

    public PlanCelular(String nomPropietario, String apPropietario,
            String pasPropietario, String ciuPropietario,
            String barPropietario, String mCelular, String moCelular, String numCelular) {
        nombrePropietario = nomPropietario;
        apellidosPropietario = apPropietario;
        pasaportePropietario = pasPropietario;
        ciudadPropietario = ciuPropietario;
        barrioPropietario = barPropietario;
        marcaCelular = mCelular;
        modeloCelular = moCelular;
        numeroCelular = numCelular;
    }

    
        // Implementar el cálculo específico para cada tipo de plan
        
    
    public void establecerNombrePropietario(String nomPropietario) {
        nombrePropietario = nomPropietario;
    }

    public void establecerApellidosPropietario(String apPropietario) {
        apellidosPropietario = apPropietario;
    }

    public void establecerPasaportePropietario(String pasPropietario) {
        pasaportePropietario = pasPropietario;
    }

    public void establecerCiudadPropietario(String ciuPropietario) {
        ciudadPropietario = ciuPropietario;
    }

    public void establecerBarrioPropietario(String barPropietario) {
        barrioPropietario = barPropietario;
    }

    public void establecerMarcaCelular(String mCelular) {
        marcaCelular = mCelular;
    }

    public void establecerModeloCelular(String moCelular) {
        modeloCelular = moCelular;
    }

    public void establecerNumeroCelular(String numCelular) {
        numeroCelular = numCelular;
    }
    

    public String obtenerNombrePropietario() {
        return nombrePropietario;
    }

    public String obtenerApellidosPropietario() {
        return apellidosPropietario;
    }

    public String obtenerPasaportePropietario() {
        return pasaportePropietario;
    }

    public String obtenerCiudadPropietario() {
        return ciudadPropietario;
    }

    public String obtenerBarrioPropietario() {
        return barrioPropietario;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public String obtenerNumeroCelular() {
        return numeroCelular;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public void establecerPagoMensual(double paMensual) {
        pagoMensual = paMensual;
    }
    
    public abstract void calcularPagoMensualTotal();
    
    @Override
    public String toString() {

        String cadena = String.format("Datos de Paln\n");

        cadena = String.format("Nombre: %s\n"
                + "Apellidos: %s\n"
                + "Pasaporte: %s\n"
                + "Ciudad: %s\n"
                + "Barrio: %s\n"
                + "Marca del teléfono: %s\n"
                + "Modelo: %s\n"
                + "Número celular: %s\n",
                cadena, obtenerNombrePropietario(),
                obtenerApellidosPropietario(),
                obtenerPasaportePropietario(), obtenerCiudadPropietario(),
                obtenerBarrioPropietario(), obtenerMarcaCelular(), obtenerModeloCelular(),
                obtenerNumeroCelular());

        return cadena;
    }

}
