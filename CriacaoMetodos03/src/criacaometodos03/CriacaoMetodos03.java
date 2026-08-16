/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package criacaometodos03;

public class CriacaoMetodos03 {

    public static double area (double x){
        return (x * x);
    }
    
    public static double area (double x, double y){
        return (x * y);
    }
    
    public static void main(String[] args) {
        System.out.println("area de um quadrado " + area(3));
        System.out.println("area de um retangulo " + area(3, 2));
    }
    
}
