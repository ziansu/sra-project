public int gridColumnIndexToResultSetColumnIndex(int gridColumnIndex) {
    int rsColumnIndex = gridColumnIndex;
    if (((rowStyleColumnIndex) == 0) && (gridColumnIndex >= (rowStyleColumnIndex)))
        rsColumnIndex++;
    
    return rsColumnIndex;
}