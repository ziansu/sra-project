public <T> void transactional(me.gerenciar.sdao.factory.DAOFactory.Runnable<T> runnable, boolean force) {
    transactional(runnable, force, null, null, null, null, null);
}