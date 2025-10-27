/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;

/**
 *
 * @author JieXin
 */
import java.util.Scanner;
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in grams:");
        double M = scanner.nextDouble();
        M /=1000;
        System.out.print("Enter the initial temperature in fahrenheit:");
        double T1 = scanner.nextDouble();
        T1 = (T1 - 32.0) / 1.8;
        System.out.print("Enter the final temperature in fahrenheit:");
        double T2 = scanner.nextDouble();
        T2 = (T2 - 32.0) / 1.8;
        System.out.printf("The energy needed is %.2f", (M * (T2 - T1) * 4184));
    }
    
}
