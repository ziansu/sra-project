private boolean isInterface(javax.lang.model.type.TypeMirror typeMirror) {
    return (typeMirror instanceof javax.lang.model.type.DeclaredType) && ((((javax.lang.model.type.DeclaredType) (typeMirror)).asElement().getKind()) == (javax.lang.model.element.ElementKind.INTERFACE));
}