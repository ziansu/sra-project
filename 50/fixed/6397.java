public static int positionInSet(java.lang.Integer[] set, java.lang.Integer id) {
    int index = 0;
    for (java.lang.Integer i : set) {
        if (i.equals(id)) {
            return index;
        }
        index++;
    }
    return -1;
}