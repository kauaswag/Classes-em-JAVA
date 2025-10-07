package Intro;

public class Vetor01 {
    public static void main(String[] args) {
        int[] vetor = { 10, 20, 30, 40, 50 };
        System.out.println(" --- Percorrendo com o loop FOR tradicional --- ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
