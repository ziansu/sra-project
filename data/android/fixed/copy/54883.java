public int count(java.lang.String word) {
    java.lang.Integer count = yearlyRecord.get(word);
    return count == null ? 0 : count;
}