public static <T> org.springframework.http.ResponseEntity<T> reseted(T entity) {
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.CREATED);
}