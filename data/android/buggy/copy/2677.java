@java.lang.Override
public java.lang.Void visitArray(org.checkerframework.framework.type.AnnotatedTypeMirror.AnnotatedArrayType type, java.lang.Void aVoid) {
    java.lang.System.out.println(type);
    type.replaceAnnotation(org.checkerframework.checker.minlen.MinLenAnnotatedTypeFactory.createMinLen(0));
    java.lang.System.out.println(type);
    return super.visitArray(type, aVoid);
}