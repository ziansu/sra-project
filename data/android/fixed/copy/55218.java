public java.util.List<com.lftechnology.batch7crud.model.User> fetch(int offset, int limit) throws com.lftechnology.batch7crud.exception.DataException {
    return userDAOImpl.fetch(offset, limit);
}