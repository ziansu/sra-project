@java.lang.Override
public java.lang.String toSymbolicString() {
    if (isDefined()) {
        return toString(true);
    }
    return app.getPlain("undefined");
}