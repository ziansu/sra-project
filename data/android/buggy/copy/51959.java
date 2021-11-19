@java.lang.Override
public void run() {
    try {
        fallingStars();
        fallingBerries();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}