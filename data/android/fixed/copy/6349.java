@java.lang.Override
public boolean matches(final java.lang.Object testObject) {
    providedLines = ((java.lang.String[]) (testObject));
    return (providedLines.length) == count;
}