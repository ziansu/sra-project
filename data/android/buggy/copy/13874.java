protected java.lang.String getSessionToken() {
    if (java.time.LocalDateTime.now().isBefore(expireTime)) {
        return token;
    }else {
        return null;
    }
}