/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leituraescritaarquivo;
import java.util.Scanner;
import java.util.Formatter;
import java.io.*;

public class LeituraEscritaArquivo {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fil = new FileInputStream("arq2.txt");
        Scanner scan = new Scanner(fil);
        
        String s = "";
        while (scan.hasNext())
        {
            s = s + scan.nextLine() + "\n";
        }
        scan.close();
        
        Formatter formater = new Formatter("arq2.txt");
        formater.format(s);
        formater.format("Texto no final de tudo");
        formater.close();
    }
}
