@java.lang.Override
protected java.util.ArrayList<com.example.mustngo.newsp.News> doInBackground(java.lang.String... string) {
    java.lang.String n = string[0];
    try {
        return new com.example.mustngo.newsp.DomFeedParser(n).parse();
    } catch (java.lang.Throwable t) {
        return null;
    }
}