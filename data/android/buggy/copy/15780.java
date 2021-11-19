protected java.lang.String formatClassPath(java.nio.file.Path first, java.nio.file.Path... others) {
    java.lang.String result = first.toString();
    for (java.nio.file.Path other : others) {
        result += (ru.yandex.qatools.allure.command.PROPERTIES.getPathSeparator()) + other;
    }
    return result;
}