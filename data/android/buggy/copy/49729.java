private org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> getSuccess(java.util.Map<java.lang.String, java.lang.Object> body, org.springframework.http.MediaType mediaType) {
    return new org.springframework.http.ResponseEntity(body, getHttpHeaders(mediaType), org.springframework.http.HttpStatus.OK);
}