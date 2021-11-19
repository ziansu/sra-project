public org.kframework.backend.java.kil.TermContext fork() {
    return new org.kframework.backend.java.kil.TermContext(global, new org.kframework.backend.java.kil.TermContext.FreshCounter(counter.value));
}