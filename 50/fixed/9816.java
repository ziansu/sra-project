@java.lang.Override
public void addTextChangedListener(android.text.TextWatcher watcher) {
    if ((mListeners) == null) {
        mListeners = new java.util.ArrayList<>();
        super.addTextChangedListener(getTextWatcherDelegator());
    }
    mListeners.add(watcher);
}