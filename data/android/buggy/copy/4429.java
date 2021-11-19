public R visit(final visitor.Inicio n) {
    R nRes = null;
    try {
        n.f0.accept(this);
    } catch (java.lang.NullPointerException ex) {
    }
    return nRes;
}