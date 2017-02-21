package wordgame;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(5, 5);
        WordSearcher wordSearcher = new WordSearcher();
        Scanner input = new Scanner(System.in);

        matrix.printMatrix();
        while (true) {
            String keyWord = input.next();
            wordSearcher.searchWordIn(matrix, keyWord);
        }
    }
}
