public void authenticate(org.apache.http.HttpRequest req) {
    org.apache.http.auth.Credentials creds = new org.apache.http.auth.UsernamePasswordCredentials(username, password);
    req.addHeader(org.apache.http.impl.auth.BasicScheme.authenticate(creds, "utf-8", false));
}