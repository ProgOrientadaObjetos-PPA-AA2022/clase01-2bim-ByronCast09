/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.Estudiante;
import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;
/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args){
        EstudiantePresencial e1 = new EstudiantePresencial();
        e1.establecerNombresEstudiante("Byron");
        e1.establecerApellidoEstudiante("Castillo");
        e1.establecerIdentificacionEstudiante("1105907768");
        e1.establecerEdadEstudiante(18);
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(15);
        e1.calcularMatriculaPresencial();
        
        System.out.printf("Nombres: %s\n"+
                "Apellidos: %s\n"+
                "Identificacion: %s\n"+
                "Edad: %d\n"+
                "Numero de Creditos: %d\n"+
                "Costo Credito: %.1f\n"+
                "Costo matricula: %.1f\n",
                e1.obtenerNombresEstudiante(),e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(),e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroCreditos(),e1.obtenerCostoCredito(),
                e1.obtenerMatriculaPresencial());
    }
}
