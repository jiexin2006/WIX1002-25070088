/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

/**
 *
 * @author JieXin
 */
import java.util.Scanner;
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Sales volume: ");
        double sales = sc.nextDouble();
        if (sales >1000){
            System.out.printf("Commission = %.2f", 0.125 * sales);
        }
        else if (sales>500 && sales<= 1000){
            System.out.printf("Commission = %.2f", 0.1 * sales);
        }
        else if (sales>100 && sales<= 500){
            System.out.printf("Commission = %.2f", 0.075 * sales);
        }
        else if (sales<= 100){
            System.out.printf("Commission = %.2f", 0.05 * sales);
        }
        
    }
    
}
