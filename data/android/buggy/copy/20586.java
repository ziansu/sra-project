@java.lang.Override
public void addTextChangedListener(android.text.TextWatcher watcher) {
    if (watcher.equals(mTextWatcher)) {
        super.addTextChangedListener(watcher);
    }else {
        mTextWatchers.add(watcher);
    }
}