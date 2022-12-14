public class Food {
    char egg = 'O';
    int xAxis;
    int yAxis;

    Food (Board board) {
        xAxis =(int) (Math.random() * (board.WIDTH-2)+1);
        yAxis = (int) (Math.random() * (board.HEIGTH-2)+1);
    }
}