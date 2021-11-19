@java.lang.Override
public com.squareup.javapoet.AnnotationSpec.Builder visitAnnotation(javax.lang.model.element.AnnotationMirror a, com.squareup.javapoet.AnnotationSpec.Entry entry) {
    return builder.addMember(entry.name, "$L", com.squareup.javapoet.AnnotationSpec.get(a));
}