public java.lang.String getUsernameFromToken(java.lang.String token) {
    try {
        final io.jsonwebtoken.Claims claims = getClaimsFromToken(token);
        return claims.getSubject();
    } catch (java.lang.Exception e) {
        return null;
    }
}