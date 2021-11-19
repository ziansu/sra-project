protected org.springframework.http.MediaType getMediaType(javax.servlet.http.HttpServletRequest request, org.springframework.core.io.Resource resource) {
    org.springframework.http.MediaType mediaType = getMediaType(resource);
    if (mediaType != null) {
        return mediaType;
    }
    return this.pathExtensionStrategy.getMediaTypeForResource(resource);
}