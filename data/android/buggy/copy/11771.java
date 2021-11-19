public java.util.List<package_Cookie.Bestellung> findAllBestellungen() {
    java.lang.System.out.println("Aufruf findAllBestellungen");
    return em.createNamedQuery("Bestellung.findAll", package_Cookie.Bestellung.class).getResultList();
}