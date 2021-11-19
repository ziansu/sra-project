public void setOriginScope(java.lang.String scope) {
    if (scope != null) {
        props.put(org.universAAL.middleware.rdf.ScopedResource.PROP_ORIG_SCOPE, scope);
    }else {
        props.remove(org.universAAL.middleware.rdf.ScopedResource.PROP_ORIG_SCOPE);
    }
}