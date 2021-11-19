@java.lang.Override
public boolean checkAuthorizationHeader(java.util.Optional<java.lang.String> authHeader) {
    return extractToken(authHeader).map(tokenManager::verify).orElse(false);
}