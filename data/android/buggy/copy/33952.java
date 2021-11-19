@java.lang.Override
public void debug(@javax.annotation.Nonnull
java.lang.Object msg, @javax.annotation.Nonnull
java.lang.Throwable t) {
    if (org.apache.log4j.Level.DEBUG.isGreaterOrEqual(level)) {
        java.lang.System.out.println(("[DEBUG]\t" + (wrapMsg(msg))));
        t.printStackTrace();
    }
}