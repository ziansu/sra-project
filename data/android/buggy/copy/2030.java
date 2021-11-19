static org.opendaylight.mdsal.binding.javav2.model.api.Type referencedType(final java.lang.String type) {
    final int packageClassSeparator = type.lastIndexOf(org.opendaylight.mdsal.binding.javav2.runtime.context.BindingRuntimeContext.DOT);
    return new org.opendaylight.mdsal.binding.javav2.generator.util.ReferencedTypeImpl(type.substring(0, packageClassSeparator), type.substring((packageClassSeparator + 1)));
}