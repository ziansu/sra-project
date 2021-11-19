@java.lang.Override
public void run() {
    roundTimeline.stop();
    timeLeft.setText("N/A");
    chatData.appendText((("Time up ! The word was : " + (gameState.getCurrentWord())) + ".\nNext round starting soon...\n\n"));
}