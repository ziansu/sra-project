@java.lang.Override
public com.google.common.base.Predicate<javax.jcr.observation.Event> getFilter(final javax.jcr.Session session) {
    return new org.fcrepo.kernel.impl.observer.DefaultFilter(session);
}