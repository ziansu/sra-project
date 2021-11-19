@java.lang.Override
public com.squareup.javapoet.AnnotationSpec.Builder visitAnnotation(javax.lang.model.element.AnnotationMirror a, java.lang.String name) {
    return builder.addMember(name, "$L", com.squareup.javapoet.AnnotationSpec.get(a));
}