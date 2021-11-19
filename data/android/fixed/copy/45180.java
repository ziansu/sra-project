@java.lang.Override
public void update() {
    if (hasWorldObj()) {
        if ((soundDelay) > 0) {
            --(soundDelay);
        }
    }
}