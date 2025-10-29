/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;

/**
 *
 * @author JieXin
 */
import java.util.Scanner;
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter the x-coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter the y-coordinate: ");
        double y = sc.nextDouble();   
        if (Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) <= r){
            System.out.println("The point is inside the circle");
        }
        else{
            System.out.println("The point is outside the circle");

        }
                
    }
    
}
