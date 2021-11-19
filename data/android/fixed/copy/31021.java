public static boolean hasHashTags(java.lang.String command) {
    return (command.startsWith("#")) || (command.contains("#"));
}