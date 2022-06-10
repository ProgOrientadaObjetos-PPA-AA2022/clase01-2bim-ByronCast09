/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(20000);
        
        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000);
     
        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(10000);
      
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000);
        
        Edificio [] listaEdificios = {edf1,edf2,edf3,edf4};
        //double c = listaEdificios[2].obtenerCosto();
        //System.out.println(c);
        
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        Empresa emp = new Empresa();
        emp.establecerNombre("Empresa de Hojas");
        emp.establecerEdificios(listaEdificios);
        emp.establecerBienesInmueble();
        
        // Imprimir el costo de los bienes inmuebles de la empresa
        //System.out.printf("%.2f\n",emp.obtenerBienesInmuebles());
       
        Vehiculo vh1 = new Vehiculo("Auto","LBB0011",10000);
        Vehiculo vh2 = new Vehiculo("Camioneta","LCB0011",20000);
        Vehiculo vh3 = new Vehiculo("Auto","LBD0012",6000);
        Vehiculo vh4 = new Vehiculo("Camioneta","LCC0011",10000);
        Vehiculo vh5 = new Vehiculo("Camioneta","LCC0011",25000);
        
        Vehiculo [] vehiculo = {vh1,vh2,vh3,vh4,vh5};
        emp.establecerVehiculo(vehiculo);
        emp.establecerCostoVehiculos();
        emp.establecerTotalBienes();
        System.out.printf("%s\n",emp);
    }
}
