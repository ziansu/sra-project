public void close() {
    if (!(closed)) {
        closed = true;
        for (com.anteambulo.SeleniumJQuery.jQuery child : children) {
            child.close();
        }
    }
}