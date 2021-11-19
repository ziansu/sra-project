@java.lang.Override
public void run() {
    mSearchButton.setEnabled(true);
    if (onDone != null) {
        onDone.run();
    }
}