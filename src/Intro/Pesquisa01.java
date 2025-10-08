package Intro;

public class Pesquisa01 {

    public static int[] buscaSequencial(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int valorProcurado = 5;
        int[] resultado = buscaSequencial(matriz, valorProcurado);
        if (resultado != null) {
            System.out.println("Valor encontrado na posição: [" + resultado[0] + "][" + resultado[1] + "]");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

}
