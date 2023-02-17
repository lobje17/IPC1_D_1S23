/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cupones;

/**
 *
 * @author lobje
 */
public class Cupon {
    
    private String codigo;
    private double porcentaje;
    
    public Cupon(String codigo, double porcentaje)
    {
        this.codigo = codigo;
        this.porcentaje = porcentaje;
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
}
