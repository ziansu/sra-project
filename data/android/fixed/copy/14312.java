public entity.Company getCompany(int id) {
    javax.persistence.EntityManager em = getEntityManager();
    entity.Company company;
    try {
        company = em.find(entity.Company.class, id);
    } finally {
        em.close();
    }
    return company;
}