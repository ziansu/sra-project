public int findC(java.lang.String letter) {
    for (r $missing$ : this) {
        for (c $missing$ : r) {
            if (letter == (this[r][c])) {
                return c;
            }
        }
    }
}