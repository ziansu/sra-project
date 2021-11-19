private void sleep(int time) {
    long startTime = java.lang.System.currentTimeMillis();
    while (((java.lang.System.currentTimeMillis()) - startTime) < time);
}