public entity.Company getCompany(int cvr) {
    javax.persistence.EntityManager em = getEntityManager();
    entity.Company company;
    try {
        company = em.find(entity.Company.class, cvr);
    } finally {
        em.close();
    }
    return company;
}