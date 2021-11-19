@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    java.lang.System.out.println("on unbind ");
    close();
    return super.onUnbind(intent);
}