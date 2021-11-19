public void writeTypeParameters(final java.lang.Iterable<com.strobel.decompiler.languages.java.TypeParameterDeclaration> typeParameters, boolean isGeneric) {
    if (any(typeParameters)) {
        writeToken(Roles.LEFT_CHEVRON);
        writeCommaSeparatedList(typeParameters, isGeneric);
        writeToken(Roles.RIGHT_CHEVRON);
    }
}