private java.lang.String getAnnotationKey(java.lang.reflect.Member member, @javax.annotation.Nullable
java.lang.reflect.AnnotatedElement target) {
    if (member instanceof java.lang.reflect.AnnotatedElement) {
        return getAnnotationKey(((java.lang.reflect.AnnotatedElement) (member)), target);
    }
    return null;
}