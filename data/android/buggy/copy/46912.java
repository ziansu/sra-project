@java.lang.Override
public void stateTransition(org.ehcache.Status from, org.ehcache.Status to) {
    if (to == (Status.UNINITIALIZED)) {
        try {
            storeProvider.releaseStore(store);
        } catch (java.lang.RuntimeException ex) {
            throw new org.ehcache.exceptions.StateTransitionException(ex);
        }
    }
}