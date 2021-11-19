public boolean isAProxyFor(java.lang.Class<? extends net.thucydides.core.webdriver.WebDriver> somedriverClass) {
    return somedriverClass.isAssignableFrom(getDriverClass());
}