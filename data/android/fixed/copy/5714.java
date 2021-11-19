private void RenewAccessToken() {
    java.lang.String newAccessToken = HttpPost(ai_project.speech.common.Authentication.AccessTokenUri, this.apiKey);
    java.lang.System.out.println(("new access token: " + newAccessToken));
    this.accessToken = newAccessToken;
}