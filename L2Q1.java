/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;

/**
 *
 * @author JieXin
 */
import java.util.Scanner;
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temp in fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celcius = (fahrenheit - 32.0) / 1.8;
        System.out.printf("%.2f", celcius);
    }
    
}
