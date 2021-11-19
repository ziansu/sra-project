boolean isPropDefinedOnSubtype(com.google.javascript.jscomp.newtypes.QualifiedName pname) {
    com.google.common.base.Preconditions.checkArgument(pname.isIdentifier());
    com.google.javascript.jscomp.newtypes.NominalType nt = getNominalType();
    com.google.common.base.Preconditions.checkState((!(nt.isBuiltinObject())));
    return nt.isPropDefinedOnSubtype(pname);
}