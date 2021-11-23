public int findR(java.lang.String letter) {
    for (java.lang.String[] r : this) {
        for (java.lang.String c : r) {
            if (letter == (this[r][c])) {
                return r;
            }
        }
    }
}