private void uriAppender(java.lang.StringBuffer path) {
    if ((path.indexOf("?")) == (-1)) {
        path.append("?");
    }else {
        path.append("&");
    }
}