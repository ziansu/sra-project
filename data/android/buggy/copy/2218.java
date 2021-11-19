public java.lang.String toSymbolicString() {
    if (isDefined())
        return toString(true);
    else
        return app.getPlain("undefined");
    
}