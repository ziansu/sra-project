@java.lang.Override
public boolean storeGame(java.lang.String id, de.htwg.sa.nmm.persistence.PersistenceStrategy strategy) {
    gamefield.setId(id);
    de.htwg.sa.nmm.persistence.IDAO dao = daos.get(strategy);
    de.htwg.sa.nmm.persistence.OperationResult result = dao.storeGamefield(gamefield);
    return result.successful;
}