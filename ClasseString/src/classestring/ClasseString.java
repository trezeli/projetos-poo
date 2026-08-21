/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classestring;

public class ClasseString {

    public static void main(String[] args) {
        String frase = "Vou estudar esse modulo";
        int tamanho = frase.length();
        System.out.println("O tamanho da string: \"" + frase + "\" eh " + tamanho);

        int num = 2;
        char n = "AACDD".charAt(num);
        System.out.println("O caracter na posicao " + num + " eh " + n);

        String nome = "Bosta";
        System.out.println(nome);
        System.out.println(nome.toUpperCase());
        System.out.println(nome);
        System.out.println(nome.toLowerCase());
        System.out.println(nome);

        String frase1 = "O rato roeu";
        System.out.println(frase1.substring(2, 6));
        System.out.println(frase1.substring(6));

        String nome1 = " Estados Unidos ";
        System.out.println(nome1);
        System.out.println(nome1.trim());
        nome1 = nome1.trim();
        System.out.println(nome1);
        System.out.println(nome1.trim());

        String frase2 = "Mariana gosta de nana banana".replace(" ", "");
        frase2 = frase2.replace("na", "NA");
        System.out.println(frase2);

        String x = "";
        x = x + String.valueOf(23) + String.valueOf(true) + " - ";
        x = x + String.valueOf(Math.PI);

        System.out.println(x);

        String texto = "Linguagem de Programacao";
        char caracter = 'a';

        int indice = texto.indexOf(caracter);
        System.out.println(indice);
        indice++;
        indice = texto.indexOf(caracter, indice);
        System.out.println(indice);
        indice = texto.indexOf("acao", indice);
        System.out.println(indice);
    }

}
