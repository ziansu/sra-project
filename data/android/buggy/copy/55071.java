public void run() {
    new javafx.embed.swing.JFXPanel();
    java.lang.System.out.println("new'd JAVAFXpanel!");
    latch.countDown();
}