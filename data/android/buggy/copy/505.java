@org.springframework.context.annotation.Bean
private org.springframework.orm.jpa.JpaTransactionManager transactionManager() {
    org.springframework.orm.jpa.JpaTransactionManager transactionManager = new org.springframework.orm.jpa.JpaTransactionManager();
    transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
    return transactionManager;
}