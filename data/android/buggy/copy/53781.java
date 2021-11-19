public com.quantiply.samza.Timer timer(java.lang.String name) {
    com.quantiply.samza.Timer t = codaRegistry.timer(name);
    return registerWithSamza(name, t);
}