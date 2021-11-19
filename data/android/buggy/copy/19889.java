public int getFalseColumnCount(int index) {
    return (getRowCount()) - (trueColumnCount[index]);
}