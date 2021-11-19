public int countTagMatches(java.lang.String match) {
    int count = 0;
    for (java.lang.String tag : getTags()) {
        if (match.toLowerCase().contains(tag.toLowerCase()))
            count++;
        
    }
    return count;
}