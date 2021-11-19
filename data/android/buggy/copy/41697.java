public void setup(io.github.bonigarcia.wdm.Architecture arch) {
    try {
        this.getClass().newInstance().manage(arch, DriverVersion.NOT_SPECIFIED);
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
        throw new java.lang.RuntimeException(e);
    }
}