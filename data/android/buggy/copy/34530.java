public org.superbiz.moviefun.blobstore.Blob buildDefaultCoverBlob() {
    java.lang.ClassLoader classLoader = getClass().getClassLoader();
    java.io.InputStream input = classLoader.getResourceAsStream("default-cover.jpg");
    return new org.superbiz.moviefun.blobstore.Blob("default-cover", input, org.springframework.http.MediaType.IMAGE_JPEG_VALUE);
}