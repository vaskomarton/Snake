public class GameLogic /*implements Runnable */ {
    Board background;
    Food food;

    Snake snake;

    public GameLogic() {
        this.background = new Board();
        this.food = new Food(background);
        //background.matrix[food.yAxis][food.xAxis] = '0';
        this.snake = new Snake(background.getHeight(), background.getWidth());
    }

    public void update() {
        while (true) {
            snake.snakeUpdate(food);
            if (snake.eaten) {
                food = new Food(background);
            }
            draw();
        }
    }
    public void draw() {
        fakeClear();
        char[][] board = new char[background.getHeight()][background.getWidth()];
        for (int i = 0; i < background.getHeight(); i++) {
            for (int j = 0; j < background.getWidth(); j++) {
                board[i][j] = background.matrix[i][j];
            }
        }
        board[food.yAxis][food.xAxis] = food.egg;
        for (int i = 0; i < snake.snakeBody.size(); i++) {
            board[snake.snakeBody.get(i)[0]][snake.snakeBody.get(i)[1]] = snake.snakeDraw;
        }
        for (int i = 0; i < background.getHeight(); i++) {
            for (int j = 0; j < background.getWidth(); j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
    private void fakeClear() {
        System.out.println("\n".repeat(50));
    }
}