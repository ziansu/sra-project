@java.lang.Override
public void info(@javax.annotation.Nonnull
java.lang.Object msg) {
    if (org.apache.log4j.Level.INFO.isGreaterOrEqual(level)) {
        java.lang.System.out.println(("[INFO]\t" + (wrapMsg(msg))));
    }
}