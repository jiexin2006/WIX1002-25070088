/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

/**
 *
 * @author JieXin
 */
import java.util.Random;
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        int p1_r1 = rd.nextInt(1,7);
        int p1_r2 = rd.nextInt(1,7);
        int p2_r1 = rd.nextInt(1,7);
        int p2_r2 = rd.nextInt(1,7);
        System.out.printf("Player 1 dice 1: %d\n", p1_r1);
        System.out.printf("Player 1 dice 2: %d\n", p1_r2);
        System.out.printf("Player 2 dice 1: %d\n", p2_r1);
        System.out.printf("Player 2 dice 2: %d\n", p2_r2);
        if (p1_r1 + p1_r2 > p2_r1 + p2_r2){
            System.out.println("Player 1 wins");
        }
        else if (p2_r1 + p2_r2 > p1_r1 + p1_r2){
            System.out.println("Player 2 wins");
        }
        else{
            System.out.println("It is a draw");
        }
    }
    
}
