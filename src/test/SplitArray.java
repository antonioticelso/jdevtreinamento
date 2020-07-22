package test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        String texto = "alex, java, 89, 80, 90, 75";
        String[] valorArray = texto.split(",");

        System.out.println("nome: " + valorArray[0]);
        System.out.println("disciplina: " + valorArray[1]);
        System.out.println("nota 1: " + valorArray[2]);
        System.out.println("nota 2: " + valorArray[3]);
        System.out.println("nota 3: " + valorArray[4]);
        System.out.println("nota 4: " + valorArray[5]);

        List<String> list = Arrays.asList(valorArray);

        for (String valorString : list) {
            System.out.println(valorString);
        }

        String[] convertArray = list.toArray(new String[6]);
        System.out.println(convertArray);

        for (int pos = 0; pos < convertArray.length; pos++) {
            System.out.println(convertArray[pos]);
        }
    }

}


