/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import paquete1.*;
/**
 *
 * @author reroes
 */
public class Empresa {
    
    private String nombre;
    private Edificio [] edificios;
    private double costoBienesInmuebles;
    private Vehiculo [] vehiculos; //tipo,matricula,valor
    private double costoVehiculos;
    private double costoTotalBienes;
    private double bienesVehiculos;
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    
    public void establecerBienesInmueble(){
        double suma = 0;
        for(int i = 0;i<obtenerEdificios().length;i++){
            suma = suma + edificios[i].obtenerCosto();
       }
        costoBienesInmuebles = suma;
       
    }
    public void establecerVehiculo(Vehiculo [] m){
        vehiculos = m;
    }
    public void establecerCostoVehiculos(){
        double suma = 0;
        for(int i = 0;i<obtenerVehiculo().length;i++){
            suma = suma + vehiculos[i].obtenerValor();
        }
        costoVehiculos = suma;
    }
    public void establecerTotalBienes(){
        costoTotalBienes = costoVehiculos + costoTotalBienes;
    }
    public void establecerBienesVehiculos(){
        bienesVehiculos = costoBienesInmuebles + costoVehiculos+ costoTotalBienes ;//hice variables al revez y me perdi
                                                                   //no sale el total de bienes
    }
    
    //-------------------------------------------
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    
    public double obtenerBienesInmuebles(){
        return costoBienesInmuebles;
    }
    public Vehiculo[] obtenerVehiculo(){
        return vehiculos;
    }
    public double obtenerCostoVehiculo(){
        return costoVehiculos;
    }
    public double obtenerTotalBienes(){
        return costoTotalBienes;
    }
    public double obtenerBienesVehiculos(){
        return bienesVehiculos;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("%s\nLista de Edificios\n",
                obtenerNombre());
        for(int i = 0;i<obtenerEdificios().length;i++){
            reporte = String.format("%s%d. %s (%.2f)\n", reporte,i+1,edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        reporte = String.format("%sTotal de inmuebles: %.2f\n\nLista Vehiculos\n", reporte,
                obtenerBienesInmuebles());
        
        for(int i = 0;i<vehiculos.length;i++){
            reporte = String.format("%s %d. %s %s (%.2f)\n",reporte,i+1,vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatricula(),
                    vehiculos[i].obtenerValor());
        }
        reporte = String.format("%sTotal de inmuebles: %.2f\n", reporte,
                obtenerTotalBienes());
        reporte = String.format("%s\nTotal de bienes: %.2f\n", reporte,
                obtenerBienesVehiculos());
        return reporte;
    }
}
