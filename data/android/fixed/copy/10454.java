@java.lang.Override
public void onWebSocketError(@org.jetbrains.annotations.NotNull
java.lang.Throwable cause) {
    super.onWebSocketError(cause);
    cause.printStackTrace(java.lang.System.err);
}