package Intro;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int[3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        int[][] matriz2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        System.out.println("Elemento matriz [1][1]: " + matriz[1][1]);
        System.out.println("Elemento matriz2 [2][0]: " + matriz2[2][0]);
    }
}
