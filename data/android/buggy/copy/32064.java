public org.springframework.instrument.classloading.LoadTimeWeaver getLoadTimeWeaver() {
    org.springframework.instrument.classloading.LoadTimeWeaver loadTimeWeaver = new org.springframework.instrument.classloading.tomcat.TomcatLoadTimeWeaver();
    return loadTimeWeaver;
}