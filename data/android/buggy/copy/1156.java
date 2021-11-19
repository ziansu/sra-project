void addCookies(int pos, java.util.List<javax.servlet.http.Cookie> cookies) {
    if (cookies == null) {
        cookies = new java.util.LinkedList<javax.servlet.http.Cookie>();
    }
    cookies.addAll(pos, cookies);
}