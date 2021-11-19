private io.github.likcoras.agar.auth.AuthLevel getLevel(java.lang.String message) {
    int status = java.lang.Integer.parseInt(message.substring(((message.length()) - 1)));
    return status > 1 ? level : AuthLevel.USER;
}