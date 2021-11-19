public com.vampiroTech.model.Goal save(com.vampiroTech.model.Goal goal) {
    em.persist(goal);
    return null;
}