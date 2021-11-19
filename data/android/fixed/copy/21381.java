@java.lang.Override
public void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
    com.qwertygid.deutschsim.Miscellaneous.Tools.error(frame, ("An uncaught exception has slipped through! Report this, please.\n" + (e.getMessage())));
}