public class SnakeMap /*implements Runnable */{
    Board board;
    public SnakeMap(){
        this.board=new Board();
    }
/*
    final int FPS = 20;
    Thread gameTread;

    @Override
    public void run() {
        // not so accurate maybe perform better
        long lastTime = System.currentTimeMillis();
        double ms = 1000 / FPS;//ms stands for miliseconds
        double delta = 0;
        long now;
        while (gameTread != null) {
            now = System.currentTimeMillis();
            delta += (now - lastTime) / ms;
            lastTime = now;
            if (delta >= 0) {

                delta--;

            }
        }
    }*/
}