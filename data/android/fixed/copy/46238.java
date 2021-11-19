@org.springframework.context.annotation.Bean
@org.springframework.beans.factory.annotation.Qualifier(value = com.jpaex.sampledb.config.SampleDbConfiguration.QUALIFIER)
public org.springframework.data.jpa.support.MergingPersistenceUnitManager persistenceUnitManager() {
    org.springframework.data.jpa.support.MergingPersistenceUnitManager persistenceUnitManagerBean = new org.springframework.data.jpa.support.MergingPersistenceUnitManager();
    persistenceUnitManagerBean.setPersistenceXmlLocation("classpath*:META-INF/persistence.xml");
    persistenceUnitManagerBean.setDefaultPersistenceUnitName(env.getRequiredProperty("pu-name"));
    return persistenceUnitManagerBean;
}