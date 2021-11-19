private java.lang.String getExceptionMessage(java.lang.Throwable throwable, java.lang.Integer statusCode) {
    if (throwable != null) {
        return com.google.common.base.Throwables.getRootCause(throwable).getMessage();
    }
    org.springframework.http.HttpStatus httpStatus = org.springframework.http.HttpStatus.valueOf(statusCode);
    return httpStatus.getReasonPhrase();
}