private int isPair(int[] valueAry, int size) {
    for (int i = size - 1; i > 0; i--)
        if ((valueAry[i]) == 2)
            return i;
        
    
    return -1;
}