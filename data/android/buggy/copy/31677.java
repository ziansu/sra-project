private void reportFinish() {
    progress.set(0);
    lastProgress = 0;
    java.lang.System.out.print((100 + "%\n"));
}