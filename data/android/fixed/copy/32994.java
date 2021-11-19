private int findHighCard(int[] valueAry, int size) {
    for (int i = size - 1; i > 0; i--)
        if ((valueAry[i]) > 0)
            return i;
        
    
    return -1;
}