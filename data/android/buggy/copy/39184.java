public static java.lang.Boolean setEnabled(java.lang.Boolean enabled) {
    java.lang.Boolean was = com.redhat.ceylon.model.typechecker.context.ProducedTypeCache.isEnabled();
    com.redhat.ceylon.model.typechecker.context.ProducedTypeCache.cachingEnabled.set(enabled);
    return was;
}