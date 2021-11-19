public <T> void transactional(me.gerenciar.sdao.factory.DAOFactory.Runnable<T> runnable) {
    transactional(runnable, false, null, null, null, null, null);
}