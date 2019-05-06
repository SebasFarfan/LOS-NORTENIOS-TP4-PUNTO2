/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SEBAS
 */
public class TablaMultiplicacion implements Serializable{
    private Producto producto;
    private List<Producto> tabla;
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getTabla() {
        return tabla;
    }

    public void setTabla(List<Producto> tabla) {
        this.tabla = tabla;
    }

    public TablaMultiplicacion() {
        tabla = new ArrayList<Producto>();        
    }
    
    public void cargarTabla(double operador2){
        DispositivoCientifico calculadora = new DispositivoCientifico();
        this.tabla.clear();
        for (int i = 0; i < 100; i++) {
            this.tabla.add(new Producto(i+1, operador2, calculadora.multiplicar(i+1, operador2)));
        }
    }
}
