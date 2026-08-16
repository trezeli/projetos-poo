/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leituraescritaarquivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivo {
    public static void main(String[] args) {
        try {
            FileInputStream fil = new FileInputStream("arq.txt");
            Scanner scan = new Scanner(fil);

            int num2 = scan.nextInt();
            int num1 = scan.nextInt();
            double num3 = scan.nextDouble();

            System.out.println(num2 + num1);
            System.out.println(num3);

            scan.close();

        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo nao encontrado");
        }
    }
}