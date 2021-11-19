@java.lang.Override
public void error(@javax.annotation.Nonnull
java.lang.Object msg, @javax.annotation.Nonnull
java.lang.Throwable t) {
    if (org.apache.log4j.Level.ERROR.isGreaterOrEqual(level)) {
        java.lang.System.err.println(("[ERROR]\t" + (wrapMsg(msg))));
        t.printStackTrace();
    }
}