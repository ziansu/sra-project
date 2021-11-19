public java.util.Set<org.springframework.http.MediaType> produces() {
    return com.google.common.collect.Sets.union(requestContext.produces(), toMediaTypes(getDocumentationContext().getProduces()));
}