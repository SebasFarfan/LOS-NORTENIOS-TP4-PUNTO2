/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.TablaMultiplicacion;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author SEBAS
 */
@ManagedBean
@ViewScoped
public class TablaMultiplicacionFormBean {

    /**
     * Creates a new instance of TablaMultiplicacionFormBean
     */
    private double operador2;
    private TablaMultiplicacion tabla;
    
    
    public TablaMultiplicacionFormBean() {
        tabla = new TablaMultiplicacion();
    }

    public double getOperador2() {
        return operador2;
    }

    public void setOperador2(double operador2) {
        this.operador2 = operador2;
    }

    public TablaMultiplicacion getTabla() {
        return tabla;
    }

    public void setTabla(TablaMultiplicacion tabla) {
        this.tabla = tabla;
    }
    
    public List<Producto> tablaProducto(){
        return tabla.getTabla();
    }
    
    public void cargarTabla(){
        this.tabla.cargarTabla(operador2);
    }
}
