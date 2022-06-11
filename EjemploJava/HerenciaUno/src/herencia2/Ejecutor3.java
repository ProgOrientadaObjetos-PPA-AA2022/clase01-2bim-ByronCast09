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
public class Ejecutor3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Eliga entre las opciones: 1 y 2: ");
        int opc = entrada.nextInt();
        if(opc >2 || opc <1){
            System.out.println("Opcion Incorrecta");
        }else{
            entrada.nextLine();
            System.out.println("Ingrese nombres: ");
                String nombres = entrada.nextLine();
                System.out.println("Ingrese apellidos: ");
                String apellidos = entrada.nextLine();
                System.out.println("Ingrese identificacion: ");
                String identificacion = entrada.nextLine();
                System.out.println("Ingrese edad: ");
                int edad = entrada.nextInt();
            switch (opc) {
            case (1):
                entrada.nextLine();
                
                System.out.println("Ingrese numero de creditos: ");
                int num_asig = entrada.nextInt();
                System.out.println("Ingrese costo de creditos: ");
                double costoAsig = entrada.nextDouble();
                EstudianteDistancia ed1 = new EstudianteDistancia();

                ed1.establecerNombresEstudiante(nombres);
                ed1.establecerApellidoEstudiante(apellidos);
                ed1.establecerIdentificacionEstudiante(identificacion);
                ed1.establecerEdadEstudiante(edad);
                ed1.establecerNumeroAsginaturas(num_asig);
                ed1.establecerCostoAsignatura(costoAsig);
                ed1.calcularMatriculaDistancia();
                System.out.printf("%s\n", ed1);

                break;
            case (2):
                entrada.nextLine();
                System.out.println("Ingrese numero de asignatura: ");
                int num_asig1 = entrada.nextInt();
                System.out.println("Ingrese costo asignatura: ");
                double costoAsig1 = entrada.nextDouble();
                EstudianteDistancia ed2 = new EstudianteDistancia();
                
                ed2.establecerNombresEstudiante(nombres);
                ed2.establecerApellidoEstudiante(apellidos);
                ed2.establecerIdentificacionEstudiante(identificacion);
                ed2.establecerEdadEstudiante(edad);
                ed2.establecerNumeroAsginaturas(num_asig1);
                ed2.establecerCostoAsignatura(costoAsig1);
                ed2.calcularMatriculaDistancia();

                System.out.printf("\n%s\n", ed2);
                break;
            case(3):
                System.out.println("No existe esta opcion");
                return ;

        }
        }
        

    }
}
