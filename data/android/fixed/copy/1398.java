@java.lang.Override
public void run() {
    message = INIT;
    gameManager.write(message);
    new java.lang.Thread(new es.carlosrolindez.ping.GameFragment.GameRunnable(false)).start();
}