public void beforeCompletion() {
    this.cmdScopedEntityManager = ((org.drools.persistence.jpa.AbstractPersistenceContextManager) (this.service.tpm)).getCommandScopedEntityManager();
}