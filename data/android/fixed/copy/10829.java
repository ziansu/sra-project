public boolean isExactly(com.redhat.ceylon.model.typechecker.model.ProducedType type) {
    return (type != null) && (resolveAliases().isExactlyInternal(type.resolveAliases()));
}