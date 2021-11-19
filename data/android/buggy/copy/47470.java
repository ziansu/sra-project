public static app.sunstreak.yourpisd.net.Session createSession(java.lang.String username, java.lang.String password) {
    if (username.equals("test"))
        return new app.sunstreak.yourpisd.net.TestSession();
    else
        return new app.sunstreak.yourpisd.net.Session(username, password);
    
}