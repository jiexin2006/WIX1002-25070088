/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;

/**
 *
 * @author JieXin
 */
import java.util.Scanner;
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        String nums = sc.nextLine();
        String[] two_nums = nums.split(" ");
        int num1 = Integer.parseInt(two_nums[0]);
        int num2 = Integer.parseInt(two_nums[1]);
        System.out.print("Enter the operand: ");
        String s_operator = sc.nextLine();
        char c_operator = s_operator.charAt(0);
        switch (c_operator){
            case '+':
                System.out.printf("%d %c %d = %d", num1, c_operator, num2, num1+num2);
                break;
            case '-':
                System.out.printf("%d %c %d = %d", num1, c_operator, num2, num1-num2);
                break;
            case '*':
                System.out.printf("%d %c %d = %d", num1, c_operator, num2, num1*num2);
                break;
            case '/':
                System.out.printf("%d %c %d = %d", num1, c_operator, num2, num1/num2);
                break;
            case '%':
                System.out.printf("%d %c %d = %d", num1, c_operator, num2, num1%num2);
                break;
            default:
                System.out.println("invalid");
        }
    }
    
}
