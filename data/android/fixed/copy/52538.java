private org.woehlke.twitterwall.oodm.entities.Url getUrl(java.lang.String urlString, org.woehlke.twitterwall.oodm.entities.Task task) {
    java.lang.String display = "";
    java.lang.String expanded = "";
    org.woehlke.twitterwall.oodm.entities.Url newUrl = new org.woehlke.twitterwall.oodm.entities.Url(task, null, display, expanded, urlString);
    return newUrl;
}