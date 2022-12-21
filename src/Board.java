import java.util.ArrayList;

public class Board {

    int HEIGTH = 15;
    int WIDTH = 15;
    char[][] matrix = new char[HEIGTH][WIDTH];
    char wall = '*';
    char space = ' ';

    public Board() {
        setDefaultValues();
    }


    private void setDefaultValues() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || j == 0 || i == matrix.length - 1 || j == matrix[i].length - 1) {
                    matrix[i][j] = wall;
                } else {
                    matrix[i][j] = space;
                }
            }
        }
    }
    public int getHeight () {
        return HEIGTH;
    }
    public int getWidth() {
        return WIDTH;
    }

}