public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws org.springframework.beans.BeansException {
    com.philemonworks.selfdiagnose.check.vendor.SpringApplicationContextInjector.inject(applicationContext);
}