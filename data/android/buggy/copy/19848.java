@java.lang.Override
public void afterPropertiesSet() {
    super.afterPropertiesSet();
    this.setAuditorAware(this.auditorAware);
}