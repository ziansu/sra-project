@java.lang.Override
public com.squareup.javapoet.AnnotationSpec.Builder visitType(javax.lang.model.type.TypeMirror t, java.lang.String name) {
    return builder.addMember(name, "$T.class", t);
}