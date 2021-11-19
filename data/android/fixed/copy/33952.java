@java.lang.Override
public void debug(@javax.annotation.Nonnull
java.lang.Object msg, @javax.annotation.Nonnull
java.lang.Throwable t) {
    if (level.isGreaterOrEqual(org.apache.log4j.Level.DEBUG)) {
        java.lang.System.out.println(("[DEBUG]\t" + (wrapMsg(msg))));
        t.printStackTrace();
    }
}