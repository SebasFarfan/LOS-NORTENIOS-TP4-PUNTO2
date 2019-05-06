/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author LOS-NORTENIOS Clase que contine la operacion Producto entre dos
 * números
 */
public class Producto implements Serializable {

    /**
     * primer coeficente de un producto
     */
    private double coeficiente1;
    /**
     * segundo coeficiente de un producto
     */
    private double coeficiente2;
    /**
     * resultado de multiplicar el coeficiente1 y el coeficiente2
     */
    private double resultado;

    public double getCoeficiente1() {
        return coeficiente1;
    }

    public void setCoeficiente1(double coeficiente1) {
        this.coeficiente1 = coeficiente1;
    }

    public double getCoeficiente2() {
        return coeficiente2;
    }

    public void setCoeficiente2(double coeficiente2) {
        this.coeficiente2 = coeficiente2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Producto(double coeficiente1, double coeficiente2, double resultado) {
        this.coeficiente1 = coeficiente1;
        this.coeficiente2 = coeficiente2;
        this.resultado = resultado;
    }

    public Producto() {
    }

}
