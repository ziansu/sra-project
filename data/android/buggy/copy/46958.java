public boolean isWord(java.lang.String s) {
    java.lang.String toCheck = s.toLowerCase();
    return dict.contains(toCheck);
}