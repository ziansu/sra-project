public java.util.List<java.util.List<java.lang.String>> getKeywordList(java.lang.String courseName, java.lang.String year) {
    keywordList = doRelationByScope(courseName, year);
    return keywordList;
}