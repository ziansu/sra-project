public org.springframework.orm.jpa.JpaVendorAdapter getJpaVendorAdapter() {
    org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter adapter = new org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter();
    adapter.setDatabase(Database.H2);
    adapter.setGenerateDdl(true);
    adapter.setShowSql(true);
    return adapter;
}