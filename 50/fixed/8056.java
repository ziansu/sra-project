@java.lang.Override
public void onStop() {
    ensureStop();
    if (registered) {
        context.unregisterReceiver(myNoisyAudioStreamReceiver);
        registered = false;
    }
}