/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cupones;

import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class ListadoCupones {
    
    ArrayList<Cupon> cupones;
    
    public ListadoCupones()
    {
        this.cupones = new ArrayList<>();
    }
    
    public boolean Registro(String Codigo, double Porcentaje)
    {
        if(ExistProduct(Codigo)==-1)
        {
            if(Porcentaje>0 && Porcentaje<100)
            {
                // Forma No.1 de agrgar elementos
                Cupon newCupon = new Cupon(Codigo, Porcentaje);
                cupones.add(newCupon);
                // Forma No. 2 de agrgar elementos
                // cupones.add(new Producto(Codigo, Porcentaje)); 
                System.out.println("Cupon registrado");
                return true;
            }
            else System.out.println("El porcentaje debe ser mayor a cero y menor a 100");
        }
        else System.out.println("Ya existe el producto");
        return false;
    }
    
    private int ExistProduct(String Codigo)
    {
        String CodigoBuscado = "";
        for (int i = 0; i < cupones.size(); i++) {
            CodigoBuscado = cupones.get(i).getCodigo();
            
            if(CodigoBuscado.equals(Codigo)) return i;
        }
        return -1;
    }
    
    public void MostrarLista()
    {
        for (int i = 0; i < cupones.size(); i++) {
            System.out.print("Codigo "+cupones.get(i).getCodigo()+"    ");
            System.out.println("Porcentaje "+cupones.get(i).getPorcentaje());
            
        }
    }
}
