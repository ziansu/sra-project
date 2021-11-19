public void update(long lastTime) {
    long now = java.lang.System.currentTimeMillis();
    if (now < lastTime)
        return ;
    else {
        move(dir, lastTime, now);
    }
}