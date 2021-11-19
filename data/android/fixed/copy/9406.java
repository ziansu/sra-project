@java.lang.Override
public void info(@javax.annotation.Nonnull
java.lang.Object msg) {
    if (level.isGreaterOrEqual(org.apache.log4j.Level.INFO)) {
        java.lang.System.out.println(("[INFO]\t" + (wrapMsg(msg))));
    }
}