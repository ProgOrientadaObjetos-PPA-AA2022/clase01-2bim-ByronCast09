/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args){
       
         Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
         System.out.println("Ingrese nombres: ");
         String nombres = entrada.nextLine();
         System.out.println("Ingrese apellidos: ");
         String apellidos = entrada.nextLine();
         System.out.println("Ingrese identificacion: ");
         String identificacion = entrada.nextLine();
         System.out.println("Ingrese edad: ");
         int edad = entrada.nextInt();
         System.out.println("Ingrese numero de asignatura: ");
         int num_asig = entrada.nextInt();
         System.out.println("Ingrese costo asignatura: ");
         double costoAsig = entrada.nextDouble();
         EstudianteDistancia ed1 = new EstudianteDistancia();
         
        ed1.establecerNombresEstudiante(nombres);
        ed1.establecerApellidoEstudiante(apellidos);
        ed1.establecerIdentificacionEstudiante(identificacion);
        ed1.establecerEdadEstudiante(edad);
        ed1.establecerNumeroAsginaturas(num_asig);
        ed1.establecerCostoAsignatura(costoAsig);
        ed1.calcularMatriculaDistancia();
        
        System.out.printf("%s\n",ed1);
    }
}
