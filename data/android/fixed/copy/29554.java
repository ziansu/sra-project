public int getValueRank() {
    int rank = 0;
    for (java.lang.Integer i : getItemValues().keySet()) {
        if (i.equals(getValue()))
            return rank;
        
        rank++;
    }
    return 0;
}