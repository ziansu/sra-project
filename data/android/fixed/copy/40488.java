private boolean keyExists(java.lang.String newkey) {
    return (em.createQuery("SELECT a FROM ApiKey a WHERE a.key= :newkey").setParameter("newkey", newkey).getResultList().size()) > 0;
}