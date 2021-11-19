@java.lang.Override
public void run() {
    if (shouldSpeak) {
        sendMessage((-1));
    }else {
        mRepeatEndMessageTimer.cancel();
    }
}