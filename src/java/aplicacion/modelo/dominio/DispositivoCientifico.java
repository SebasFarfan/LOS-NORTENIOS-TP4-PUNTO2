/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author SEBAS
 */
public class DispositivoCientifico {

    /**
     * marca del dispositivo cientifico
     */
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private String versionSistemaOperativo;

    public DispositivoCientifico() {
    }

    public DispositivoCientifico(String marca, String modelo, String sistemaOperativo, String versionSistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.versionSistemaOperativo = versionSistemaOperativo;
    }

    public String getVersionSistemaOperativo() {
        return versionSistemaOperativo;
    }

    public void setVersionSistemaOperativo(String versionSistemaOperativo) {
        this.versionSistemaOperativo = versionSistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     * metodo que realiza la suma de dos valores de tipo real
     *
     * @param sumando1
     * @param sumando2
     * @return double que es el resultado de la suma
     */
    public double sumar(double sumando1, double sumando2) {
        return sumando1 + sumando2;
    }

    /**
     * metodo que realiza la resta de dos valores de tipo real
     *
     * @param minuendo1
     * @param sustraendo2
     * @return double que es el resultado de la resta
     */
    public double restar(double minuendo1, double sustraendo2) {
        return minuendo1 - sustraendo2;
    }

    /**
     * metodo que realiza la multiplicación de dos valores de tipo real
     *
     * @param factor1
     * @param factor2
     * @return double que es el resultado de la multiplicación
     */
    public double multiplicar(double factor1, double factor2) {
        return factor1 * factor2;
    }

    /**
     * metodo que realiza la division de dos valores
     *
     * @param dividendo
     * @param divisor
     * @return double que es el resultado de la division
     */
    public double division(double dividendo, double divisor) {
        return dividendo / divisor;
    }

    /**
     * metodo que calcula el factorial de un numero
     *
     * @param numero
     * @return double que es el resultado del factorial
     */
    public double factorial(double numero) {
        double resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * metodo que determina si el el numero que se pasa como primer parametro es
     * mayor que el numero que se pasa como segundo parametro.
     *
     * @param numero1
     * @param numero2
     * @return true si el numero1 es mayor. false en caso contrario.
     */
    public boolean esMayor(double numero1, double numero2) {
        return numero1 > numero2;
    }

    /**
     * metodo que determina si el numero que se pasa como primer parametro es
     * menor que el numero que se pasa como segundo paramtro.
     *
     * @param numero1
     * @param numero2
     * @return true si el numero1 es menor. false en caso contrario.
     */
    public boolean esMenor(double numero1, double numero2) {
        return numero1 < numero2;
    }

    /**
     * metodo que determina el resto de la division entre dos numeros
     *
     * @param dividendo
     * @param divisor
     * @return double que es el resto de la division
     */
    public double resto(double dividendo, double divisor) {
        return dividendo % divisor;
    }

    /**
     * metodo que determina si el numero es par
     *
     * @param numero
     * @return true si el numero es par, false en caso contrario.
     */
    public boolean esPar(double numero) {
        return (numero % 2 == 0);
    }

    /**
     * metodo que calcula el coseno del parametro x, utiliza el metodo de
     * McLaurin para realizar el calculo.
     *
     * @param x
     * @return cos(x)
     */
    public double coseno(double x) {
        double coseno = 0;
        int n = 100;
        for (int i = 1; i <= 100; i++) {
            coseno += ((Math.pow(-1d, i)) * (Math.pow(x, 2 * i)) / this.factorial(i));
        }
        return coseno;
    }
        
}
