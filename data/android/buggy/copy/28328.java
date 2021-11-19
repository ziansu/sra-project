private jd.http.Browser prepBrowser(jd.http.Browser prepBr) {
    if ((jd.plugins.hoster.NowVideoEu.agent.get()) == null) {
        jd.plugins.hoster.NowVideoEu.agent.set(jd.plugins.hoster.jd.plugins.hoster.MediafireCom.stringUserAgent());
    }
    prepBr.getHeaders().put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:32.0) Gecko/20100101 Firefox/32.0");
    return prepBr;
}