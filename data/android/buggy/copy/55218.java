public java.util.List<com.lftechnology.batch7crud.model.User> fetch(int page, int limit) throws com.lftechnology.batch7crud.exception.DataException {
    return userDAOImpl.fetch(page, limit);
}