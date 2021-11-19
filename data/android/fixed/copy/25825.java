protected org.springframework.beans.factory.support.BeanDefinitionRegistry getBeanDefinitionRegistry() {
    if ((beanDefinitionRegistry) == null) {
        org.springframework.beans.factory.config.AutowireCapableBeanFactory factory = getWebApplicationContext().getAutowireCapableBeanFactory();
        beanDefinitionRegistry = ((org.springframework.beans.factory.support.BeanDefinitionRegistry) (factory));
    }
    return beanDefinitionRegistry;
}