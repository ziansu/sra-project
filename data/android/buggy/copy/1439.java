public static <E> E createProjection(E wrapped, java.lang.Class<?> projection) {
    return ((E) (org.springframework.cglib.proxy.Enhancer.create(org.dspace.content.Item.class, new org.dspace.app.rest.projection.RestProjectionFactory(wrapped, projection))));
}