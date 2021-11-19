@org.springframework.web.bind.annotation.ExceptionHandler(value = java.util.regex.PatternSyntaxException.class)
@org.springframework.web.bind.annotation.ResponseBody
org.springframework.http.ResponseEntity<ua.org.fits.entity.error.ErrorInfo> handleRegexExeption(javax.servlet.http.HttpServletRequest req, java.util.regex.PatternSyntaxException ex) {
    return org.springframework.http.ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ua.org.fits.entity.error.ErrorInfo(req.getRequestURI(), "regex is not true"));
}