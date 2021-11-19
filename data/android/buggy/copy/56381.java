public static org.apache.sling.api.resource.ResourceResolver getResourceResolverForUserNested(org.apache.sling.api.resource.ResourceResolverFactory factory, java.lang.String userId) throws org.apache.sling.api.resource.LoginException {
    org.apache.sling.api.resource.ResourceResolver resolver;
    resolver = com.example.SampleServlet.getResourceResolverForUser(resourceResolverFactory, null);
    return resolver;
}