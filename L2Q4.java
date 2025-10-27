/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

/**
 *
 * @author JieXin
 */
import java.util.Scanner;
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seconds:");
        int seconds = sc.nextInt();
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", seconds, seconds%60, (seconds - (seconds/3600 * 3600) - (seconds%60))/60, seconds/3600);
    }
    
}
