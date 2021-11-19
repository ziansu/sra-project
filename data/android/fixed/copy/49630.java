@java.lang.Override
public int runFop(de.abas.eks.jfop.remote.FOPSessionContext fopSessionContext, java.lang.String[] args) throws de.abas.eks.jfop.FOPException {
    dbContext = fopSessionContext.getDbContext();
    mode = de.abas.training.basic.common.AbstractAjoAccess.ContextMode.SERVER_MODE;
    addDefaultMessageListener();
    return run(args);
}