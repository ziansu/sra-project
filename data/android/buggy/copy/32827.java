com.google.common.base.Optional<nz.bradcampbell.paperparcel.AdapterGraph> getGraph(javax.lang.model.type.TypeMirror normalizedType) {
    return com.google.common.base.Optional.fromNullable(graphs.get(com.squareup.javapoet.TypeName.get(normalizedType)));
}