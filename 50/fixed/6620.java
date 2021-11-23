public static java.lang.String getLastWord(java.lang.String input) {
    java.lang.String[] parts = input.trim().split("\\s+");
    java.lang.String lastWord = parts[((parts.length) - 1)];
    return lastWord;
}