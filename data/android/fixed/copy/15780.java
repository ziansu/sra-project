protected java.lang.String formatClassPath(java.lang.String first, java.lang.String... others) {
    java.lang.String result = first;
    for (java.lang.String other : others) {
        result += (ru.yandex.qatools.allure.command.PROPERTIES.getPathSeparator()) + other;
    }
    return result;
}