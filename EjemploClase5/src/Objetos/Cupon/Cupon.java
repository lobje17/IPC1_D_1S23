/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Cupon;

/**
 *
 * @author lobje
 */
public class Cupon {
    private String codigo;
    private double porcentaje;
    /*Varible para verificar si ya se uso*/
    private boolean disponible;
    
    public Cupon(String codigo, double porcentaje)
    {
        this.codigo = codigo;
        this.porcentaje = porcentaje;
        this.disponible = true;
    }
    
    public String getCodigo()
    {
        return this.codigo;
    }
    
    public double getPorcentaje()
    {
        return this.porcentaje;
    }
    
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }
    
    public void setPorcentaje(double porcentaje)
    {
        this.porcentaje = porcentaje;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void noDisponible() {
        this.disponible = false;
    }
}
