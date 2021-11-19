java.lang.String getLogin() throws java.io.IOException {
    java.lang.String login = in.readLine();
    out.println("#ok");
    return login;
}