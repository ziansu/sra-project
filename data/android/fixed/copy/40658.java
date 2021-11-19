public void gera() {
    java.lang.System.out.println("Gerando est�tisitcas");
    org.hibernate.Session session = this.manager.unwrap(org.hibernate.Session.class);
    this.estatisticas = session.getSessionFactory().getStatistics();
}