/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leituraescritaarquivo;
import java.util.Formatter;
import java.io.*;

public class EscritaArquivo {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
      Formatter formater;
      formater = new Formatter("arq1.txt");
      int i = 67;
      formater.format("Valor = %d\n", i);
      formater.format("Texto no final de tudo");
      formater.close();
    }
}
