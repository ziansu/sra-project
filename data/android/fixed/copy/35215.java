public void calculateElapsedTime() {
    long elapsedMillis = java.lang.System.currentTimeMillis();
    long elapsedSeconds = elapsedMillis / 1000;
    long elapsedMinutes = elapsedSeconds / 60;
    displayableSeconds = elapsedSeconds % 60;
    displayableMinutes = elapsedMinutes % 60;
}