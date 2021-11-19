public void nextBorder() {
    if ((currentCost) != (java.lang.Integer.MAX_VALUE)) {
        costsToBorder.add(currentCost);
        (numberOfBorders)++;
    }else {
        numberOfBorders = 0;
    }
    currentCost = java.lang.Integer.MAX_VALUE;
}