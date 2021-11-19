@mockit.internal.state.Nullable
private static java.lang.String getReturnTypeIfCascadingSupportedForIt(@mockit.internal.state.Nonnull
java.lang.String typeDesc) {
    java.lang.String typeName = mockit.internal.state.MockedTypeCascade.getInternalTypeName(typeDesc);
    return mockit.internal.state.MockedTypeCascade.isTypeSupportedForCascading(typeName) ? typeName : null;
}