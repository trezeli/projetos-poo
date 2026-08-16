/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package criacaometodos01;

/**
 *
 * @author queir
 */
public class CriacaoMetodos01 {

    public static void tela (String texto) 
    {
        System.out.println("O texto informado eh: ");
        System.out.println(texto);
    }
    
    public static void limpatela(){
        for (int i = 1; i <= 25; i++){
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        String frase = "O gato roeu a roupa do rei de Roma";
        CriacaoMetodos01.limpatela();
        tela(frase);
    }
    
}
