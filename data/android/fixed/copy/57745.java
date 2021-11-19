public com.quantiply.samza.Meter meter(java.lang.String name) {
    return registerWithSamza(name, codaRegistry.meter(name));
}