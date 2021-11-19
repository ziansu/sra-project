public boolean isCorrect(Game g, java.lang.String in) {
    java.lang.String[] tempAns = g.getRealAnswer();
    for (java.lang.String a : tempAns) {
        if (a.equals(in))
            return true;
        
    }
    return false;
}