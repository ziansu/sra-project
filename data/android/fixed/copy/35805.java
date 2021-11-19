public void save(com.poojan.model.Sale sale) {
    session.beginTransaction();
    session.save(sale);
    session.getTransaction().commit();
}