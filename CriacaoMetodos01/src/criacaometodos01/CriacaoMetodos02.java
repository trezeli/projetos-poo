/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package criacaometodos01;

public class CriacaoMetodos02 {

    public static long fatorial(long num){
        if (num <= 1){
            return 1;
        } else {
            return (num * fatorial(num - 1));
        }
    }
    public static void main(String[] args) {
        for (long i = 0; i <= 10; i++){
            System.out.println(i + " ! = " + fatorial(i));
        }
    }
    
}
