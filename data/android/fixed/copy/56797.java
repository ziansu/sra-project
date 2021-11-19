public java.lang.Integer getScore() {
    if ((lastScore) != null) {
        return ((lastScore) * 100) / (questionsCount);
    }else {
        return null;
    }
}