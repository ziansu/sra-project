@java.lang.Override
public boolean accepts(java.lang.reflect.Field field) {
    return (field.isAnnotationPresent(sirius.search.annotations.NestedObject.class)) && (!(field.isAnnotationPresent(sirius.search.annotations.FastCompletion.class)));
}