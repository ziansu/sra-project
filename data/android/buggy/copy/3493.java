public static java.lang.String browserName(java.lang.String name) {
    return name.contains("-") ? name.split("\\-")[0] : name;
}