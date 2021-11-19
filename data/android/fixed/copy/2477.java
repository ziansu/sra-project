boolean isPropDefinedOnSubtype(com.google.javascript.jscomp.newtypes.QualifiedName pname) {
    com.google.common.base.Preconditions.checkArgument(pname.isIdentifier());
    com.google.javascript.jscomp.newtypes.NominalType nt = getNominalType();
    return nt.isBuiltinObject() ? false : nt.isPropDefinedOnSubtype(pname);
}