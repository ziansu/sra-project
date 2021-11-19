public static org.springframework.web.servlet.support.ServletUriComponentsBuilder fromRequestUri(javax.servlet.http.HttpServletRequest request) {
    org.springframework.web.servlet.support.ServletUriComponentsBuilder builder = org.springframework.web.servlet.support.ServletUriComponentsBuilder.fromRequest(request);
    builder.replaceQuery(null);
    return builder;
}