@java.lang.Override
public void run() {
    roundTimeline.stop();
    timeLeft.setText("N/A");
    chatData.appendText((winner + " guessed correctly and wins the round !\n\n"));
}