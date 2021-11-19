private boolean isInterface(javax.lang.model.type.TypeMirror typeMirror) {
    if (!(typeMirror instanceof javax.lang.model.type.DeclaredType)) {
        return false;
    }
    return (((javax.lang.model.type.DeclaredType) (typeMirror)).asElement().getKind()) == (javax.lang.model.element.ElementKind.INTERFACE);
}