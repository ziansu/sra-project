public boolean isBlacklisted(boolean query) {
    if (query) {
        addQuery();
    }
    return (getStatus()) == (br.com.allchemistry.spf.SPF.Status.BLACK);
}