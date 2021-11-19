private com.qa.cdstore.model.CD findCD(java.lang.Long id) {
    return em.find(com.qa.cdstore.model.CD.class, id);
}