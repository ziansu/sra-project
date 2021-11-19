public static java.lang.String getLastWord(java.lang.String input) {
    java.lang.String[] parts = input.split("\\s+");
    java.lang.String lastWord = parts[((parts.length) - 1)];
    return lastWord;
}