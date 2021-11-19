private java.lang.String calc(java.lang.String input) {
    java.lang.String result = "";
    for (char c : input.toCharArray()) {
        result += ((char) (1 + c));
    }
    return result;
}