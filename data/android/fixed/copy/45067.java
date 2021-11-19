@java.lang.Override
public void run() {
    if (moving) {
        xPos -= 10;
        if ((xPos) < (-100))
            stop();
        
        handler.postDelayed(this, 10);
    }
}