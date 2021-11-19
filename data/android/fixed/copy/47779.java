@java.lang.Override
public void saveOrUpdate(ch.fhnw.edu.rental.model.Rental rental) {
    if ((rental.getId()) == null) {
        em.persist(rental);
    }else {
        em.merge(rental);
    }
}