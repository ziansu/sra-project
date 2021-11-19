@java.lang.Override
public void onStart() {
    if ((downloadListener.get()) != null) {
        downloadListener.get().onStart();
    }
}