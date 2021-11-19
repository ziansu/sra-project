public int toRealPosition(int position) {
    int realCount = getRealCount();
    if (realCount == 0)
        return 0;
    
    return position % realCount;
}