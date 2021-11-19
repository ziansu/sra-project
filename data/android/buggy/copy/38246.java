@java.lang.Override
public boolean isSold(int row, int column) {
    if ((row == 1) && (column == 1)) {
        return true;
    }
    return false;
}