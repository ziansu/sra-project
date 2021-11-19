@org.jetbrains.annotations.NotNull
protected java.lang.String formatClassPath(@org.jetbrains.annotations.NotNull
java.nio.file.Path first, @org.jetbrains.annotations.NotNull
java.nio.file.Path... others) {
    java.lang.String result = first.toString();
    for (java.nio.file.Path other : others) {
        result += (getClassPathSeparator()) + other;
    }
    return result;
}