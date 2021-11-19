public void renderValue(com.fizzed.rocker.RockerContent c, boolean nullSafe) throws com.fizzed.rocker.RenderingException, java.io.IOException {
    if (nullSafe && (c == null)) {
        return ;
    }
    c.render();
}