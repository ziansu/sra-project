void setStatus(java.lang.String format, java.lang.Object... arguments) {
    java.lang.String s = java.lang.String.format(format, arguments);
    java.lang.System.out.printf("%s: %s\n", this.getName(), s);
}