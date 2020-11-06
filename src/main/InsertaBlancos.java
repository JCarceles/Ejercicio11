package main;

import java.util.Scanner;

public class InsertaBlancos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique la frase");
        String laFrase = lector.nextLine();
        int posicion = 0;
        StringBuilder frase = new StringBuilder(laFrase);
        do {
            posicion = frase.indexOf(" ", posicion);
            if (posicion!=-1){
                frase.insert(posicion, " ");
                posicion +=2;
            }           
         }while (posicion !=-1);
        System.out.println("La frase inicial: ");
        System.out.println(laFrase);
        System.out.println("La frase final: ");
        System.out.println(frase);
    
    }

}
