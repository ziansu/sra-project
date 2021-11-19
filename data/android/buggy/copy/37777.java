@java.lang.Override
public void error(final java.lang.String format, final java.lang.Object... args) {
    super.error(("%s: " + format), this.listener, com.google.common.collect.Lists.asList(this.listener, args));
}