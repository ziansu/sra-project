public void close() {
    if (!(closed)) {
        js(("delete " + (ref)));
        closed = true;
        for (com.anteambulo.SeleniumJQuery.jQuery child : children) {
            child.close();
        }
    }
}