public final java.util.HashMap<java.lang.String, java.lang.Object> getProperties() {
    if (!(net.es.netshell.kernel.exec.KernelThread.currentKernelThread().getUser().isPrivileged())) {
        throw new java.lang.SecurityException("not authorized");
    }
    return this.properties;
}