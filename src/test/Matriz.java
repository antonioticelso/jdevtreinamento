package test;

public class Matriz {

    public static void main(String[] args) {

        int notas[][] = new int[2][3];

        notas[0][0] = 80;
        notas[0][1] = 90;
        notas[0][2] = 70;

        notas[1][0] = 75;
        notas[1][1] = 85;
        notas[1][2] = 80;

        for (int pslinha = 0; pslinha < notas.length; pslinha++) {
            System.out.println("------------------------------------------------");

            for (int pscoluna = 0; pscoluna < notas[pslinha].length; pscoluna++) {
                System.out.println(notas[pslinha][pscoluna]);

            }
        }

    }

}
