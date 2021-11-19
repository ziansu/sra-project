protected java.lang.String node2Text(org.jsoup.nodes.Element el) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder(200);
    appendTextSkipHidden(el, sb, 0);
    return sb.toString();
}