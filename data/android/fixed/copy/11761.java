public java.lang.String getGenericTypeDefinition() {
    if (!(isGeneric())) {
        return name;
    }
    return java.lang.String.format("%s<%s>", name, typeParameters.toParameterString());
}