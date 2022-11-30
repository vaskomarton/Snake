public class Board {
    char[][] matrix = new char[15][15];
    char wall = '*';

    public Board() {

    }

    private void setDefaultValues() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || j == 0 || i == matrix.length - 1 || j == matrix[i].length - 1) {
                    matrix[i][j] = wall;
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
    }
}