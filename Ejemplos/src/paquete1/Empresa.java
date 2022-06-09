/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    
    private String nombre;
    private Edificio [] edificios;
    private double costoBienesInmuebles;
    
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
    
    
    @Override
    public String toString(){
        String reporte = String.format("%s\nLista de Edificios\n",
                obtenerNombre());
         for(int i = 0;i<obtenerEdificios().length;i++){
            reporte = String.format("%s%d. %s (%.2f)\n", reporte,i+1,edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        reporte = String.format("%sTotal de inmuebles: %.2f\n", reporte,
                obtenerBienesInmuebles());
        return reporte;
    }
    
}
