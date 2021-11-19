@java.lang.Override
public si.fri.tpo.entitete.Obisk returnObisk(int id) {
    return ((si.fri.tpo.entitete.Obisk) (em.createNamedQuery("Obisk.findOne").setParameter("id", id).getSingleResult()));
}