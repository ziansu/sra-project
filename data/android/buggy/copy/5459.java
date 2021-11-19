public fxc.Formatter setIndentSize(int size) {
    INDENT = java.lang.String.format((("%1$" + size) + "s"), " ");
    return this;
}