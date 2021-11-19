@java.lang.Override
public com.squareup.javapoet.AnnotationSpec.Builder visitArray(java.util.List<? extends javax.lang.model.element.AnnotationValue> values, java.lang.String name) {
    for (javax.lang.model.element.AnnotationValue value : values) {
        value.accept(this, name);
    }
    return builder;
}