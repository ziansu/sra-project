public static java.lang.String getDllink(final jd.http.Browser br) {
    return br.getRegex("(/download\\.php\\?file=[^<>\"]+)").getMatch(0);
}