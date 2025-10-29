/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q5;

/**
 *
 * @author JieXin
 */
import java.util.Scanner;
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        System.out.print("d = ");
        int d = sc.nextInt();
        System.out.print("e = ");
        int e = sc.nextInt();
        System.out.print("f = ");
        int f = sc.nextInt();
        int temp = a*d - b*c;
        if (temp == 0){
            System.out.println("The equation has no solution");
            System.exit(0);
        }
        else{
            System.out.printf("x = %d\n", (e*d-b*f)/(a*d-b*c));
            System.out.printf("y = %d", (a*f-e*c)/(a*d-b*c));
        }
    }
    
}
