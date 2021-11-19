public model.User updateUser(model.User user) {
    model.EntityManager em = getEntityManager();
    return em.merge(user);
}