@javax.ejb.TransactionAttribute(value = javax.ejb.TransactionAttributeType.REQUIRED)
public java.util.List<fr.pizzeria.model.Commande> findByNum(java.lang.String num) {
    return this.em.createQuery(fr.pizzeria.admin.metier.CommandeService.FIND_BY_NUM, fr.pizzeria.model.Commande.class).setParameter("numeroCommande", num).getResultList();
}