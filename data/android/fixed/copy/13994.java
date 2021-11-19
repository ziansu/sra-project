public java.nio.file.Path unmarshal(java.lang.String s) throws java.lang.Exception {
    java.nio.file.Path path = java.nio.file.Paths.get(s);
    java.lang.System.out.println(path);
    return java.nio.file.Paths.get(s);
}