@java.lang.Override
public void run() {
    if ((completionListener) != null) {
        completionListener.onCompletion(null);
    }
    if ((bus) != null) {
        bus.post(new com.devbrackets.android.exomedia.event.EMMediaCompletionEvent());
    }
}