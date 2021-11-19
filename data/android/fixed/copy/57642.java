public java.lang.String authorLogin() {
    return this.comment.getJsonObject("user").getString("login");
}