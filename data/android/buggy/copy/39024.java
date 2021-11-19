@java.lang.Override
public boolean canRead(java.lang.reflect.Type type, java.lang.Class<?> contextClass, org.springframework.http.MediaType mediaType) {
    return super.canRead(type.getClass(), mediaType);
}