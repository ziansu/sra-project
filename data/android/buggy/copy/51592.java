protected java.lang.String getPath(java.nio.file.Path dir) {
    return stack.isEmpty() ? "" : stack.peek().getChildPath(dir.getFileName().toString());
}