private void processNegative() {
    while (!(queue.isEmpty())) {
        java.util.Queue q;
        net.serenitybdd.core.photography.ScreenshotNegative negative = queue.get(0);
        if (negative != null) {
            process(negative);
        }
    } 
}