public static void restart() {
    if (org.nschmidt.ldparteditor.helpers.StopWatch.running) {
        org.nschmidt.ldparteditor.helpers.StopWatch.reset();
        org.nschmidt.ldparteditor.helpers.StopWatch.start();
    }
}