/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

/**
 *
 * @author JieXin
 */
import java.util.Scanner;

public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("P :");
        double P = sc.nextDouble();
        System.out.print("D :");
        double D = sc.nextDouble();
        System.out.print("R :");
        double R = sc.nextDouble();
        System.out.print("Y :");
        double Y = sc.nextDouble();
        double M = (P - D) * (1 + R*Y/100) / (Y *12);
        System.out.printf("%.2f", M);    
    }
    
}
