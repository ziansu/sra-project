public static org.apache.felix.resolver.util.ShadowList deepCopy(org.apache.felix.resolver.util.ShadowList original) {
    return new org.apache.felix.resolver.util.ShadowList(original.unmodifiable, original.m_original, original.isUnmodifiable);
}