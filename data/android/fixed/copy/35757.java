@java.lang.Override
public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) {
    com.philemonworks.selfdiagnose.check.vendor.SpringApplicationContextInjector.inject(applicationContext);
}