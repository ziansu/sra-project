public java.util.Collection<com.the_bean_quartet.msc_project.entities.BaseData> getAllModelRelatedData(int phoneModel) {
    javax.persistence.Query query = em.createQuery(("select count(bd.failureClass) from BaseData bd " + "where bd.ueTable.tac =:uetype"));
    query.setParameter("uetype", phoneModel);
    java.util.List<com.the_bean_quartet.msc_project.entities.BaseData> UEData1 = query.getResultList();
    return UEData1;
}