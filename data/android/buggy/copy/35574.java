@java.lang.Override
protected com.jecelyin.editor.v2.core.text.SpannableStringBuilder doInBackground(java.io.File... params) {
    if (!(fileReader.read()))
        return null;
    
    return listener.onAsyncReaded(fileReader, true);
}