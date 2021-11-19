@java.lang.Override
public void onMessage(java.lang.Object object) {
    if (object instanceof messages.Message) {
        onMessage(((messages.Message) (object)));
    }
}