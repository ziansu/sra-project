public void setup() {
    try {
        this.getClass().newInstance().manage(io.github.bonigarcia.wdm.BrowserManager.DEFAULT_ARCH, DriverVersion.NOT_SPECIFIED);
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
        throw new java.lang.RuntimeException(e);
    }
}