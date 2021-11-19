public entity.Hobby getHobby(java.lang.String name) {
    javax.persistence.EntityManager em = getEntityManager();
    entity.Hobby hobby;
    try {
        hobby = em.find(entity.Hobby.class, name);
    } finally {
        em.close();
    }
    return hobby;
}