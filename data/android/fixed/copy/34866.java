@java.lang.Override
public int findBiggestWebsiteId() {
    return java.lang.Integer.parseInt(("" + (em.createNamedQuery("Website.findBiggestId").setMaxResults(1).getResultList().get(0))));
}