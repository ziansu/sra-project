public boolean setParameter(@lombok.NonNull
java.lang.String name, java.lang.Object value) throws java.lang.NullPointerException {
    try {
        doSetParameter(name, value);
    } catch (java.lang.Throwable e) {
        return false;
    }
    return true;
}