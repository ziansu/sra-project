private org.springframework.instrument.classloading.LoadTimeWeaver getLoadTimeWeaver() {
    return new org.springframework.instrument.classloading.tomcat.TomcatLoadTimeWeaver();
}