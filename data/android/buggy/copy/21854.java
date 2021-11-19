private java.lang.String readStdin() {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
    return reader.lines().collect(java.util.stream.Collectors.joining());
}