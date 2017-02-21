package wordgame;

public class WordSearcher {
    private int occurencies;
    private char[] word;

    public WordSearcher() {
        // TODO Auto-generated constructor stub
    }

    private void findWord(int posRow, int posCol, Matrix matrix, String keyWord) {
        char[][] charMatrix = matrix.getCharMatrix();
        word = keyWord.toCharArray();
        int wordLength = word.length;

        int copyRow = posRow;
        int copyCol = posCol;

        boolean isRightBorderCheck = copyCol + wordLength <= matrix.getCols();
        boolean isLeftBorderCheck = copyCol + 1 - wordLength >= 0;
        boolean isUpBorderCheck = copyRow + 1 - wordLength >= 0;
        boolean isDownBorderCheck = copyRow + wordLength <= matrix.getRows();

        if (wordLength != 1) {

            // SEARCH RIGHT
            if (isRightBorderCheck) {
                for (int j = 0; j < wordLength; j++) {
                    if (word[j] != charMatrix[copyRow][copyCol]) {
                        break;
                    }
                    copyCol++;
                    if (j == wordLength - 1) {
                        System.out.println("Namerena e duma nadqsno");
                        occurencies++;

                    }
                }
            }

            // SEARCH LEFT
            copyRow = posRow;
            copyCol = posCol;

            if (isLeftBorderCheck) {
                for (int j = 0; j < wordLength; j++) {
                    if (word[j] != charMatrix[copyRow][copyCol]) {
                        break;
                    }
                    copyCol--;
                    if (j == wordLength - 1) {
                        System.out.println("Namerena e duma nalqvo");
                        occurencies++;
                    }
                }
            }

            // SEARCH UP
            copyRow = posRow;
            copyCol = posCol;
            if (isUpBorderCheck) {
                for (int j = 0; j < wordLength; j++) {
                    if (word[j] != charMatrix[copyRow][copyCol]) {
                        break;
                    }
                    copyRow--;
                    if (j == wordLength - 1) {
                        System.out.println("Namerena e duma nagore");
                        occurencies++;
                    }
                }
            }

            // SEARCH DOWN
            copyRow = posRow;
            copyCol = posCol;

            if (isDownBorderCheck) {
                for (int j = 0; j < wordLength; j++) {
                    if (word[j] != charMatrix[copyRow][copyCol]) {
                        break;
                    }
                    copyRow++;
                    if (j == wordLength - 1) {
                        System.out.println("Namerena e duma nadolu");
                        occurencies++;
                    }
                }
            }

            // SEARCH DIAG RIGHT DOWN
            copyRow = posRow;
            copyCol = posCol;
            if (isRightBorderCheck && isDownBorderCheck) {
                for (int j = 0; j < wordLength; j++) {
                    if (word[j] != charMatrix[copyRow][copyCol]) {
                        break;
                    }
                    copyRow++;
                    copyCol++;
                    if (j == wordLength - 1) {
                        System.out.println("Namerena e duma diagonalno vdqsno nadolu");
                        occurencies++;
                    }
                }
            }

            // SEARCH DIAG RIGHT UP
            copyRow = posRow;
            copyCol = posCol;
            if (isRightBorderCheck && isUpBorderCheck) {
                for (int j = 0; j < wordLength; j++) {
                    if (word[j] != charMatrix[copyRow][copyCol]) {
                        break;
                    }
                    copyRow--;
                    copyCol++;
                    if (j == wordLength - 1) {
                        System.out.println("Namerena e duma diagonalno vdqsno nagore");
                        occurencies++;
                    }
                }
            }

            // SEARCH DIAG LEFT DOWN
            copyRow = posRow;
            copyCol = posCol;
            if (isLeftBorderCheck && isDownBorderCheck) {
                for (int j = 0; j < wordLength; j++) {
                    if (word[j] != charMatrix[copyRow][copyCol]) {
                        break;
                    }
                    copyRow++;
                    copyCol--;
                    if (j == wordLength - 1) {
                        System.out.println("Namerena e duma diagonalno vlqvo nadolu");
                        occurencies++;
                    }
                }
            }

            // SEARCH DIAG LEFT UP
            copyRow = posRow;
            copyCol = posCol;
            if (isLeftBorderCheck && isUpBorderCheck) {
                for (int j = 0; j < wordLength; j++) {
                    if (word[j] != charMatrix[copyRow][copyCol]) {
                        break;
                    }
                    copyRow--;
                    copyCol--;
                    if (j == wordLength - 1) {
                        System.out.println("Namerena e duma diagonalno vlqvo nagore");
                        occurencies++;
                    }
                }
            }
        } else {
            occurencies++;
            return;
        }
    }

    public void searchWordIn(Matrix matrix, String keyWord) {
        try {
            for (int i = 0; i < matrix.getCharMatrix().length; i++) {
                for (int j = 0; j < matrix.getCharMatrix()[i].length; j++) {
                    if (keyWord.charAt(0) == matrix.getCharMatrix()[i][j]) {
                        findWord(i, j, matrix, keyWord);
                    }
                }
            }
        } catch (StringIndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Error: empty string!");
            return;
        }
        System.out.println("Occurencies: " + occurencies);
        occurencies = 0;
    }
}
