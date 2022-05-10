package com.safenar;

public class GameLoop {
    public boolean running;
    private long lastTime;

    public GameLoop(boolean running) {
        this.running = running;
        lastTime = System.nanoTime();
    }

    public void run(Runnable runnable) {
        while (running) {
            runnable.run();

            try {
                Thread.sleep(getDeltaTime()/ 1000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public long getDeltaTime() {
        long currentTime = System.nanoTime();
        long deltaTime = currentTime - lastTime;
        lastTime = currentTime;
        return deltaTime;
    }
//    run method that runs the game loop
//            long start = System.currentTimeMillis();
//            long elapsed = System.currentTimeMillis() - start;
//            System.out.println("elapsed = " + elapsed);
//            int FPS = 60;
//            long targetTime = 1000 / FPS;
//            long wait = targetTime - elapsed / 1000000;
//            if (wait < 0 ) wait = 5;
//            System.out.println("wait = " + wait);
//            try {
//                Thread.sleep(wait);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            runnable.run();

}
