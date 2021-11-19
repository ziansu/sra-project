public java.lang.Integer getPosOfIdInList(java.util.ArrayList<java.lang.Integer> l, java.lang.Integer id) {
    int pos = 0;
    for (java.lang.Integer num : l) {
        if (num.equals(id)) {
            return pos;
        }
        pos++;
    }
    return null;
}