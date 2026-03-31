/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multi;

/**
 *
 * @author cecil
 */
import java.util.Scanner;
public class Multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n;
        
        System.out.println(" Digite número: ");
        n = entrada.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println(i*2);
        }
    }
    
}
