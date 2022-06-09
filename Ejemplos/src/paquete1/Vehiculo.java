/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;
    private Vehiculo [] vehiculos; //tipo,matricula,valor
    private double costoVehiculos;
    private double costoTotalBienes;
    
    public Vehiculo (String tip, String matr,double val){
        tipo = tip;
        matricula = matr;
        valor = val;
    }
    public void establecerTipo(String m){
        tipo = m;
    }
    public void establecerMatricula(String m){
        matricula = m;
    }
    public void establecerValor(double m){
        valor = m;
    }
    public void establecerVehiculo(Vehiculo [] m){
        vehiculos = m;
    }
    public void establecerCostoVehiculos(){
        double suma = 0;
        for(int i = 0;i<obtenerVehiculo().length;i++){
            suma = suma + vehiculos[i].obtenerValor();//ggdfgfgdrf
        }
    }
    public void establecerTotalBienes(double m){
        costoTotalBienes = m;
    }
    //------------------
    public String obtenerTipo(){
        return tipo;
    }
    public String obtenerMatricula(){
        return matricula;
    }
    public double obtenerValor(){
        return valor;
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
    
    @Override
    public String toString(){
        String reporte = String.format("%s\nLista de Vehiculos\n",
                obtenerTipo());
         for(int i = 0;i<obtenerVehiculo().length;i++){
            reporte = String.format("%s%d. %s %s (%.2f)\n", reporte,i+1,vehiculos[i].obtenerTipo().toUpperCase(),
                    vehiculos[i].obtenerMatricula(),
                    vehiculos[i].obtenerValor());
        }
        reporte = String.format("%sTotal de inmuebles: %.2f\n", reporte,
                obtenerTotalBienes());
        return reporte;
    }
}
