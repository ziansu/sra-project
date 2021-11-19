public boolean addWord(java.lang.String word) {
    java.lang.String toAdd = word.toLowerCase();
    if (dict.contains(toAdd))
        return false;
    
    dict.add(toAdd);
    return true;
}