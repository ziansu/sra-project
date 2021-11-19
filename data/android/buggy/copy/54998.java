private boolean isNativeForWrongBackend(java.util.Set<java.lang.String> backends) {
    return (backends != null) && (!(com.redhat.ceylon.compiler.typechecker.tree.TreeUtil.isForBackend(backends, unit.getSupportedBackends())));
}