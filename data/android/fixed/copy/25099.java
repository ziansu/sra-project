@java.lang.Override
public java.lang.String deleteCD(java.lang.Integer cdId) {
    com.qa.cdstore.model.CD cd = findCD(cdId);
    if (cd != null) {
        em.remove(cd);
    }
    return "{\"message\": \"cd successfully removed\"}";
}