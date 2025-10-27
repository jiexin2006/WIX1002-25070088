/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

/**
 *
 * @author JieXin
 */
import java.util.Random;
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int rand1 = rand.nextInt(10,51);
        int rand2 = rand.nextInt(10,51);
        int rand3 = rand.nextInt(10,51);
        System.out.println("rand1: " + rand1);
        System.out.println("rand2: " + rand2);
        System.out.println("rand3: " + rand3);
        System.out.printf("average: %.2f", (rand1 + rand2 + rand3)/3.0);


    }
    
}
