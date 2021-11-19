public boolean hasActiveTransactionInterceptor() {
    return com.oneandone.ejbcdiunit.persistence.SimulatedTransactionManager.activeTransactionInterceptor.get();
}