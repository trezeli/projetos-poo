/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classemath;
public class ClasseMath {

    public static void main(String[] args) {
        System.out.println("Ceil");
        double a = 6.2, b = 6.6, c = -6.8;
        System.out.println(Math.ceil(a));
        System.out.println(Math.ceil(b));
        System.out.println(Math.ceil(c));
        
        System.out.println("Floor");
        double a2 = 6.2, b2 = 6.6, c2 = -6.8;
        System.out.println(Math.floor(a2));
        System.out.println(Math.floor(b2));
        System.out.println(Math.floor(c2));
        
        System.out.println("Max");
        int a3 = 20, b3 = 30;
        double c3 = -5.9, d3 = -4.5;
        System.out.println(Math.max(a3, b3));
        System.out.println(Math.max(c3, d3));
        
        System.out.println("Min");
        int a4 = 20, b4 = 30;
        double c4 = -5.9, d4 = -4.5;
        System.out.println(Math.min(a4, b4));
        System.out.println(Math.min(c4, d4));
        
        System.out.println("SQRT");
        double a5 = 900;
        System.out.println("A raiz quadrada de 900 eh: " + Math.sqrt(a5));
    
        System.out.println("Pow");
        double a6 = 30, b6 = 2;
        System.out.println("O quadrado de 30 eh: " + Math.pow(a6, b6));
        
        System.out.println("Random");
        int num = ( int )(Math.random() * 100);
        System.out.println("Randomico entre 0 e 99 : " + num);
    }
    
}
