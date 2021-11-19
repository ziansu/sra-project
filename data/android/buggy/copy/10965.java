public edu.harvard.lib.librarycloud.collections.dao.UserCollection getUserCollection(int id) {
    edu.harvard.lib.librarycloud.collections.dao.UserCollection result = null;
    try {
        result = em.find(edu.harvard.lib.librarycloud.collections.dao.UserCollection.class, id);
    } catch (edu.harvard.lib.librarycloud.collections.dao.NoResultException e) {
        return null;
    }
    return result;
}