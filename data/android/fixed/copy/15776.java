@java.lang.Override
public void print(com.noveogroup.android.log.Level level, java.lang.Throwable throwable, java.lang.String message) {
    if ((handler) != null) {
        handler.print(getName(), level, throwable, message);
    }
}