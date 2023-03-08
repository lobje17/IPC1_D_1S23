/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Cupon;

import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class ListaCupones {
    private ArrayList<Cupon> listCupon;

    public ListaCupones() {
        this.listCupon = new ArrayList<>();
    }
    
    public int registrarCupon(String codigo, double porcentaje)
    {
        int indice = existCupon(codigo);
        if(indice!=-1) return 2;
        if(!cantidadCaracteres(codigo)) return 3;
        if(!rangoOk(porcentaje)) return 4;
        
        //Cupon a = new Cupon(codigo, porcentaje);
        this.listCupon.add(new Cupon(codigo, porcentaje));
        return 1;
    }
    
    public int modificarCupo()
    {
        return 1;
    }
    
    public void cuponUsados()
    {
        
    }
    
    /*El caracteres que sea exactamente 4*/
    private boolean cantidadCaracteres(String codigo)
    {
        if(codigo.length()==4) return true;
        return false;
    }
    
    /*El rango este 1-99*/
    private boolean rangoOk(double porcentaje)
    {
        if(porcentaje>0 && porcentaje<100) return true;
        return false;
    }
    
    /*Recorre el array buscando el codigo*/
    public int existCupon(String codigo)
    {
        int cantidad = this.listCupon.size();
        Cupon tmp;
        
        for (int i = 0; i <cantidad ; i++) {
            tmp = this.listCupon.get(i);
            if(tmp.getCodigo().equals(codigo)) return i;
        }
        return -1;
    }
    
    /**/
    public int cantidad(){
        return this.listCupon.size();
    }
    
    public Cupon getCupon(int i){
        return this.listCupon.get(i);
    }
}
