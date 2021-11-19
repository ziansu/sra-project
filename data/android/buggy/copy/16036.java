public org.ektorp.ViewQuery endKey(java.lang.Object o) {
    reset();
    try {
        endKey = mapper.writeValueAsString(o);
    } catch (java.lang.Exception e) {
        throw org.ektorp.Exceptions.propagate(e);
    }
    return this;
}