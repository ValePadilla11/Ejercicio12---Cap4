/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12.cap4;

import java.util.Scanner;

public class Ejercicio12Cap4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese los nombres del trabajador: ");
        String NOM = input.nextLine();

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int NHT = input.nextInt();

        System.out.print("Ingrese el valor recibido por una hora normal de trabajo: ");
        double VHN = input.nextDouble();
        
        double HET=0;
        double HEE8=0;
        double SALARIO=0;
        
        if (NHT > 40) {
            HET = NHT - 40;
            if (HET > 8){
            HEE8 = HET - 8;
            SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
        } else if (HET <= 8) {
            SALARIO = 40 * VHN + HET * 2 * VHN; 
        }                    
                       
        } else {
            SALARIO = NHT * VHN;
        }        
    
        System.out.println("EL TRABAJADOR " + NOM + " DEVENGÓ: $" + SALARIO);
    }
}
        

