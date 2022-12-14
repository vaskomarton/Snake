import java.util.ArrayList;
import java.util.Scanner;

public class Snake {
    boolean eaten;
    Food egg;

    char snakeDraw='S';
    ArrayList<Integer[]> snakeBody = new ArrayList<>();

    Integer[] lastBodyPart = new Integer[2];
    Direction direction;

    public Snake(int boardHeight, int boardWidth) {
        Integer[] start = {boardHeight / 2, boardWidth / 2};
        snakeBody.add(start);
    }

    public void snakeUpdate(Food egg) {
        this.egg = egg;
        snakeRun();
        eat();
        if (eaten) {
            snakeGrow();
        }
    }

    private void snakeGrow() {

    }

    public void snakeRun() {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        if (input.equals("w") && direction != Direction.DOWN) {
            lastBodyPart[0] = snakeBody.get(snakeBody.size()-1)[0];
            lastBodyPart[1] = snakeBody.get(snakeBody.size()-1)[1];
            snakeSlide();
            snakeBody.get(0)[0]--;
            direction = Direction.UP;
        }
        if (input.equals("s") && direction != Direction.UP) {
            lastBodyPart[0] = snakeBody.get(snakeBody.size()-1)[0];
            lastBodyPart[1] = snakeBody.get(snakeBody.size()-1)[1];
            snakeSlide();
            snakeBody.get(0)[0]++;
            direction = Direction.DOWN;
        }
        if (input.equals("a") && direction != Direction.RIGHT) {
            lastBodyPart[0] = snakeBody.get(snakeBody.size()-1)[0];
            lastBodyPart[1] = snakeBody.get(snakeBody.size()-1)[1];
            snakeSlide();
            snakeBody.get(0)[1]--;
            direction = Direction.LEFT;
        }
        if (input.equals("d") && direction != Direction.LEFT) {
            lastBodyPart[0] = snakeBody.get(snakeBody.size()-1)[0];
            lastBodyPart[1] = snakeBody.get(snakeBody.size()-1)[1];
            snakeSlide();
            snakeBody.get(0)[1]++;
            direction = Direction.RIGHT;
        }
    }

    private void snakeSlide() {
        for (int i = 0; i < this.snakeBody.size() - 1; i++) {
            this.snakeBody.set(this.snakeBody.size() - 1 - i,new Integer[]{this.snakeBody.get(this.snakeBody.size() - 2 - i)[0],this.snakeBody.get(this.snakeBody.size() - 2 - i)[1]});
        }
    }

    private void eat() {
        if (this.snakeBody.get(0)[0] == egg.yAxis && egg.xAxis == this.snakeBody.get(0)[1]) {
            eaten = true;
            this.snakeBody.add(lastBodyPart);
        } else {
            eaten = false;}
    }
}