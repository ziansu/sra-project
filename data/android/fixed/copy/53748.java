@java.lang.Override
public void notice(final java.lang.String format, final java.lang.Object... args) {
    super.notice(("%s: " + format), com.google.common.collect.Lists.asList(this.listener, args));
}