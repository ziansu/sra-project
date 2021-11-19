private java.lang.String cleanUpString(java.lang.String searchWord) {
    searchWord.trim();
    while (searchWord.contains(" ")) {
        searchWord.replace(" ", "+");
    } 
    return searchWord;
}