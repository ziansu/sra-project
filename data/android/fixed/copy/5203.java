public int getConfusionCount(java.lang.String error, java.lang.String correct) {
    java.lang.Integer count = confusionMatrix.get(((error + "|") + correct));
    count = (count == null) ? 0 : count;
    return count + 1;
}