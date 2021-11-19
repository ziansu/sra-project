public java.lang.String toLaTeXString(boolean symbolic) {
    if (isDefined())
        return fun.toLaTeXString(symbolic);
    else
        return app.getPlain("undefined");
    
}