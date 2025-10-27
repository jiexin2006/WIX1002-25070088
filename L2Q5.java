/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

/**
 *
 * @author JieXin
 */
import java.util.Random;
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10000);
        System.out.println(number);
        int res = 0;
        do{
            res += number%10;
            number/=10;
        }while(number != 0);
        System.out.println(res);
    }
    
}
